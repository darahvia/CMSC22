import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args){ 
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]


        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);  //[99, 81, 5]
    }
}


