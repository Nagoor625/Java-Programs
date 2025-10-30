package Week7_Programs;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printable interface method implemented.");
    }

    public void show() {
        System.out.println("Showable interface method implemented.");
    }
}

public class Week7_Program3 {
    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println("=== Program 3: Multiple Inheritance using Interfaces ===");
        obj.print();
        obj.show();
    }
}