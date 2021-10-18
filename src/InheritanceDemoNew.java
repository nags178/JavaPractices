import java.util.Arrays;

class GrandClass { // extends Object
   private int l;
   int i = 15;

    protected void grand(){
        System.out.println("In grand");
    }

    

     GrandClass(){

    }
   
}

class OtherMianClass extends GrandClass{
    int z;

    void other(){
        System.out.println("In other");
    }
}


 class MainClass extends GrandClass{
    int i = 10;
    private String name;

      void display(){
        System.out.println("In  parent display ");
       // super.display();
    }

    static class StaticClass{
        int k;
        void hi(){
            System.out.println("In inner");
        }
    }

     MainClass(){
        //super();
        System.out.println("In main class constructor");
    }

    private MainClass(int i){
        this();
        System.out.println("In param main class constructor");
    }
}

class OtherSubClass extends MainClass{
    int y;

    void otherSub(){
        System.out.println("In other sub");
    }
}

class SubClass1 extends MainClass{
    int j;
    int i = 5;

     void display(){
        System.out.println("In child display ");
        //super.display(); 
    }

    SubClass1(int i){
        System.out.println("In param child constructor");
    }

    SubClass1(){
        this(10);//by default compiler will do
        //super();
        System.out.println("In child constructor");
    }

    public static void main(String[] args) {
        byte b = 5;
        int k = 10;
        int c = b + k; // b byte is promoted to int
        SubClass1 subObj = new SubClass1();
        subObj.grand();
        //subObj.hello();
      //  subObj.display();
        System.out.println(c);
        add(b, c);
        
       // System.out.println(subObj.i);

       
       
    }

    static void add(int a, int b){
        System.out.println("In int");
        System.out.println(a + b);
    }

    static int add(int a, long b){
        System.out.println("In long");
        System.out.println(a + b);
        return (int)(a+b);
    }



}

public class InheritanceDemoNew {  //extends Object
   
}
