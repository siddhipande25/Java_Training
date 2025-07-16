public class arraymiss{
    public static void main(String[] args){
        int arr[]={1,3,5,2};
        int sum=0;
        int n=arr.length+1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int totalSum=(n*(n+1))/2;
        int missingNumber=totalSum-sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}