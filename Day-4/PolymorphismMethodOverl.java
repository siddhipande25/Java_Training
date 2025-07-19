package Day4;

class PolymorphismMethodOverl{
    public int Addition(int a,int b){
        return a+b;
    }
    public int  Addition(int a,int b,int c){
        return  a+b+c;
    }
    public static void main(String args[]){
        PolymorphismMethodOverl p=new PolymorphismMethodOverl();
        System.out.println(p.Addition(4,5));
         System.out.println(p.Addition(4,5,7));
    }
}
