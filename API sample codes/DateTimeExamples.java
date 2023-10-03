import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExamples {
    public static void main(String[] args){ 

        System.out.println( LocalDate.now()); 
        System.out.println( LocalTime.now()); 
        System.out.println( LocalDateTime.now()); 

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);//year,month,dayOfMonth

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        
        // LocalDate d = new LocalDate(); // DOES NOT COMPILE
        // LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException


        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-2

        date.plusYears(5);
        System.out.println(date); // 2019-02-2

        LocalDateTime dateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime); // 2015-01-20T06:15:30
        dateTime = dateTime.minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime); // 2015-01-18T20:15


        LocalDate date_ = LocalDate.of(2015, 1, 20);
        LocalTime time_ = LocalTime.of(6, 15);
        LocalDateTime dateTime_ = LocalDateTime.of(date_, time_);
        Period period = Period.ofMonths(1);
        System.out.println(date_.plus(period)); // 2015-02-20
        System.out.println(dateTime_.plus(period)); // 2015-02-20T06:15


        DateTimeFormatter shortDateTime =
        DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime_)); // 1/20/15
        
        DateTimeFormatter longDateTime =
        DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(longDateTime.format(dateTime_)); // January 20, 2015

        DateTimeFormatter mediumDateTime =
        DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(mediumDateTime.format(dateTime_)); // Jan 20, 2015

        DateTimeFormatter fullDateTime =
        DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(fullDateTime.format(dateTime_)); // Tuesday, January 20, 2015

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");

    }
}