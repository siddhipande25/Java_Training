// import java.util.*;

// class stackdLL {
  
//      private class Node {
//         int data;
//         Node next;
//         Node prev;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

    
//     private Node top;

   
//     public stackdLL() {
//         this.top = null;
//     }
//     public void push(int data) {
//         Node newNode = new Node(data);
//         if (isEmpty()) {
            
//             top = newNode;
//         } else {
          
//             top.next = newNode;
//             newNode.prev = top;
//             top = newNode;
//         }
//         System.out.println(data + " pushed to stack.");
//     }

//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack Underflow: Cannot pop from an empty stack.");
//             return -1; 
//         }
        
//         int poppedData = top.data;
//         top = top.prev; 
        
//         if (top != null) {
//             top.next = null;
//         }
        
//         System.out.println(poppedData + " popped from stack.");
//         return poppedData;
//     }

//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty.");
//             return -1;
//         }
//         return top.data;
//     }

  
//     public boolean isEmpty() {
//         return top == null;
//     }

   
//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty.");
//             return;
//         }
//         System.out.print("Stack (Top to Bottom): ");
//         Node current = top;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.prev; 
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         stackdLL stack = new stackdLL();
        
//         while (true) {
//             System.out.println("\n--- Stack Menu ---");
//             System.out.println("1. Push");
//             System.out.println("2. Pop");
//             System.out.println("3. Peek");
//             System.out.println("4. Display");
//             System.out.println("5. Exit");
//             System.out.print("Choose an option: ");
            
//             int choice = sc.nextInt();
            
//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter value to push: ");
//                     stack.push(sc.nextInt());
//                     break;
//                 case 2:
//                     stack.pop();
//                     break;
//                 case 3:
//                     int topElement = stack.peek();
//                     if (topElement != -1) {
//                         System.out.println("Top element is: " + topElement);
//                     }
//                     break;
//                 case 4:
//                     stack.display();
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//     }
// }

import java.util.*;
class stackdLL{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next,prev;
        Node(int d){
            this.data=d;
            this.next=null;
            this.prev=null;
        }
        
    }
    stackdLL(){
            this.head=null;
            this.tail=null;
    }

    void push(int data){
        Node newnode=new Node(data);
        if(head== null){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    void pop(){
        if(head.next == null){

            head=null;
            tail=null;

        }else if(tail.next == null ){
            tail=tail.prev;
            tail.next=null;
        }else{
            Node current=tail;
            while(current.prev !=null ){
                current=current.prev;

            }

         current.prev=current.prev.prev;
            current.prev.next=current;
            
        }
        
       
    }
    void display(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }
    public static void main(String[] args) {
        stackdLL list = new stackdLL();
        list.push(10);
        list.push(20);
        list.push(30);

        list.display();
        list.pop();
        System.out.println("\nAfter deletion:");
        list.display();
        
    }
}