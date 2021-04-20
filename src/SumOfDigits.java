import java.util.Scanner;

public class SumOfDigits {

    static int getSum(int n)
    {
        int sum = 0;
 
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
 
        return sum;
    }
    
    public static void main(String[] args) {
        int length;
        int sum = 0;
        
        Scanner scannerObj = new Scanner(System.in);
        length = scannerObj.nextInt();
        int numbers[]=new int[length];
        int sumArr[] = new int[length];
        for(int i=0; i<length; i++)  
        {  
        //reading array elements from the user   
        numbers[i]=scannerObj.nextInt();  
        } 

        for(int i=0; i<length; i++){
            sumArr[i] = getSum(numbers[i]);
        }

        for(int i=0; i<length; i++){
            System.out.print(sumArr[i]+" ");
        }

        
    }
}
