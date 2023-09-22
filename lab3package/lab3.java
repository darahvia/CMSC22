// package WordGenerator.generateWord;
import java.util.Scanner;

public class lab3{
    public static void main(String[] args){
        String randomWord = "hello";
//         String randomWord = WordGenerator.generateWord();
        Scanner sc = new Scanner(System.in);
        StringBuilder blank = new StringBuilder("_".repeat(randomWord.length()));

        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("=  H A N G - M A N  =");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        int lives = 5;
        while (lives > 0){
            System.out.println(blank);
            System.out.println("Enter a letter: ");

            char userGuess = sc.next().charAt(0);
            int found = randomWord.length() - 1;
            for(int i = 0; i < randomWord.length(); i++){


                if (randomWord.charAt(i) == userGuess){
                    blank.setCharAt(i, userGuess);
                    found--;
                    if (found == 0){
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
                        System.out.println("=  H A N G - M A N  =");
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
                    }
                    }
                }
            System.out.printf("Lives left: %d%n", lives);
            lives--;
            }

        }
    }


