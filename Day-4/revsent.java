//reverse a sentence without using split method

public class revsent {
    char[] arr;
    int top;

    public revsent(int size){
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

    public static void main(String args[]) {
        String sent = "Hello World";
        revsent wordStack = new revsent(sent.length());
        revsent charStack = new revsent(sent.length());
        
        for(int i = 0; i < sent.length(); i++) {
            if(sent.charAt(i) == ' ') {
                while(charStack.top != -1) {
                    wordStack.push(charStack.peek());
                    charStack.pop();
                }
                wordStack.push(' '); 
            } else {
                charStack.push(sent.charAt(i));
            }
        }
        
        while(charStack.top != -1) {
            wordStack.push(charStack.peek());
            charStack.pop();
        }
        
        String reversed = "";
        while(wordStack.top != -1) {
            reversed += wordStack.peek();
            wordStack.pop();
        }
        
        System.out.println("Original: " + sent);
        System.out.println("Reversed: " + reversed);
    }
}
