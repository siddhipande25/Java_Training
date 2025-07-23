import java.util.*;

public class A236 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String newName="";
        StringBuilder sb = new StringBuilder(name);

        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                    j--;}
            }
        }
        String res=sb.toString();

        if(res.length() % 2 == 0){
            newName = "CHAT WITH HER!";
        } else {
            newName = "IGNORE HIM!";
        }
        System.out.println(newName);
    }
}