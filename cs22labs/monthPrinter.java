import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;              // for printing of MMMM, YYYY
import java.time.DayOfWeek;                             // for finding the day of the week the month starts

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

    scanner.close();

    LocalDate date = LocalDate.of(year, month, 1);      

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");    
    String formattedDate = date.format(formatter);

    DayOfWeek dayOfWeek = date.getDayOfWeek();                      // use the getDayOfWeek() method to get the day of the week that the month starts

    int numberOfDaysInMonth = date.lengthOfMonth();                 // return the number of days in the given month


    // printing of days of the calendar 
    System.out.println(formattedDate);                              // prints Month, Year
    System.out.println("Sun\tMon\tTue\tWed\tThurs\tFri\tSat");    // prints days of the week

    int dayTracker = 0;                                             //used for alignment of numbers

    for (int i = 0; i < dayOfWeek.getValue()%7; i++){               // Sun - 0, Mon - 1, Tue - 2, Wed - 3, Thurs - 4, Fri - 5, Sat - 6
        System.out.print("\t");                                   // puts spaces until the day of the week the month starts
        dayTracker++;               
        if (dayTracker % 7 == 0){
            System.out.println();
        }
    }
    for (int day = 1; day <= numberOfDaysInMonth; day++){           // starting from the end of the spaces, start the 1
        System.out.print(day + "\t");
        dayTracker++;
        if (dayTracker % 7 == 0){
            System.out.println(); //next line
        }
    }
    

    }
}

