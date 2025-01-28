public class SumWhileLoop {
    public static void main(String[] args) {
        int sum = 0; // Variable to store the sum
        int number = 1; // Start from 1

        // While loop to calculate the sum
        while (number <= 100) {
            sum += number; // Add the current number to the sum
            number++; // Move to the next number
        }

        // Display the result
        System.out.println("The sum of integers from 1 to 100 is: " + sum);
    }
}

