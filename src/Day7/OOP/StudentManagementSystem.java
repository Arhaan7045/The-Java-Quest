package Day7.OOP;

//Day 7
/*
🚀 Project: Simple Student Management System (Console App)
📖 Description:
A console-based app to add, view, and search students using OOP principles. */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//CLASS STUDENT DETAILS
class StudentDetails {
    private final int id;
    private String name;
    private int age;
    private String grade;

    public StudentDetails(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    //Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    public void displayDetails() {
        System.out.println("Id: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}


//CLASS STUDENT MANAGEMENT
class StudentManagement {
    ArrayList<StudentDetails> students = new ArrayList<>();
    private static final String FILE_NAME = "C:/Users/Arhaan Shaikh/OneDrive/Desktop/students.txt"; // text file to save data

    public StudentManagement() {
        loadFromFile(); // load existing data on startup
    }

    public void addStudent(StudentDetails s) {
        for (StudentDetails student : students) {
            if (student.getId() == s.getId()) {
                System.out.println("⚠️ Student with ID " + s.getId() + " already exists!");
                return;
            }
        }
        students.add(s);
        saveToFile();
        System.out.println("✅ Student added successfully!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found!");
        } else {
            System.out.println("\n📋 Student List:");
            for (StudentDetails s : students) {
                s.displayDetails();
            }
        }
    }

    public void searchStudent(int id) {
        for (StudentDetails s : students) {
            if (s.getId() == id) {
                System.out.println("🔍 Student Found:");
                s.displayDetails();
                return;
            }
        }
        System.out.println("❌ Student with ID " + id + " not found.");
    }

    public void deleteStudent(int id) {
        for (StudentDetails s : students) {
            if (s.getId() == id) {
                students.remove(s);
                saveToFile();
                System.out.println("🗑️ Student with ID " + id + " deleted successfully!");
                return;
            }
        }
        System.out.println("⚠️ Student not found!");
    }

    public void updateStudent(int id, String newName, int newAge, String newGrade) {
        for(StudentDetails s : students) {
            if (s.getId() == id) {
                System.out.println("✏️ Updating student details...");
                s.setName(newName);
                s.setAge(newAge);
                s.setGrade(newGrade);
                saveToFile();
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("⚠️ Student not found!");
    }

    // 🔹 Save students to file
    private void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (StudentDetails s : students) {
                pw.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getGrade());
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error saving data: " + e.getMessage());
        }
    }

    // 🔹 Load students from file
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return; // no file yet

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String grade = data[3];
                    students.add(new StudentDetails(id, name, age, grade));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("⚠️ Error loading data: " + e.getMessage());
        }
    }
}


//MAIN CLASS
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int choice = 0;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine()); // read as string, then convert
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                continue; // go back to menu
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(scanner.nextLine()); // safe parse
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        String grade;
                        while (true) {
                            System.out.print("Enter Grade (A, B, C, D, F or with +): ");
                            grade = scanner.nextLine().trim();

                            // check if grade is empty
                            if (grade.isEmpty()) {
                                System.out.println("⚠️ Grade cannot be empty!");
                                continue;
                            }

                            // regex: allows A, B, C, D, F, A+, B+, C+ etc.
                            if (grade.matches("^[ABCDF](\\+)?$")) {
                                break; // ✅ valid grade
                            } else {
                                System.out.println("⚠️ Invalid grade! Please enter A, B, C, D, F or with +");
                            }
                        }

                        StudentDetails s = new StudentDetails(id, name, age, grade);
                        sm.addStudent(s);
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Invalid input! ID and Age must be numbers.");
                    }
                    break;

                case 2:
                    sm.viewAllStudents();
                    break;

                case 3:
                    try {
                        System.out.print("Enter ID to search: ");
                        int searchId = Integer.parseInt(scanner.nextLine());
                        sm.searchStudent(searchId);
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Invalid input! ID must be a number.");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter ID to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        sm.deleteStudent(deleteId);
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Invalid input! ID must be a number.");
                    }
                    break;

                case 5:
                    try {
                        System.out.print("Enter ID to update: ");
                        int updateId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Age: ");
                        int newAge = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter New Grade: ");
                        String newGrade = scanner.nextLine();

                        sm.updateStudent(updateId, newName, newAge, newGrade);
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Invalid input! Age/ID must be numbers.");
                    }
                    break;

                case 6:
                    System.out.println("💾 Saving data... Exiting program!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
