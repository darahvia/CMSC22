import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2

        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2

        // String[] stringArray2 = list.toArray(); //Compile Error

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(2);

        // int[] numArray = list.toArray(new int[0]); //Compile Error
        Integer[] numArray2 = list.toArray(new Integer[0]);
    }
}