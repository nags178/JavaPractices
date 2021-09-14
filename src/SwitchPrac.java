import java.util.Scanner;

public class SwitchPrac{
    final static int x = 100;
    public static void main(String[] args) {
        /* String myInput = "This is Nag. This is my input";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.next();
        String name1 = scanner.next();
        int y = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        System.out.println(b);

        System.out.println("Enetered Input value is "+name);
        System.out.println("Other value : "+name1);
        System.out.println("My inte value: "+y);
        scanner.close(); */
       Integer number = 100; // number to check
        char ch = 'A';
        String level = "One";
        int b = 50;
       // int i = 1;
       char l =  switch(ch) {
            //int i = 10;
            case 'X'|'x' -> { // as u give block the scope is limited to its own case
                int i = 10; // not limited to this case. limited to entire switch
                // i = 10;
                System.out.println(i);
                yield 'A';
            }
            case 'Y', 'y', 'A', 'a' -> {
                int j = 10;
                //i = 5;
                System.out.println("20");
                System.out.println("in 20 case : "+j);
                yield 'B';
            }
            default -> {
                //j = 0;
                System.out.println("No case is matched ");
                yield 80;
            }
        };
        System.out.println("After switch : "+l);
        // Basic for loop
       /* for(int i = 1; i <= 5; i++){
            if(i == 3){
                System.out.println("Inside if");
                continue;
            }
            System.out.println("i value is "+i);
        }
        System.out.println("After for loop");
        // Nested For loop
       // * 
      //  * * 
      //  * * * 
      //  * * * * 
      //  * * * * * 

     // for(int i = 5; i >= 1; i--){
     //   for(int j = 1; j<=i; j++){
     //       System.out.print(j+" ");
     //   }
      //  System.out.println(); // new line
     // }
        aa:
        for(int i = 5; i>=1; i--){
            //inner loop
            bb:
            for(int j = 1; j<=i; j++){
                if(i==3 && j==3)
                    continue aa;
                System.out.print("i="+i+" j="+j+" ");
                cc:
                for(int k =1; k<=5; k++){
                    System.out.println(k);
                }
                
               // continue bb;
            }
            System.out.println();
           
        }

        System.out.println("Out of for"); 
        
        int i = 1;
        while(i<=0){
            System.out.println(i);
            
            //System.out.println(i);
            i++;
        }
        System.out.println("Out of while");

       int j = 11;
        do{
            System.out.println(j);
            //System.err.println();
            j++;
        }while(j<=10);
*/

       
        
    }
}