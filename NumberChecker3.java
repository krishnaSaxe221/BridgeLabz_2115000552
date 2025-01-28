public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigitsInArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int findSumOfSquaresOfDigits(int[] digits) {
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigitsInArray(number);
        int sumOfDigits = findSumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int number) {
        int[] frequency = new int[10]; // Array to store frequency of digits 0-9
        int[] digits = storeDigitsInArray(number);

        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Store the result in a 2D array
        int[][] digitFrequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            digitFrequency[i][0] = i; // Digit
            digitFrequency[i][1] = frequency[i]; // Frequency
        }
        return digitFrequency;
    }

    public static void main(String[] args) {
        int number = 1729; // Example number

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigitsInArray(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find the sum of the digits
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find the sum of the squares of the digits
        int sumOfSquares = findSumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if it's a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i][1] > 0) { // Display only digits with frequency > 0
                System.out.println("Digit: " + digitFrequency[i][0] + ", Frequency: " + digitFrequency[i][1]);
            }
        }
    }
}
