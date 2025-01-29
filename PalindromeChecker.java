import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = getInput("Enter a string to check if it's a palindrome: ");
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Function to take input from the user
    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[\\W_]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }
}

