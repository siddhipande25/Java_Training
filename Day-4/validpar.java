//check for valid parenthesis using stack data structure

package Day4;

import java.util.Stack;

public class validpar {

    char[] arr;
    int top;

    public validpar(int size){
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
    public static void main(String[] args) {
        String s = "({[]})";

        validpar st = new validpar(s.length());

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(st.peek()=='(' && s.charAt(i)==')' || st.peek()=='[' && s.charAt(i)==']' || st.peek()=='{' && s.charAt(i)=='}'){
                    st.pop();
                }else{
                    System.out.println("Not valid parenthesis");
                    break;
                }
            }
            if(st.top==-1){
                System.out.println("Valid parenthesis");
            }
        }
        
    }
}
