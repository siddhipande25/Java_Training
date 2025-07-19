import java.util.Arrays;

public class binarysearch {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int target = 4;

      //1
        int resultIndex = Arrays.binarySearch(arr, target);
        if (resultIndex >= 0) {
            System.out.println("Built-in method: Target " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Built-in method: Target " + target + " not found.");
        }
        System.out.println();


      
        //without recursion
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            
            int mid = l + (r - l) / 2;

   
            if (arr[mid] == target) {
                System.out.println("Manual method: Target " + target + " found at index " + mid);
               
                break; 
            }
            else if (arr[mid] < target) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

     binarysearch bs = new binarysearch();
        int result = bs.binarys(arr, target, 0, arr.length - 1);
        if (result != -1) { 
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
       
    }
    
    //3 with recursion
    public int binarys(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; 
        }
        int mid = start + (end - start) / 2; 

        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] > target) {
            return binarys(arr, target, start, mid - 1); 
        } else {
            return binarys(arr, target, mid + 1, end); 
        }
    }
}