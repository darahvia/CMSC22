package WordGenerator.generateWord;
import java.util.Scanner;

public class lab3{
    public static void main(String[] args){
        Scanner randomWords = new Scanner(new generateWord());
        while (randomWords.hasNext()){
        System.out.println(randomWords.nextLine());
        }
    }


}
