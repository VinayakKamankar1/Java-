import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String userInput = scanner.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
        scanner.close();
    }
}
