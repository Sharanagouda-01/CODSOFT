import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TASK5 {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search for Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Enter CGPA: ");
                    float cgpa = scanner.nextFloat();
                    System.out.print("\n");
                    scanner.nextLine(); // consume the newline
                    Student newStudent = new Student(name,dept, rollNumber, cgpa);
                    system.addStudent(newStudent);
                    System.out.println("Student added successfully!\n");
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int rollToRemove = scanner.nextInt();
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully!\n");
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    int rollToSearch = scanner.nextInt();
                    System.out.print("\n");
                    Student searchedStudent = system.searchStudent(rollToSearch);
                    if (searchedStudent != null) {
                        System.out.println("Student found: \n" + searchedStudent);
                    } else {
                        System.out.println("Student not found.\n");
                    }
                    break;
                case 4:
                    System.out.println("All Students:");
                    system.displayAllStudents();
                    System.out.print("\n");
                    break;
                case 5:
                    System.out.println("Exiting the application. Thank you for using our service!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
}
 class Student {
    private String name;
    private String dept;
    private int rollNumber;
    private float cgpa;

    // Constructors
    public Student(String name,String dept, int rollNumber, float cgpa) {
        this.name = name;
        this.dept=dept;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public String toString() {
        return "---STUDENT DETAILS---\nName: "+name+"\nDepartment: "+dept+"\nRoll Number: "+rollNumber+"\nGrade: "+cgpa+"\n";
    }
}
class StudentManagementSystem {
    private List<Student> studentList;

    public StudentManagementSystem() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int rollNumber) {
        studentList.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
       
    }
}

