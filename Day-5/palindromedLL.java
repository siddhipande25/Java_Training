import java.util.*;
class palindromedLL{
    Node head;
    Node tail;
    class Node{
        char data;
        Node next,prev;
        Node(char d){
            this.data=d;
            this.next=null;
            this.prev=null;
        }
    }
    palindromedLL(){
        this.head=null;
        this.tail=null;
    }
    void insert(char data){
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
    public  String display(){
        Node current = tail;
        String s="";
        while(current != null){
            s+=current.data;
            current = current.prev;

        }
        return s;
        
        
    }

    public static void main(String args[]){
        palindromedLL l=new palindromedLL();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter to check palindrome:");
        String a=sc.next();
        for(int i=0;i<a.length();i++){
            l.insert(a.charAt(i));
        }
        String str= l.display();
        if(a.equals(str)){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not a palindrome");
        }


    }
}