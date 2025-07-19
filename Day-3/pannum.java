import java.util.Scanner;
public class pannum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a PAN number:");
        String pan = sc.nextLine();
        // String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        // if (pan.matches(regex)) {
        //     System.out.println("Valid PAN number.");
        // } else {
        //     System.out.println("Invalid PAN number. It should be in the format: 5 uppercase letters, followed by 4 digits, and ending with 1 uppercase letter.");
        // }
        int len= pan.length();
        if(len != 10) {
            System.out.println("Invalid PAN number. It should be exactly 10 characters long.");
        } else {
            boolean isValid = true;
            for (int i = 0; i < pan.length(); i++) {
                char ch = pan.charAt(i);
                int ascii = (int) ch;
                if (i < 5) {
                    if (!(ascii >= 65 && ascii <= 90)) {
                        isValid = false;
                        break;
                    }
                } else if (i < 9) {
                    if (!(ascii >= 48 && ascii <= 57)) {
                        isValid = false;
                        break;
                    }
                } else {
                    if (!(ascii >= 65 && ascii <= 90)) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                System.out.println("Valid PAN number.");
            } else {
                System.out.println("Invalid PAN number. It should be in the format: 5 uppercase letters, followed by 4 digits, and ending with 1 uppercase letter.");
            }
        }

 

        // if (pan.length() != 10) {
        //     isPan = false;
        // } else {
        //     for (int i = 0; i < 5; i++) {
        //         char ch = pan.charAt(i);
        //         if (ch < 'A' || ch > 'Z') {  
        //             isPan = false;
        //             break;
        //         }
        //     }
            
        //     for (int i = 5; i < 9; i++) {
        //         char ch = pan.charAt(i);
        //         if (ch < '0' || ch > '9') {  
        //             isPan = false;
        //             break;
        //         }
        //     }
            
        //     char lastChar = pan.charAt(9);
        //     if (lastChar < 'A' || lastChar > 'Z') {  
        //         isPan = false;
        //     }
        // }

        // if (isPan) {
        //     System.out.println("Valid PAN number");
        // } else {
        //     System.out.println("Invalid PAN number");
        // }

    }
}
