public class Name {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print S
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || (i < 3 && j == 1) || (i > 3 && j == 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Print I
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Print D
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (j == 5 && i != 1 && i != 5) || (i == 1 || i == 5) && j < 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Print D 
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (j == 5 && i != 1 && i != 5) || (i == 1 || i == 5) && j < 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Print H
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Print I 
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
