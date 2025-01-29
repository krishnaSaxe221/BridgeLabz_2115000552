import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Use input if required
        System.out.println("Original Date: " + date);

        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Modified Date: " + modifiedDate);
    }
}

