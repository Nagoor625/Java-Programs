package Week6_Programs;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

public class Week6_Program1 {
    public static void main(String[] args) {
        Student s1 = new Student("Sharif", 25, "S12345");
        s1.displayStudentInfo();
    }
}

