public class Prachi {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){

            // P
            for(int j=1; j<=5; j++){
                if(i==1 || i==3 || j==1 || (i==2 && j==5)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // R
            for(int j=1; j<=5; j++){
                if(i==1 || i==3 || j==1 || (i==2 && j==5) || (i-j==2 && i>=4)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // A
            for(int j=1; j<=5; j++){
                if(i==1 || j==1 || j==5 || i==3){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // C
            for(int j=1; j<=5; j++){
                if(i==1 || i==5 || j==1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // H
            for(int j=1; j<=5; j++){
                if(j==1 || j==5 || i==3){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // I
            for(int j=1; j<=5; j++){
                if(i==1 || i==5 || j==3){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
