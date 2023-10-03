public class StringConcat {
    public static void main(String[] args){

        String stringA = "Hello";
        stringA.concat("World");

        System.out.println(stringA); // Hello

        stringA = stringA.concat("World"); 
        //creates another String "HelloWorld" and assigns it to stringA

        System.out.println(stringA); // HelloWorld

        String stringB = new String("HelloWorld");

        if(stringA == stringB){
            System.out.println("These string objects are the same");
        }else{
            System.out.println("These string objects are NOT the same");
        }

    }
}


