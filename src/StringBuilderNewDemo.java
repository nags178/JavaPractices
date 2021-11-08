import java.util.Scanner;

// import java.lang.*;

public class StringBuilderNewDemo { // extends Object
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();  // default is 16
        str.append("Hello Team. How are u doing.");
      //  System.out.println(str.length()+" "+str.capacity());
        StringBuilder str1 = new StringBuilder(""); // default 16 + length
        str1.append("Hello Team. Welcome all to the training.");
       // System.out.println(str1.length()+" "+str1.capacity());

        StringBuilder str2 = new StringBuilder(50);
        System.out.println(str2.capacity());

        StringBuilderNewDemo strObj = new StringBuilderNewDemo();

        Integer i = 100;
        Scanner scObj = new Scanner(System.in);
      //  System.out.println(scObj.toString());  // strObj.toString() it is executing from Object class

        String s1 = new String("Hello Team").intern();

        String s2 = new String("Hello Team").intern();

       

        System.out.println( s2.matches("hello"));

        String s3 = s2;

        System.out.println(s3 == s2);

    }

    public String toString(){
        return "Hi Team this is string object";
    }
}
