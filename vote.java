import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user for their citizenship status
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        // Determine voting eligibility
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
