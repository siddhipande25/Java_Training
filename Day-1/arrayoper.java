import java.util.*;

public class arrayoper {
    public static void main(String args[]) {
        int arr[] = new int[5]; 

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Array Operations Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert(arr, sc);
                    break;
                case 2:
                    delete(arr, sc);
                    break;
                case 3:
                    display(arr);
                    break;
                case 4:
                    update(arr, sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void insert(int[] arr, Scanner sc) {
        System.out.println("Enter the element to insert:");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = element;
                System.out.println("Element inserted.");
                return;
            }
        }
        System.out.println("Array is full. Cannot insert."); 
    }

    public static void delete(int[] arr, Scanner sc) {
        System.out.println("Enter the element to delete:");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = arr[i+1];
                arr[i+1]=arr[i+2];
                arr[i+2]=0;
                System.out.println("Element deleted.");
                return;
            }
        }
        System.out.println("Element not found.");
    }

    public static void display(int[] arr) {
        System.out.println("Array elements:");
        boolean anyElement = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
                anyElement = true;
            }
        }
        if (!anyElement) {
            System.out.println("Array is empty.");
        } else {
            System.out.println();
        }
    }

    public static void update(int[] arr, Scanner sc) {
        System.out.println("Enter the index to update:");
        int index = sc.nextInt();
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.println("Enter the new value:");
        int newValue = sc.nextInt();
        arr[index] = newValue;
        System.out.println("Element updated.");
    }
}