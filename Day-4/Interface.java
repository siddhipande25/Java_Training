package Day4;

interface Student{
    abstract void marks();
    abstract void contact();
   
}
public class Interface implements Student{
    public void marks(){
        System.out.println("Marks:244");
    }
    public void contact(){
        System.out.println("875734775");
    }
    public static void main(String args[]) {
        Student s=new Interface();
        s.marks();
        s.contact();
    }
}
