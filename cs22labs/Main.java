import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a LocalDate object representing a specific date
        LocalDate date = LocalDate.of(2023, 10, 3); // October 3, 2023

        // Use the getDayOfWeek() method to get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Print the result
        System.out.println("The day of the week for " + date + " is " + dayOfWeek);
    }
}