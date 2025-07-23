// Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

// Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

// Input
// The first line contains a single integer x (1 ≤ x ≤ 1018) — the number that Luke Skywalker gave to Chewbacca.

// Output
// Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

// Examples
// InputCopy
// 27
// OutputCopy
// 22
// InputCopy
// 4545
// OutputCopy
// 4444


import java.util.Scanner;

public class A514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberAsString = sc.next();
        char[] digits = numberAsString.toCharArray();

        for (int i = 0; i < digits.length; i++) {

            char digitChar = digits[i];

            int digit = digitChar - '0';
            int invertedDigit = 9 - digit;

            if (i == 0 && digit == 9) {
                continue; 
            }
            if (invertedDigit < digit) {
                digits[i] = (char) (invertedDigit + '0');
            }
        }

        System.out.println(digits);

    }
}