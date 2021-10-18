import java.util.Scanner;

public class IO {

  
    public static void main(String[] args) {
       // System.err.println("Hello this is error message");
        System.out.println("This is standrad output");
        int a,b,c=0;
        String str1, str2, str3 = "";
        String str = "hello Team. This is our java trainign program";
       Scanner sc = new Scanner(str);
      // sc.useDelimiter("#");  
       // System.out.println("Take input from user:");
        str1 = sc.next();
        str2 = sc.next();
        str3 = sc.next();
        String str4 = sc.next();
        
       // a = sc.nextInt();
       // a = sc.nextInt(); 
       // System.out.println(str1);
      //  b = sc.nextInt();
       // System.out.println(sc.hasNextInt());
        //if(sc.hasNext())
           // c = sc.nextInt();
        System.out.println(str1+"  "+str2+"  "+str3);
        System.out.println(sc.delimiter());

      //  System.out.println("My input value= "+a+"   2= "+b+"  3= "+c);
        sc.close();
    }
}
