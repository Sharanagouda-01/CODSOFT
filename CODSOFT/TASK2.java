import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
            
                // Ask the user for the number of subjects
                System.out.print("Enter the number of subjects: ");
                int numSubjects = scanner.nextInt();

                // Create an array to store the marks
                int[] marks = new int[numSubjects];

                // Ask the user for the marks in each subject
                for (int i = 0; i < numSubjects; i++) {
                    System.out.print("Enter the marks obtained in Subject " + (i + 1) + ": ");
                    marks[i] = scanner.nextInt();
                }

                // Calculate the total marks
                int totalMarks = 0;
                for (int mark : marks) {
                    totalMarks += mark;
                }

                // Calculate the average percentage
                double averagePercentage = (double) totalMarks / numSubjects;

                // Determine the grade
                String grade,remark;
                if (averagePercentage >= 90) {
                    grade = "A";
                    remark="---Excellent!!! keep up the good work---";
                } else if (averagePercentage >= 80) {
                    grade = "B";
                    remark="---Great!!! keep it up---";
                } else if (averagePercentage >= 70) {
                    grade = "C";
                    remark="---Good!!! Can do better---";
                } else if (averagePercentage >= 60) {
                    grade = "D";
                    remark="---Average!!! work hard to improve---";
                } else {
                    grade = "F";
                    remark="---Not Satisfactory!!! need to cope up with the studies ---";
                }

                // Display the results
                System.out.println("\nTotal Marks: " + totalMarks);
                System.out.println("Average Percentage: " + averagePercentage+"%");
                System.out.println("Grade: " + grade);
                System.out.println("Remarks: " + remark);
               
            scanner.close();
    }
}

  
