import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking number of subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Taking marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            totalMarks = totalMarks + marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Grade calculation
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) {
            grade = "A";
        } 
        else if (averagePercentage >= 70) {
            grade = "B";
        } 
        else if (averagePercentage >= 60) {
            grade = "C";
        } 
        else if (averagePercentage >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        // Display result
        System.out.println("\n========== Student Result ==========");
        System.out.println("Total Marks: " + totalMarks + "/" + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("====================================");

        scanner.close();
    }
}