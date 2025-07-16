//The number is adam number if the reverse of the square of original number is equal to the square of the reverse of the original number

public class adam {
    public static void main(String[] args) {
        int n = 12; 
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        int squareOriginal = original * original;
        int squareReverse = reverse * reverse;

        int reverseSquareOriginal = 0;
        while (squareOriginal > 0) {
            int digit = squareOriginal % 10;
            reverseSquareOriginal = reverseSquareOriginal * 10 + digit;
            squareOriginal /= 10;
        }

        if (reverseSquareOriginal == squareReverse) {
            System.out.println(original + " is an Adam number.");
        } else {
            System.out.println(original + " is not an Adam number.");
        }
    }
}