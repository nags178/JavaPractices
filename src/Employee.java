public class Employee { // extends Object {
    String empName = "Techie";
    float salary = 10.0f;

    final void myDisplay(){
        System.out.println("In final mydisplay method");
    }

    protected void display(){
        System.out.println("In employee display");
    }

    Employee(){
        //super();
        System.out.println(10 + 5);
        System.out.println("10" + 5);
        System.out.println("In parent/super class constructor");
    }

    void sum(byte a, byte b){
        short c = (short)(a + b);
        System.out.println(c);
    }

    Employee(int i){
        this();
        System.out.println("In employee parameterized constructor");
    }

   

    {
        System.out.println("In instance initialization block");

    }

    static{
        System.out.println("In static ini block");
    }
}
