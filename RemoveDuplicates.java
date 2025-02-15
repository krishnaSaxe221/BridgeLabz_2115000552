import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Iterate over each character in the string
        for (char ch : input.toCharArray()) {
            // If the character has not been seen before
            if (!seen.contains(ch)) {
                stringBuilder.append(ch); // Append to the result
                seen.add(ch); // Mark this character as seen
            }
        }

        // Return the string without duplicates
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "aabcc"; // Example input
        String result = removeDuplicates(input); // Remove duplicates

        // Print the string without duplicates
        System.out.println("String without duplicates: " + result);
    }
}

