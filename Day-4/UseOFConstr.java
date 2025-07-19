package Day4;

//static variables are common to all objects and is stored in stack memory and another vairables in heap memory
class UseOFConstr{
    static int a=0;
    final int c=0;
    int b=0;
    UseOFConstr(){
        a++;
        b++;
        
        System.out.println("a:"+a+" b:"+b);

    }
    public static void main(String[] args) {
        UseOFConstr c=new UseOFConstr();
        UseOFConstr c2=new UseOFConstr();
    }
} 
