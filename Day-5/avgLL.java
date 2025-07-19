//program to find the average of all elements in a linked list
import java.util.*;
class avgLL{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    avgLL(){
        this.head=null;
    }

    void insert(int data){
        Node n=new Node(data);

        if(head==null){
            head=n;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=n;
        }
    }
    
    void findAvg(){
        if(head==null){
            System.out.println("List is empty");
            
        }    
        else{
            Node current=head;
            int sum=0;
            int count=0;
            while(current!=null){
                sum=sum+current.data;
                count++;
                current=current.next;

            }
            float avg=(float)sum/count;
            System.out.println("Average of all elements in the linked list is: " + avg);
            }
        }
    
    public static void main(String[] args) {
        avgLL m=new avgLL();
        m.insert(10);
        m.insert(25);
        m.findAvg();

    }
}