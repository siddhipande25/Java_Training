//The number is duck number if it has 0 in it but not at the start

public class duck {
    public static void main(String args[]) {
        int n = 023; 
        boolean isDuck = false;
        String numberStr = Integer.toString(n);
       
        if (numberStr.contains("0") && numberStr.charAt(0) != '0') {
            isDuck = true;
        }


        if (isDuck) {
            System.out.println("It is a Duck number.");
        } else {
            System.out.println("It is not a Duck number.");
        }
    }
}