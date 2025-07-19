package Day4;

public class sumnext {
    public static void main(String args[]){
        int[] arr={4,10,7,5,8,6};
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                int max=arr[j];
                if(arr[j]>max){
                    max=arr[j];
                }

                if(arr[i]<max){
                    res[i]=max;
                    i++;
                }else{
                    res[i]=-1;
                    i++;
                }
            }
        }

        for(int a:res){
            System.out.print(a+" ");
        }
    }
}


//[10,-1,8,8,-1,-1]