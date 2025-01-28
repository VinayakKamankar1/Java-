public class  greaternum {
    public static void main(String[] args) {
        // Example usage of the compareIntegers method
        int num1 = 10;
        int num2 = 20;

        // Call the method and print the result
        String result = compareIntegers(num1, num2);
        System.out.println(result);
    }

    // Method that compares two integers and returns a string
    public static String compareIntegers(int num1, int num2) {
        if (num1 > num2) {
            return "The first integer is greater than the second.";
        } else if (num1 < num2) {
            return "The first integer is less than the second.";
        } else {
            return "The first integer is equal to the second.";
        }
    }
}
