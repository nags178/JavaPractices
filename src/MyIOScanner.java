import java.util.Scanner;

public class MyIOScanner {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         int num = validatePositiveNumber(sc);
        int k = validatePositiveNumber(sc);
        
        // int num=0;
       /*   do 
        {
            System.out.println("Enter the positive number");
            while (!sc.hasNextInt())
            {
                System.out.println("This is not a number. Please enter number" );
                sc.next();
            }
            num = sc.nextInt();
        } while (num <=0);
 
        System.out.println("It's a number: "+ num);  */
    
        int r, sum=0,
        temp=num; 
       // String s="hello";
       // s="helloworld";
      //  System.out.println(s);
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
          sc.close();
    }

    static int validatePositiveNumber(Scanner scanner) {
        
        int number;
        do {
            System.out.print("Please enter a positive number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number. Please enter valid number\n", input);
            }
            number = scanner.nextInt();
        } while (number < 0);

        System.out.printf("You have entered a positive number %d.\n", number);
        return number;
    }
    
}
