package Day4;
import java.util.*;
public class stacknamerev {
    char[] arr;
    int top;

    public stacknamerev(int size){
        arr=new char[size];
        top=-1;
    }

    void push(char n){
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

    char peek(){
        if(top==-1){
            return ' ';
        }else{
            return arr[top];
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.next();

        stacknamerev s=new stacknamerev(name.length());

        for(int i=0;i<name.length();i++){
            s.push(name.charAt(i));
        }

        String rev="";
        while(s.top!=-1){
            rev+=s.peek();
            s.pop();
        }

        System.out.println(rev);
        
    }
}
