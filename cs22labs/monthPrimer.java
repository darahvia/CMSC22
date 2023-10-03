import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.YearMonth;

public class monthPrimer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int month, year;

        while(true){
            System.out.print("Enter a month (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12){
                    break;
                }
            }else{
                System.out.println("Invalid month. Enter Again.");
            }
        }

        while(true){
            System.out.print("Enter a year: ");
            if (scanner.hasNextInt()){
                year = scanner.nextInt();
                break;
            }else{
                System.out.println("Invalid year. Enter Again.");
            }
        } 

    String[] monthNames =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    System.out.println(monthNames[month - 1] + ", " + year);

    LocalDate date = LocalDate.of(year, month, 1); 

    DayOfWeek dayOfWeek = date.getDayOfWeek();      // Use the getDayOfWeek() method to get the day of the week that the month starts
    YearMonth yearMonth= YearMonth.of(year, month);
    int numberOfDaysInMonth = yearMonth.lengthOfMonth();
    
    // printing of days of the calendar
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
    int dayTracker = 0;
    for (int i = 1; i <= dayOfWeek.getValue(); i++){
        System.out.print("\t");
        dayTracker++;
        if (dayTracker % 7 == 0){
            System.out.println();
        }
    }
    for (int day = 1; day <= numberOfDaysInMonth; day++){
        System.out.print(day + "\t");
        dayTracker++;
        if (dayTracker % 7 == 0){
            System.out.println(); //next line
        }
    }
    

    }
}

