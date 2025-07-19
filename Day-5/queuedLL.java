import java.util.*;
class queuedLL{
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
    queuedLL(){
            this.head=null;
            this.tail=null;
    }

    void enqueue(int data){
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
    void dequeue(){
        if(head.next == null){

            head=null;
            tail=null;

        }else if(head.prev == null ){
            head=head.next;
            head.prev=null;
        }else{
            Node current=head;
            while(current.next !=null ){
                current=current.next;

            }

         current.next=current.next.next;
            current.next.prev=current;
            
        }
        
       
    }
    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        queuedLL list = new queuedLL();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);

        list.display();
        list.dequeue();
        System.out.println("\nAfter deletion:");
        list.display();
        
    }
}