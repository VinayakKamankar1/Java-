import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        // Keep the program running until the user chooses to exit
        while (true) {
            // Display options to the user
            System.out.println("Choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            // Get the user's choice
            System.out.print("Enter your choice (1/2/3): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Convert Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("%.2f°C is equal to %.2f°F\n\n", celsius, fahrenheit);
                    break;
                case 2:
                    // Convert Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("%.2f°F is equal to %.2f°C\n\n", fahrenheit, celsius);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                default:
                    // Invalid choice
                    System.out.println("Invalid choice, please try again.\n");
                    break;
            }
        }
    }
}
