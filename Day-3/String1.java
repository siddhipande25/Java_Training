import java.util.*;
public class String1{
    public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a string:");
    //     String str = sc.nextLine();
    //     int length = str.length();
    //     if(length < 8 && length > 15) {
    //         System.out.println("String length should be between 8 and 15 characters.");
    //     }else{
    //         boolean isspecial = false;
    //         for(int i = 0; i < str.length(); i++) {
    //             char ch = str.charAt(i);
    //             int ascii = (int) ch;
    //             if(ascii >= 32 && ascii <= 126) {
    //                 isspecial = true;
    //             }  
    //         }
    //         if(isspecial) {
    //             System.out.println("String is valid.");
    //         } else {
    //             System.out.println("String is invalid. It should contain special characters.");
    //         }
            
    //     }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int len=str.length();

        if(len < 8 || len > 15) {
            System.out.println("The string is not a special string");
        }else{
            boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
            
            for(int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                int ascii = (int) ch;
                
                if(ascii >= 97 && ascii <= 122) {  
                    hasLower = true;
                } else if(ascii >= 65 && ascii <= 90) {  
                    hasUpper = true;
                } else if(ascii >= 48 && ascii <= 57) {  
                    hasDigit = true;
                } else if((ascii >= 33 && ascii <= 47) ||   
                        (ascii >= 58 && ascii <= 64) || 
                        (ascii >= 91 && ascii <= 96) || 
                        (ascii >= 123 && ascii <= 126)) {
                    hasSpecial = true;
                }
            }

            if(hasLower && hasUpper && hasDigit && hasSpecial) {
                System.out.println("The string is a special string.");
            } else {
                System.out.println("The string is not a special string.");
            }
        }
        
    }
}
