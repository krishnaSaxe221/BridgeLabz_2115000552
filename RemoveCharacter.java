public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'l';
        System.out.println("Modified String: " + removeCharacter(input, charToRemove));
    }

    public static String removeCharacter(String input, char charToRemove) {
        return input.replaceAll(String.valueOf(charToRemove), "");
    }
}

