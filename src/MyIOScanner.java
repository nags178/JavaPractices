import java.util.Scanner;

public class MyIOScanner {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        MyIOScanner myObj = new MyIOScanner();
         int num = myObj.validatePositiveNumber(sc);
       int k = myObj.validatePositiveNumber(sc);
       int l = myObj.validatePositiveNumber(sc);
       sc.close();
        // adddig one comment
        
       /*  int num=0;
          do 
        {
            System.out.println("Enter the positive number");
            while (!sc.hasNextInt())
            {
                System.out.println("This is not a number. Please enter number" );
                sc.next();
            }
            num = sc.nextInt();
        } while (num <=0);*/
 
        System.out.println("It's a number: "+ num);  
    
        int r, sum=0,
        temp=num; 
       
         while (num != 0)
         {
             r=num%10;
             sum =(sum*10)+r;
             num=num/10;
         }
         if(temp==sum)
         System.out.println(temp+" is a Palidrome number");
         else
          System.out.println(temp+" not a palidrome number");
         
    }




     int validatePositiveNumber(Scanner scanner) {
         
        int number;
        do {
            System.out.print("Please enter a positive number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input+" is not a valid number. Please enter valid number");
            }
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("You have entered a positive number "+ number);
       
        return number;
       
        
    }
    
}
