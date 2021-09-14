public class Employee { // extends Object {
    String empName;
    float salary = 10.0f;

    final void myDisplay(){
        System.out.println("In final mydisplay method");
    }

    protected static void display(){
        System.out.println("In employee display");
    }

    Employee(){
        //super();
        System.out.println("In parent/super class constructor");
    }

    Employee(int i){
        this();
        System.out.println("In employee parameterized constructor");
    }
}
