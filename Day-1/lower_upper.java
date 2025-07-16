public class lower_upper{
    public static void main(String args[]){
        String str = "sidDhI";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
        
            if(ch >= 'A' && ch <= 'Z'){
                System.out.print(Character.toLowerCase(ch)+" ");
            } else if(ch >= 'a' && ch <= 'z'){
                System.out.print(Character.toUpperCase(ch)+" ");
            } else {
                System.out.println("Not an alphabetic character: " + ch);
            }
}
}
}