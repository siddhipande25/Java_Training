//89 ==> 8^1+9^2 = 8 + 81 = 89
//The number is a Disarium number if the sum of its digits raised to their respective positions

public class disarium {
    public static void main(String args[]) {
        int n=89;

        int sum = 0;
        int original = n;
        int count = 1; 
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        while (reverse > 0) {
            int digit = reverse % 10; 
            sum += Math.pow(digit, count); 
            reverse = reverse / 10; 
            count++; 
        }
        if (original == sum) {
            System.out.println(original + " is a Disarium number.");
        } else {
            System.out.println(original + " is not a Disarium number.");
        }

        
    }
}