public class SpringSeason {
    public static void main(String[] args) {
        // Check if the correct number of arguments is passed
        if (args.length != 2) {
            System.out.println("Please provide month and day.");
            return;
        }

        // Parse the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date is within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

