public class bubblesort{
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        bubblesort(arr);
        
    }
    public static void bubblesort(int[] arr) {
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
            System.out.print(arr[i] + " ");

        }
       
    }
    
}