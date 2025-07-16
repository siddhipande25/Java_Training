public class magic{
    public static void main(String[] args) {
        int n = 19; 
        int sum = n;

        while (sum >= 10) {
            int temp = sum;
            sum = 0;

            while (temp > 0) {
                sum += temp % 10; 
                temp /= 10; 
            }
        }

        if (sum == 1) {
            System.out.println(n + " is a magic number.");
        } else {
            System.out.println(n + " is not a magic number.");
        }
    }
}