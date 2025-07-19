package Day4;

class Methods{
    public int Addition(int a,int b){
        int c=a-b;
        return c;
    }
}
class MethodOverr extends Methods{
    public int Addition(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        MethodOverr m=new MethodOverr();
        System.out.println(m.Addition(2,3));
        
    }
}