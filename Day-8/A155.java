import java.util.Scanner;

public class A155 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(0);
            return;
        }
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long minScore = arr[0];
        long maxScore = arr[0];
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxScore) {
                count++;
                maxScore = arr[i]; 
            } else if (arr[i] < minScore) {
               
                count++;
                minScore = arr[i]; 
            }
        }

        System.out.println(count);
       
    }
}