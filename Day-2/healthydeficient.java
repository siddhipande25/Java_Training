public class healthydeficient{
    public static void main(String[] args) {
        int n = 12; 
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else if (sum < n) {
            System.out.println(n + " is a deficient number.");
        } else {
            System.out.println(n + " is an healthy number.");
        }
    }
}