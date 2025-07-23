import java.util.*;

public class A141 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine().toUpperCase();

        String name=(a.concat(b)).toUpperCase();

        if(asc(name).equals(asc(c))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static String asc(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

}