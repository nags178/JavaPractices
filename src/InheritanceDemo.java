import Patterns.TestPattern;

public class InheritanceDemo extends TestPattern {
    int x = 400;
    String name = "Techie";
    int a = 100;
    
    public void display(){
        System.out.println("In super class my display method"+this.a+"  "+super.a);
    }

    static public void myMsg(){
        System.out.println("In inhertitance demo class");
    }

    static public void myDisplay(){

    }

   

    InheritanceDemo(){
        //super();
        //this();
        super(5,10);
        System.out.println("In inheritance demo constructor");
   }

    public static void main(String[] args) {
        InheritanceDemo childObj = new InheritanceDemo();
       // InheritanceDemo.showMsg();
       // childObj.showMsg();
        //showMsg();
       childObj.display();
       //TestPattern.
       childObj.myDisplay();
       

        System.out.println("In subclass "+childObj.x+"  "+childObj.name);
        //childObj.myDisplay();
        
    }
}
