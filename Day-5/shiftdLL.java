import java.util.*;
class shiftdLL{
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
    shiftdLL(){
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
    
    void left(int r) {
       
        if (r == 0) {
            return;
        }
        
        tail.next = head;
        head.prev = tail;
        for (int i = 0; i < r; i++) {
            head = head.next;
        }
        tail = head.prev;
        head.prev = null;
        tail.next = null;
    }
    void right(int r) {
       
        if (r == 0) {
            return;
        }
        
        tail.next = head;
        head.prev = tail;
        for (int i = 0; i < r; i++) {
            tail = tail.prev;
        }
        head = tail.next;
        head.prev = null;
        tail.next = null;
    }

    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        shiftdLL s=new shiftdLL();
     shiftdLL s1=new shiftdLL();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements");
        int n=sc.nextInt();
        if(n>0){
             System.out.println("Enter the element:");
            for(int i=1;i<=n;i++){
           
            int data=sc.nextInt();
            s.insert(data);
            s1.insert(data);
        }
        }
        s.display();

        System.out.println("\nEnter the number of rotations:");
        int r = sc.nextInt();

        s.left(r);
        

        System.out.println("\nList after " + r + " left rotations:");
        s.display();
        
        s1.right(r);
        System.out.println("\nList after " + r + " right rotations:");
        s1.display();
    }
}