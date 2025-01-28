public class Code {
    public static void main(String[] args) {
        int sum = 0;  // Initialize the sum to 0
        int i = 1;    // Start from the first integer

        // Use a while loop to iterate from 1 to 100
        while (i <= 100) {
            sum += i;  // Add the current integer to the sum
            i++;       // Move to the next integer
        }

        // Print the final sum
        System.out.println("The sum of integers from 1 to 100 is: " + sum);
    }
}


public class SumOfFirstFive {
    public static void main(String[] args) {
        int sum = 0;  // Initialize the sum to 0
        int i = 1;    // Start from the first natural number

        // Use a while loop to iterate from 1 to 5
        while (i <= 5) {
            sum += i;  // Add the current number to the sum
            i++;       // Move to the next number
        }

        // Print the final sum
        System.out.println("The sum of the first 5 natural numbers is: " + sum);
    }
}

