import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        int length;
        int sum = 0;
        int index = 0;
        int cube = 0;
        Scanner scannerObj = new Scanner(System.in);
        length = scannerObj.nextInt();
        int numbers[]=new int[length];
        for(int i=0; i<length; i++)  
        {  
        //reading array elements from the user   
        numbers[i]=scannerObj.nextInt();  
        } 
        
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        System.out.println("Sum : " + sum);
        for (int i = 0; i <= sum; i++) { 
     
            cube = i * i * i; 
     
            if (cube == sum) { 
                System.out.println("Yes"); 
                return; 
            } 
            else if (cube > sum ) { 
                System.out.println(cube-sum); 
                return; 
            } 
            
        }
    }
}
