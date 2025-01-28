public class StringCompressor {

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the original string for null or empty input
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; // Count of consecutive characters

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // Increment count for repeated characters
            } else {
                compressed.append(str.charAt(i - 1)).append(count); // Append character and count
                count = 1; // Reset count
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1)).append(count);

        // Return the original string if compression doesn't reduce size
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String output = compressString(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

