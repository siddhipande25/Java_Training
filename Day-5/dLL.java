import java.util.*;
class dLL{
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
    dLL(){
            this.head=null;
            this.tail=null;
    }

    void insert(int data){
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
    void delete(int d){
        if(head.data == d && head.next == null){

            head=null;
            tail=null;

        }else if(tail.data ==d ){
            tail=tail.prev;
            tail.next=null;
        }else{
            Node current=head;
            while(current.next !=null && current.next.data != d){
                current=current.next;

            }

         current.next=current.next.next;
            current.next.prev=current;
            
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
        dLL list = new dLL();
        list.insert(10);
        // list.insert(20);
        // list.insert(30);

        list.display();
        list.delete(10);
        System.out.println("\nAfter deletion:");
        list.display();
        
    }
}