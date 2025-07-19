import java.util.*;
class evenoddLL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    evenoddLL(){
        this.head=null;
    }
     void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head= newnode;
        }else{
            Node current =head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode; 
        }

    }
    
    void display(){
       
        if(head == null){
            System.out.println("List is empty");
        
        }else{
             Node current =head;
            while(current != null){
                System.out.print(current.data+" ");
                current =current.next;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int num = sc.nextInt();
        evenoddLL even = new evenoddLL();
        evenoddLL odd = new evenoddLL();

        for(int i=0; i<num; i++){
           
            if(i % 2 == 0) {
                even.insert(i); 
            }
            else {
                odd.insert(i); 
            }

        }
        System.out.println("The even numbers list is: " );
        even.display();
        
        System.out.println(" \n The odd numbers list is: ");
        odd.display();
   
       
    }

}