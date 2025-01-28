public class Odd {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println(i); // Print the odd number
        }
    }
}
