//the number is a Kaprekar number if the square of the number can be split into two parts such that the sum of those two parts equals the original number


//The number is a Kaprekar number if the square of the number can be split into two parts that add up to the original number
import java.util.Scanner;   

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = sc.nextInt();
        int square = num * num;
        int rightPart=0;
        int leftPart=0;
        int len=0;

        while(square>0){
            int digit=square%10;
            len++;
            square=square/10;
        }
        System.out.println("Count: "+len);

        if(len%2==0){
            rightPart=square % (int)Math.pow(10, len);
            leftPart=square / (int)Math.pow(10, len);
        }else{
            rightPart=square % (int)Math.pow(10, len/2 + 1);
            leftPart=square / (int)Math.pow(10, len/2 + 1);
        }
       
        if (leftPart + rightPart == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    //     String squareStr = String.valueOf(square);
    //     int len = squareStr.length();
    //     int leftPart = 0, rightPart = 0;

    //     if (len == 1) {
    //         rightPart = square;
    //     } else {
    //         rightPart = Integer.parseInt(squareStr.substring(len / 2));
            
    //         leftPart = Integer.parseInt(squareStr.substring(0, len / 2));
            
    //     }
    //     if (leftPart + rightPart == num) {
    //         System.out.println(num + " is a Kaprekar number.");
    //     } else {
    //         System.out.println(num + " is not a Kaprekar number.");
    // }
}
}