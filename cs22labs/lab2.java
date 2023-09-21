 import java.util.Scanner;

 public class lab2{
    public static boolean isPrimeNumber(int n){
        if (n <= 1){
            return false;
            }
        else{
            for (int factor = 2; factor <= n/2; factor++){
                if (n % factor == 0){
                    return false;
                }
            }
            return true;
        }
    }



    public static void main (String[] args){
        System.out.println("Enter a number:");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        if (isPrimeNumber(n)){
            System.out.printf("%d is a Prime number.", n);
            }
        else{
            System.out.printf("%d is not a Prime number.", n);
            }
        }
    }

