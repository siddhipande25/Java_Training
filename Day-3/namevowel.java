

import java.util.Scanner;
public class namevowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        int len = name.length();

        if (len < 3 || len > 15) {
            System.out.println("Invalid name length. It should be between 3 and 15 characters.");
        } else {
            char[] arr = name.toCharArray();   
            char[] vowels = new char[len];     
            int vCount = 0;

           
            for (int i = 0; i < len; i++) {
                char ch = arr[i];
                if (isVowel(ch)) {
                    vowels[vCount++] = ch;  
                }
            }

            
            int k = vCount - 1;  
            for (int i = 0; i < len; i++) {
                if (isVowel(arr[i])) {
                    arr[i] = vowels[k--];  
                }
            }

            System.out.println("Name after reversing vowels:");
            System.out.println(new String(arr));
        }
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
