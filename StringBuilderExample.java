
public class StringBuilderExample {
    public static String reverseString(String input) {
        // Create a new StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append the string to the StringBuilder
        stringBuilder.append(input);

        // Reverse the string using the reverse() method
        stringBuilder.reverse();

        // Convert the StringBuilder back to a string and return it
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}
