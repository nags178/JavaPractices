import newpack.MyInterface1;

 abstract class InterfaceDemo4 implements InterfaceDemo1{
   abstract void message();
    
}

interface NewInterface1{
    void newMethod();
    default void greetings(){
        System.out.println("Greetings Everyone");
    }
}

interface NewInterface2 extends MyInterface1{
    void helloAll();

    default void greetings(){
        System.out.println("Greetings Everyone");
    }

    static void myStatic(){
        System.out.println("In static content");
    }
}


public class InterfaceDemo2 extends InterfaceDemo4 implements NewInterface2, NewInterface1{
    public void helloAll(){
        System.out.println("In hello all");
    }


    public void greetings(){
        System.out.println("In overriden greetings");
        NewInterface1.super.greetings();
        NewInterface2.super.greetings();
    }

    public void hello(){
        System.out.println("In hello");
        NewInterface2.super.greetings();
    }
    public void newDisplay(){
        System.out.println("In new display");
    }

    void message(){
        System.out.println("In message");
    }
    public void newMethod(){
        System.out.println("In new method");
    }

    public void display(){
        System.out.println("In display");
    }

    public void show(){
        System.out.println("In show");
    }
    public static void main(String[] args) {
        InterfaceDemo2 interfaceObj = new InterfaceDemo2();
        interfaceObj.display();
        interfaceObj.message();
        interfaceObj.show();
        interfaceObj.newMethod();
        interfaceObj.newDisplay();
        interfaceObj.hello();
        interfaceObj.helloAll();
        interfaceObj.greetings();
        NewInterface2.myStatic();

        System.out.println(InterfaceDemo1.i+" "+MyInterface1.i);
        
    }
}
