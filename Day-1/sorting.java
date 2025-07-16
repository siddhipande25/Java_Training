import java.util.Scanner;

class sorting{
    public static void main(String[] args) {
        int arr[]={7,9,2,5,3};
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number[1-3]:");
        int n=sc.nextInt();
        System.out.println("Largest number in the array: " + arr[n-1]);
        
    }
}


import java.util.Scanner;

class sorting {
    public static void main(String[] args) {
        int arr[] = {7, 9, 2, 5, 3};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number [1-3]:");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Largest number in the array: " + first);
        } else if (n == 2) {
            System.out.println("2nd largest number in the array: " + second);
        } else if (n == 3) {
            System.out.println("3rd largest number in the array: " + third);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
