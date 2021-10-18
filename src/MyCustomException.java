import java.io.IOException;

class InvalidAgeException extends IOException{
    InvalidAgeException(String message){
        super(message);
    }
}

class InvalidInput extends Exception{
    InvalidInput(String msg){
        super(msg);
    }
}

public class MyCustomException  {
 public static void main(String[] args) throws InvalidAgeException, InvalidInput, ArithmeticException {
     int age = 10;
   
        validate(age);
    
 }
 
 static void validate(int age) throws InvalidAgeException, InvalidInput {
    if(age == 5){
        ArithmeticException ae = new ArithmeticException("My value is 5");
        throw ae;
    }
    if(age==0){
        throw new InvalidInput("wrong input");
    }
    if(age<18)  
        throw new InvalidAgeException("not valid");  
        else  
    System.out.println("welcome to vote"); 
    
 }
}
