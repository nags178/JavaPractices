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

public class MyCustomException {
 public static void main(String[] args) {
     int age = 0;
   
        validate(age);
    
 }
 
 static void validate(int age)  {
    try{
    if(age==0){
        throw new InvalidInput("wrong input");
    }
    if(age<18)  
        throw new InvalidAgeException("not valid");  
        else  
    System.out.println("welcome to vote"); 
    } catch(InvalidAgeException e){
        System.out.println("My Exception is "+e);
    }catch(InvalidInput ie){
        System.out.println("My Exception is "+ie);
    }
 }
}
