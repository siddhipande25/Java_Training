// What joy! Petya's parents went on a business trip for the whole year and the playful kid is left all by himself. Petya got absolutely happy. He jumped on the bed and threw pillows all day long, until...

// Today Petya opened the cupboard and found a scary note there. His parents had left him with duties: he should water their favourite flower all year, each day, in the morning, in the afternoon and in the evening. "Wait a second!" — thought Petya. He know for a fact that if he fulfills the parents' task in the i-th (1 ≤ i ≤ 12) month of the year, then the flower will grow by ai centimeters, and if he doesn't water the flower in the i-th month, then the flower won't grow this month. Petya also knows that try as he might, his parents won't believe that he has been watering the flower if it grows strictly less than by k centimeters.

// Help Petya choose the minimum number of months when he will water the flower, given that the flower should grow no less than by k centimeters.

// Input
// The first line contains exactly one integer k (0 ≤ k ≤ 100). The next line contains twelve space-separated integers: the i-th (1 ≤ i ≤ 12) number in the line represents ai (0 ≤ ai ≤ 100).

// Output
// Print the only integer — the minimum number of months when Petya has to water the flower so that the flower grows no less than by k centimeters. If the flower can't grow by k centimeters in a year, print -1.

// Examples
// InputCopy
// 5
// 1 1 1 1 2 2 3 2 2 1 1 1
// OutputCopy
// 2
// InputCopy
// 0
// 0 0 0 0 0 0 0 1 1 2 3 0
// OutputCopy
// 0
// InputCopy
// 11
// 1 1 4 1 1 5 1 1 4 1 1 1
// OutputCopy
// 3
// Note
// Let's consider the first sample test. There it is enough to water the flower during the seventh and the ninth month. Then the flower grows by exactly five centimeters.

// In the second sample Petya's parents will believe him even if the flower doesn't grow at all (k = 0). So, it is possible for Petya not to water the flower at all.




import java.util.*;

public class A149 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        int n=12;
        int[] arr = new int[n];
        int total=0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            total+= arr[i];
        }

        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        if(k==0){
            System.out.println(0);
            return;
        }else if(k>total){
            System.out.println("-1");
            return;
        }
        else{
            for(int i=n-1;i>=0;i--){
                sum += arr[i];
                count++;
                if(sum>=k){
                    break;
                }
            }

            System.out.println(count);
        }
    }
}