package pack;
import newpack.*;
class SubClass 
{ 
 static void display() 
    { 
        System.out.println("In Display"); 
    } 

} 

  
class MainClass extends packtest
{ 
   public static void main(String args[]) 
      { 
          
        SubClass.display();
          //trying to access private method of another class 
          //obj.display(); 
          Hello helloObj = new Hello();
          helloObj.display();
          MainClass mainClassObj = new MainClass();
          mainClassObj.packDisplay();


      } 
}