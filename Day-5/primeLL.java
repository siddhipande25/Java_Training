import java.util.*;
class primeLL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    primeLL(){
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
        primeLL list = new primeLL();
        for(int i=1; i<num; i++){
            
            boolean isPrime = true;
            if(i < 2) {
                isPrime = false;
            } else {
                for(int j=2; Math.pow(j,2)<=i; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                list.insert(i); 
            }
        }
        System.out.println("The prime numbers list is: ");
        list.display();
       
    }

}