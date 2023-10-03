import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        
        ArrayList<String> list3 = new ArrayList<String>(10);

        ArrayList<String> list4 = new ArrayList<String>(list3);


        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5]
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5); // [60.0]
        double first = weights.get(0); // 60.0
        
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }
}
