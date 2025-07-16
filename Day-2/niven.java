public class niven{
    public static void main(String[] args) {
        int n = 18; 
        int sumOfDigits = 0;
        int original = n;

       
        while (n > 0) {
            sumOfDigits += n % 10; 
            n /= 10; 
        }

        
        if (original % sumOfDigits == 0) {
            System.out.println(original + " is a Niven number.");
        } else {
            System.out.println(original + " is not a Niven number.");
        }
    }

}