class operator{
    public static void main(String args[]){
    //     int a=1;
    //     while(true){
    //     if(!(a==0)){
    //         System.out.println("hello");
    //         a--;
    //     } else {
    //         System.out.println("world");
    //         break;
    //     }
    // }

    // int a=10;
    // int b=20;
    // // a=a^b; //a=a+b;
    // // b=a^b;    //b=a-b;
    // // a=a^b;    //a=a-b;
    // // System.out.println("a: " + a);
    // // System.out.println("b: " + b);

    // int [] n=new int[3];
    // n[0]=b;
    // n[1]=a;
    // System.out.println("a: " + n[0]);
    // System.out.println("b: " + n[1]);

    // int s=Math.abs(a-b);
    // System.out.println("a: " + (a+s));
    // System.out.println("b: " + (b-s));


     int arr[]={1,0,3,9,0,4,0,0};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[i]==0 && arr[j]!=0){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    // }
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i] + " ");
    // }


    // int count=0;
    // int arr2[]=new int[arr.length];
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]!=0){
    //         arr2[count]=arr[i];
    //         count++;
    //     }
    //     if(arr2.length-arr.length+count>0){
    //         arr2[count]=0;
            
    //     }
    // }
    // for(int i=0;i<arr2.length;i++){
    //     System.out.print(arr2[i] + " ");
    // }



    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==0 && arr[j]!=0){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
              
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }



    }
}

