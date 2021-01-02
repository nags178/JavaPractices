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
       //// String input = "Hi this is nag";
      //  Scanner scanObj = new Scanner(input);
        System.out.println("Enter my input: ");
        int i = scannerObj.nextInt();
       // int j = scannerObj.nextInt();
      //  String str = scanObj.next();
        
        
        //String str1 = scannerObj.nextLine();
        //String str2 = scannerObj.next();
        System.out.println("My entered input is: " +i);
        scannerObj.close();
       // scanObj.close();
       //MainClass obj = new MainClass();
    }
    
}

   
 