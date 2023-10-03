

public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++){
            alpha.append(current); //Mutable. Changes alpha object
        }
        System.out.println(alpha);
    }
}
