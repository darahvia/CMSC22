
import java.util.Scanner;

public class lab3{
    public static void main(String[] args){
        WordGenerator wordGenerator = new WordGenerator();
        String randomWord = wordGenerator.generateWord().toLowerCase();
        Scanner sc = new Scanner(System.in);
        StringBuilder blank = new StringBuilder("_".repeat(randomWord.length()));

        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("=  H A N G - M A N  =");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        int lives = 5;
        boolean found = false;      //tracks if the word is found
        
        while (lives >= 0){
            System.out.println(blank);      //displays the current state of blank
            System.out.println("Enter a letter: ");

            char userGuess = sc.next().toLowerCase().charAt(0);       //read character entered by user
            boolean correctGuess = false;
                
            if(!blank.toString().contains(String.valueOf(userGuess))){      //if user has not guessed the character yet
                for(int i = 0; i < randomWord.length(); i++){
                    if (userGuess == randomWord.charAt(i)){                 //if the userGuess is correct
                        blank.setCharAt(i, userGuess);                      //reveal position of the character in the chosen word
                        correctGuess = true;
                    }
                }
            }

            if (!correctGuess){                
                System.out.printf("Lives left: %d%n", lives);       //diplay the user's life if guess is incorrect
                lives--;
                }


            if (blank.toString().equals(randomWord)){               
                found = true;
                break;          //stops the game
            }
        }

    
            if (found){
                System.out.println(randomWord);
                System.out.println("=*=*=*=*=*=*=*=*=*=*=");
                System.out.println("=  CONGRATULATIONS  =");
                System.out.println("=*=*=*=*=*=*=*=*=*=*=");
            }else{
                System.out.println("Better luck next time. :(");
        }
    }
}


