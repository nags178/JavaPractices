import java.io.IOException;
import java.sql.SQLException;

public class MyNewCustomException extends RuntimeException{  // custom Un-checked exception
    MyNewCustomException(){
        System.out.println("In my exception constructor");
    }

    MyNewCustomException(String message){
        super(message);
    }
    

    static void myMethod(int age)  {
        MyNewCustomException myExc = new MyNewCustomException("Not valid age to vote");
        if(age < 18){
            throw new ArithmeticException();
        }
    }
}

class Parent{
    void display() throws ArithmeticException, IOException{
        System.out.println("In parent display");
    }
}

class MyTestClass extends Parent{
    // Scenario - 1 : If parent method not throwing any exception, ur child may or may not throw only Un-checked exception(s) 
    // Scenario - 2 : If parent method throwing any Checked exception, ur child may or may not throw only Un-checked exception(s) and the thrown checked exception only
    // Scenario - 3 : If parent method throwing any Un-Checked exception, ur child may or may not throw only Un-checked exception(s) 
    void display() throws IOException ,ArithmeticException, ArrayIndexOutOfBoundsException{
        System.out.println("In child display");
    }

    public static void main(String[] args) {
        
    }

}
