import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\nTemperature Conversion Tool");
            System.out.println("--------------------------");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 3) {
                running = false;
                System.out.println("Exiting the program...");
                continue;
            }
            
            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();
            double convertedTemp = 0;
            String conversionType = "";
            
            switch (choice) {
                case 1:
                    convertedTemp = celsiusToFahrenheit(temperature);
                    conversionType = "Fahrenheit";
                    break;
                case 2:
                    convertedTemp = fahrenheitToCelsius(temperature);
                    conversionType = "Celsius";
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }
            
            System.out.printf("Converted temperature: %.2f %s%n", convertedTemp, conversionType);
        }
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
