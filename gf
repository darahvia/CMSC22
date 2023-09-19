 import java.util.Scanner;

 public class Lab2{
    public static boolean isPrimeNumber(int n){
        int prime = 0;  //counter if pila divisible
        if (n <= 1){
            return false;
            }
        else{
            for (i = 2; i <= n/2; i++){
                if (n % 2 != 0){
                    prime += 1;
                }
            }if (prime == 0){
                return true;
                }



    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        int n = UserInput.nextLine();
        if (isPrimeNumber(n)){
            System.out.println("%d is a Prime number");
            }
        else{
            System.out.println("%d is not a Prime number. :(");
            }
        }
    }

