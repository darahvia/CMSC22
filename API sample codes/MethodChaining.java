public class MethodChaining {
    public static void main(String[] args){
        // String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');

        // String result = "AniMaL ";
        // result = result.trim();
        // result = result.toLowerCase();
        // result = result.replace('a', 'A');

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);


        String apple = "Apple";
        String appleToo = new String("Apple");

        String res = apple == appleToo ? "SameApple" :"NotSameApple";
        String res2 = apple.equals(appleToo) ? "SameApple" :"NotSameApple";
        
        System.out.println("res = " + res);
        System.out.println("res2 = " + res2);
    }
}



