package pack;

import newpack.MyInterface1;
import newpack.packtest;
//import java
import java.util.Scanner;

class SubClass 
{ 
 static void display() 
    { 
        System.out.println("In Display"); 
    } 

} 

  
class MainClass extends packtest implements MyInterface1
{ 

   public void display() {
      System.out.println("from interface");
   }

   public static void main(String args[]) 
      { 
          
        SubClass.display();
          //trying to access private method of another class 
          //obj.display(); 
          Hello helloObj = new Hello();
          helloObj.display();
          MainClass mainClassObj = new MainClass();
          mainClassObj.packDisplay();
          mainClassObj.display();
          System.out.println("Enter Name:");
          Scanner newScan = new Scanner(System.in);
          String name = newScan.nextLine();
          System.out.println("Enter int value:");
          int num = newScan.nextInt();
          //String otherName = newScan.next();
          System.out.println("Input value="+name);
          System.out.println("Int value="+num);
          
          System.out.println(mainClassObj.myVal +" --- "+MyInterface1.myVal);
         // packtest packTestObj = new packtest();
         
          
          


      } 
}