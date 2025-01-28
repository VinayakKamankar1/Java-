/*public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}*/

import java.util.Scanner;

public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = removeDuplicates(input);
        System.out.println("Output: " + output);

        scanner.close();
    }
}




