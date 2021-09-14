public class Employee { // extends Object {
    String empName;
    float salary = 10.0f;

     static void display(){
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
