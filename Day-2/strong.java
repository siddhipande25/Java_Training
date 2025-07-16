// The number is a strong number if the sum of the factorials of its digits equals the number itself
public class strong{
    public static void main(String args[]){
        int n = 145; 
        int sum = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10; 
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i; 
            }
            sum += factorial; 
            n = n / 10; 
        }

        if (original == sum) {
            System.out.println(original + " is a strong number.");
        } else {
            System.out.println(original + " is not a strong number.");
        }
    }
}