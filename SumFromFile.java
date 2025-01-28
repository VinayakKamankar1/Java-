import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumFromFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the file name
        System.out.println("Enter the file name (with path) containing the numbers:");
        String fileName = input.nextLine();

        File file = new File(fileName);
        double sum = 0.0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                try {
                    // Try to parse the number from the line
                    double number = Double.parseDouble(line);
                    sum += number;
                } catch (NumberFormatException e) {
                    // Handle invalid numeric data
                    System.out.println("Invalid data found in file: " + line + "\". Skipping...");
                }
            }

            // Display the total sum
            System.out.println("The total sum of numbers in the file is: " + sum);
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("File not found: " + fileName);
        }

        input.close();
    }
}

