public class ConcatenateStrings {
    public static String concatenateStrings(String[] strings) {
        // Create a new StringBuffer to store the concatenated result
        StringBuffer stringBuffer = new StringBuffer();

        // Iterate through each string in the array
        for (String str : strings) {
            stringBuffer.append(str); // Append the current string to the StringBuffer
        }

        // Return the concatenated string
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String[] inputStrings = {"Hello", " ", "World", "!", " Welcome", " to", " Java!"};
        String result = concatenateStrings(inputStrings); // Concatenate the strings

        // Print the concatenated result
        System.out.println("Concatenated String: " + result);
    }
}

