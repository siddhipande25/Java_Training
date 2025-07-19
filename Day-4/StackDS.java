package Day4;

public class StackDS {
    int[] arr;
    int top;

    public StackDS(int size){
        arr=new int[size];
        top=-1;
    }

    void push(int n){
        if(top==arr.length-1){
            System.out.println("Stack overflow");
        }else{
            arr[++top]=n;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
            top--;
        }
    }

    void peek(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
            System.out.println("\n"+arr[top]);
        }
    }

    void display(){
        for(int n:arr){
            System.out.print(n+" ");
        }
    }

    public static void main(String args[]){
        StackDS s=new StackDS(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.peek();
        s.display();
        s.pop();
        s.peek();
        s.display();
    }
}

