//The number is an Armstrong number if the sum of its digits raised to the power of the number of digits equals the number itself

public class armstrong {
    public static void main(String args[]) {
        int n = 153; 
        int original = n;
        int sum = 0;
      
        while (n > 0) {
            int digit = n % 10; 
            sum += Math.pow(digit, 3); 
            n = n / 10; 
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}