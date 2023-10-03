import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args){
        int[] numbers = new int[3];

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


        Chicken [] chickens = new Chicken[3];

        String [] bugs = { "cricket", "beetle", "ladybug" };
        System.out.println(bugs.length); // 3
        System.out.println(bugs[0]); // cricket
        System.out.println(bugs[1]); // beetle
        System.out.println(bugs[2]); // ladybug


        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = i + 5;
        }


        int[] numbers3 = { 6, 9, 1 };
        Arrays.sort(numbers3);
        for (int i = 0; i < numbers3.length; i++){
            System.out.print (numbers3[i] + " ");
        }

        int[] numbers4 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers4, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers4, 4)); // 1

        System.out.println(Arrays.binarySearch(numbers4, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers4, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers4, 9)); // -5
        // System.out.println(Arrays.binarySearch(numbers4, "9")); // -5

    }
}