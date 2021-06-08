interface MyInterface{
    int i = 10;   // public static final int i = 5;
    void display();  // public abstract void display();
    void showMsg();
    default void otherMethod(){
        System.out.println("In default method parent");
    }

}

interface NewInterface {
    int a = 20;
    void newDisplay();
    void hello();
}

interface MultiInterface {
    void multiInfo();
}

interface Interface1 extends NewInterface,MultiInterface{
    int i = 4;
    void newMethod();
    default void otherMethod(){
        System.out.println("In default method parent in Interface1");
    }
    static void myStaticMethod(){
        System.out.println("In interface static method");
    }
    //void newDisplay();
}

abstract class MyAbstractClass1 implements MyInterface{
  abstract void myDisplay();


  public void display(){
      System.out.println("In display");
  }
}

public class InterfaceDemo implements Interface1, MyInterface {

    void myDisplay(){
    }

    public void otherMethod(){
        System.out.println("In child default overriden");
        Interface1.super.otherMethod();
        MyInterface.super.otherMethod();
    }

    static void myStaticMethod(){

    }

    public void showMsg(){
    }

    public static void main(String[] args) {
        InterfaceDemo interfaceObj = new InterfaceDemo();
        System.out.println(NewInterface.a);
        interfaceObj.otherMethod();
        
        Interface1.myStaticMethod();
      // interfaceObj.display();

    }

    
    public void newMethod() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void newDisplay() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hello() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void multiInfo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }
}
