// Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given n numbers differs from the others. Bob observed that one number usually differs from the others in evenness. Help Bob — to check his answers, he needs a program that among the given n numbers finds one that is different in evenness.

// Input
// The first line contains integer n (3 ≤ n ≤ 100) — amount of numbers in the task. The second line contains n space-separated natural numbers, not exceeding 100. It is guaranteed, that exactly one of these numbers differs from the others in evenness.

// Output
// Output index of number that differs from the others in evenness. Numbers are numbered from 1 in the input order.

// Examples
// InputCopy
// 5
// 2 4 7 8 10
// OutputCopy
// 3
// InputCopy
// 4
// 1 2 1 1
// OutputCopy
// 2

//25A

import java.util.Scanner;

public class A25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        if(evenCount > oddCount) {
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 != 0) {
                    System.out.print(i+1);
                }
            }
        }else if(oddCount > evenCount) {
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 == 0) {
                    System.out.print(i+1);
                }
            }
        } 
    }
}