import java.util.Scanner;
public class mobileno{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mobile number:");
        long mn = sc.nextLong();
        long len = length(mn);
        if (len != 10) {
            System.out.println("Invalid mobile number. It should be 10 digits long.");
        } else {
            long firstDigit = mn / 1000000000L;
            if (firstDigit < 7 || firstDigit > 9) {
                System.out.println("Invalid mobile number. It should start with 7, 8, or 9.");
            } else {
                System.out.println("Valid mobile number.");
            }
        }
        
    }
    public static int length(long mn) {
        int count = 0;
        while (mn != 0) {
            mn /= 10;
            count++;
        }
        return count;
    }

   

   
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a mobile number:");
    
        // String mn = sc.nextLine();

      
        // String regex = "[789][0-9]{9}";

        // if (mn.matches(regex)) {
        //     System.out.println("Valid mobile number.");
        // } else {
        //     System.out.println("Invalid mobile number. It must be 10 digits long and start with 7, 8, or 9.");
        // }
        
        
}