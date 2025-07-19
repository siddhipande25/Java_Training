package Day4;

abstract class Student {
    abstract void marks();
    abstract void contact();
    void sample(){
        System.out.println("Abstract Executed");
    }
}

public class Abstraction extends Student {
    void marks(){
        System.out.println("Marks:244");
    }
    void contact(){
        System.out.println("875734775");
    }
    public static void main(String[] args) {
        Student s = new Main();
        s.marks();
        s.contact();
    }
}