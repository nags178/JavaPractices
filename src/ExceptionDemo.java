import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a , b;
        //a = 5;
       // b = 0;
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        try{
            // write the code that may cause the exception
            a = sc.nextInt();
            b = sc.nextInt();
            if(a>5){
                ArithmeticException ae = new ArithmeticException("My value is gretaer than 5");
                throw ae;
            }
        } catch(InputMismatchException ie){
           System.out.println("In catch block");
           a = 10;
           b = 0;
           
           try{
            int i = a/b;
           }catch(ArithmeticException ae){
            int i = 10/2;
            System.out.println(i);
           }
           //throw ie;
           
         }

         try{
            arr[6] = 8;
            System.out.println("in try");
         }
        catch(ArrayIndexOutOfBoundsException aie){
            arr[4] = 8;
            System.out.println("My array value is "+arr[4]);
        }catch(Exception e){
            

        }
        
        finally{
            System.out.println("Before close");

            sc.close();
        }
        

   
    }
}
