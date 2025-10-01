package Day7.OOP;

class Student {
    int id;
    int marks;
    String name;

    void displayDetails() {
        System.out.println("Id: " + id + "; Name: " + name + "; Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Arhaan";
        s1.marks = 95;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Adiba";
        s2.marks = 90;

        Student s3 = new Student();
        s3.id = 103;
        s3.name = "Nazma";
        s3.marks = 90;

        Student s4 = new Student();
        s4.id = 104;
        s4.name = "Akhil";
        s4.marks = 90;

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
    }
}
