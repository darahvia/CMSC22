package lab1package;
import java.util.Scanner;

public class Lab1{
    public static void main (String[] args){
        Chicken chicken_1 = new Chicken();
        Chicken chicken_2 = new Chicken();
        Chicken chicken_3 = new Chicken();

        Scanner chicken_name = new Scanner(System.in);

        System.out.println("Enter name for chicken number 1");
        chicken_1.name = chicken_name.nextLine();

        System.out.println("Enter name for chicken number 2");
        chicken_2.name = chicken_name.nextLine();

        System.out.println("Enter name for chicken number 3");
        chicken_3.name = chicken_name.nextLine();

        System.out.println("Chicken number 1 is named " + chicken_1.name);
        System.out.println("Chicken number 1 static variable " + Chicken.NUMBER_OF_CHICKEN);

        System.out.println("Chicken number 2 is named " + chicken_2.name);
        System.out.println("Chicken number 2 static variable " + Chicken.NUMBER_OF_CHICKEN);

        System.out.println("Chicken number 3 is named " + chicken_3.name);
        System.out.println("Chicken number 2 static variable " + Chicken.NUMBER_OF_CHICKEN);

        chicken_name.close()
    }
}
