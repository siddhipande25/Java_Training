public class selectionsort{
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,89};
        int n = arr.length-1;
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}