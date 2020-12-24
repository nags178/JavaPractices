import java.util.Scanner;

import pack.*;
public class App {
     App(){
        System.out.println("In App");
    }
    private int i=10;
    
    public static void main(String[] args) throws Exception {
        App appObj = new App();
        System.out.println("Hello, World! and i value"+appObj.i);
        System.out.println();
        Scanner scannerObj = new Scanner(System.in);
        Scanner scanObj = new Scanner("Hi this is nag");
      //  System.out.println("Enter my input: ");
     //   int i = scannerObj.nextInt();
        
        String str = scanObj.nextLine();
        
       // String str1 = scannerObj.next();
       // String str2 = scannerObj.next();
        System.out.println("My entered input is: " +str);
        scannerObj.close();
        scanObj.close();
       //MainClass obj = new MainClass();
    }
    
}

   
 