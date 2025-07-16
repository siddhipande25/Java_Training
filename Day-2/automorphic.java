public class automorphic {
    public static void main(String[] args) {
        int n = 25; 
        int square = n * n; 
        int lastDigits = square % (int) Math.pow(10, String.valueOf(n).length()); 

        if (lastDigits == n) {
            System.out.println(n + " is an automorphic number.");
        } else {
            System.out.println(n + " is not an automorphic number.");
        }
    }
}