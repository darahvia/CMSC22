import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.YearMonth;


public class monthPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int month, year;

        while(true){
            System.out.print("Enter month number (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12){
                    break;
                }else{
                    System.out.println("Not within 1-12. Enter Again");
                }
            }else{
                System.out.println("Invalid input. Enter Again.");
                scanner.nextLine();         //discards the noninteger input from the input stream
            }
        }

        while(true){
            System.out.print("Enter year Number (1-10000): ");
            if (scanner.hasNextInt()){
                year = scanner.nextInt();
                if (year >= 1 && month <= 10000){
                    break;
                }else{
                    System.out.println("Not within 1-10000. Enter Again");
                }
            }else{
                System.out.println("Invalid year. Enter Again.");
                scanner.nextLine();
            }
        } 

    LocalDate date = LocalDate.of(year, month, 1); 

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
    String formattedDate = date.format(formatter);

    DayOfWeek dayOfWeek = date.getDayOfWeek();              // Use the getDayOfWeek() method to get the day of the week that the month starts
    YearMonth inputDate= YearMonth.of(year, month); 
    
    int numberOfDaysInMonth = inputDate.lengthOfMonth();        // return the number of days in the given month


    // printing of days of the calendar 
    System.out.println(formattedDate);
    System.out.println("Sun\tMon\tTue\tWed\tThurs\tFri\tSat");
    int dayTracker = 0;
    for (int i = 1; i <= dayOfWeek.getValue()%7; i++){
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

