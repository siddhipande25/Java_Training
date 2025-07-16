//Sum and product of digits in a number is same then it is a spy number

public class spy{
    public static void main(String args[]){
        int n = 1124; 
        int sum=0;
        int mod=1;
       
        
        while (n > 0) {
            int digit = n % 10; 
            sum += digit; 
            mod *= digit; 
            n = n / 10; 
        }

        if (sum == mod) {
            System.out.println("The number is a spy number.");
        } else {
            System.out.println("The number is not a spy number.");
        }
    }
}