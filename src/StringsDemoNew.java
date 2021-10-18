public class StringsDemoNew {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "hello124 hello There";

        char[] ch = {'a','b','c'};
        
        String stringObj = new String(ch);

        String strObj = new String("Hello");

        String str2 = new String();
        str2 = "hi";  // same memory location

        float a = 100.0f;

        str2 = str2.concat(strObj); // new object created

        String str3 = str2.concat(" Team"); // new object created

        System.out.println(str3+"   "+str2);

        if(str == "Hello1"){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        System.out.println(str1.compareTo(str));

        System.out.println(str1.substring(3));

        System.out.println(str1.substring(0, 5));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.trim());

        System.out.println(str.startsWith("h"));

        System.out.println(str.endsWith("l"));

        System.out.println(str.charAt(0));

        System.out.println(str.length());

        System.out.println(10 + "a");

       // str1 = ;
        System.out.println(str1.replace("hello", "12345"));

        // string is an immutable - cannot change


    }
}
