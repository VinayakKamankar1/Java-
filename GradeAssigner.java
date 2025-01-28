import java.util.Scanner;

public class GradeAssigner {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a numeric score
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        // Assign a grade using nested ternary operators
        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                       (score >= 60) ? "D" : "F";

        // Display the assigned grade
        System.out.println("Your grade is: " + grade);

        // Close the scanner
        scanner.close();
    }
}
