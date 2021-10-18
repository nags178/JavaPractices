import java.util.Scanner;

public class LoopingConstructsDemo {
  static int k = 10;
 public static void main(String[] args) {
    
    /* int num = 10;
    // Simple for loop
     for(int i = 1; i <= num; i++){
         System.out.println("My value is "+i);
        
        // break;
     }


     //Nested for loop
     for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= 5; j++){
            System.out.println(i+"   "+j);
            break;
        }
        break;
     }

     System.out.println("Out of loop");

     //Labeled for loops
     Loop1:
     for(int i = 1; i <= 5; i++)
        System.out.println("In loop"+i);
        System.out.println("In loop again");
     {
        //break Loop2;
       Loop2:
        for(int j = 1; j <= 5; j++){
            //System.out.println(i+"   "+j);
            //break Loop1;
        }
     }

     //while loop
     int i = 1;
     while(i<=10){
        System.out.println("In loop & value of i is "+i);
       // i++;
     }
    // System.out.println("In");*/

     //do - while loop

     int i;
     
     Scanner scannerObj = new Scanner(System.in);
     i = scannerObj.nextInt();
     scannerObj.close();
     //System.out.println("1");
     myLoop:
     do{
        //System.out.println("2");
         k++;
        i++;
         if(i == 5)
            break myLoop;
            //System.out.println("3");
        System.out.println("In loop value - "+i);
        
     }while(i<=10);

 }   
}
