public class FizzBuzzAndPrimeCheck {
    public static void main(String[] args) {
        // FizzBuzz using while loop
        int n = 1;
        while (n <= 100) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
            n++;
        }
    }
}

