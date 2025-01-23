import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement the counter
        }

        System.out.println("Rocket Launched!");

        scanner.close();
    }
}

