import java.util.*;
class LL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    LL(){
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
    void insertAtBeginning(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }
    void insrtAtMiddle(int data, int position){
        Node newnode =new Node(data);
        if( head == null || position == 0){
            newnode.next = head;
            head = newnode;
        }else{
            Node current = head;
            for(int i=0; i<position-1 && current!=null; i++){
                current = current.next;
            }
            if(current != null){
                newnode.next = current.next;
                current.next = newnode;
            }else{
                System.out.println("Position out of bounds");
            }
        }
    }
    void delete(int data){
        if(head == null){
            System.out.println("List is empty");
        }else if(head.data ==data)
        {
            head = head.next;
        }else{
            Node current = head;
            while(current.next != null && current.next.data != data){
                current = current.next;
            }
            if(current.next == null){
                System.out.println("Element not found");
            }else{
                current.next = current.next.next;
            }
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
        LL llist = new LL();
        llist.insert(15);
        llist.insrtAtMiddle(4,0);
        llist.insert(10);
        llist.insert(20);   
        llist.insert(30);
        llist.insrtAtMiddle(25, 2);
        llist.insertAtBeginning(5);
        llist.insert(40);
        llist.delete(10);
        llist.insert(50);
        System.out.println("Linked List:");
        llist.display();
        System.out.println();
    }
}