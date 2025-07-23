// "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

// A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

// Input
// The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

// The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

// Output
// Output the number of participants who advance to the next round.

// Examples
// InputCopy
// 8 5
// 10 9 8 7 7 7 5 5
// OutputCopy
// 6
// InputCopy
// 4 2
// 0 0 0 0
// OutputCopy
// 0
// 158A


import java.util.Scanner;
class A158{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=arr[k-1];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=t && arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}










// import java.util.*;
// public class Main {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int ele = arr[k-1];
//         int count = 0;

//         for(int num : arr){
//             if(num >= ele && num > 0){
//                 count++;
//             }
//         }
        
//         System.out.println(count);
//         sc.close();
//     }
// }




















