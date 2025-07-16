public class emirp {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
    
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        // If no factors were found, the number is prime.
        return true;
    }

    /**
     * Reverses the digits of an integer using arithmetic operations.
     * @param n The number to reverse.
     * @return The reversed number.
     */
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit;
            n /= 10; // Remove the last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n = 13; // The number to check

        int reversedN = reverseNumber(n);

        // An emirp number has three conditions:
        // 1. It must be a prime number.
        // 2. Its reverse must also be a prime number.
        // 3. It must not be a palindromic prime (e.g., 11, 101).
        if (n != reversedN && isPrime(n) && isPrime(reversedN)) {
            System.out.println(n + " is an emirp number.");
        } else {
            System.out.println(n + " is not an emirp number.");
        }

        // --- Another example ---
        int n2 = 79;
        int reversedN2 = reverseNumber(n2);
        if (n2 != reversedN2 && isPrime(n2) && isPrime(reversedN2)) {
            System.out.println(n2 + " is an emirp number because its reverse, " + reversedN2 + ", is also prime.");
        } else {
            System.out.println(n2 + " is not an emirp number.");
        }
    }
}