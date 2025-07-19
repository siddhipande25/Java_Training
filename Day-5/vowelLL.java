import java.util.*;
class vowelLL{
    Node head;
    class Node{
        char data;
        Node next;

        Node(char d){
            this.data = d;
            this.next = null;
        }
    }
    vowelLL(){
        this.head=null;
    }
     void insert(char data){
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
        System.out.println("Enter a string:");
        String name = sc.nextLine();
        vowelLL list = new vowelLL();
        String vowels = "aeiouAEIOU";
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            
            if (vowels.indexOf(ch) == -1) {
                list.insert(ch);
            }
        }
        System.out.println("The list is: ");
        list.display();
    }

}