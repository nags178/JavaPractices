import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingNewDemo {
    public static void main(String[] args) {
        int a = 10;
        String s = "a";
        Scanner scObj = new Scanner(System.in);
        Scanner scObj2 = new Scanner(System.in);
        int b;
        try{
        b = scObj.nextInt();
        System.out.println("after input");
        System.out.println(s.charAt(0));
        System.out.println("after length");
       
        }
        catch(Throwable ie){
            
            //b = scObj.nextInt();
           // ie.printStackTrace();
           // ie.getMessage();
           
            System.out.println(ie.getMessage());

        }
       
        
        finally{
            System.out.println("In finally");
            scObj.close();
        }
        
        int c = returnNumber(10);
        System.out.println("The c value "+c);
        System.out.println("After exception");

        try (scObj2) {
            
        } 
    }


        static int returnNumber(int a){
            
            try{
               // ArithmeticException ae = new ArithmeticException();
                throw new ArithmeticException("Not valid condition"); 
                //System.out.println(a/0);
               // System.exit(0);  // forcebly exiting your program
              //  return a/0;
            }catch(ArithmeticException ae){
                
                ae.printStackTrace();
              //  System.exit(0);
                return a/2;
               // System.out.println("After rerun");
            }catch(InputMismatchException ae){
                
                ae.printStackTrace();
              //  System.exit(0);
                return a/2;
               // System.out.println("After rerun");
            }
            finally{
                System.out.println("In method finally");
            } 
            
            
        }
}