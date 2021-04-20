import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        int length, startIndex, endIndex;
       
        Scanner scannerObj = new Scanner(System.in);
        length = scannerObj.nextInt();
        int numbers[]=new int[length];
        int subArr[] = new int[length];
        for(int i=0; i<length; i++)  
        {  
        //reading array elements from the user   
        numbers[i]=scannerObj.nextInt();  
        
        } 

        startIndex = scannerObj.nextInt();
        endIndex = scannerObj.nextInt();

        for(int i=0; i<=endIndex; i++){
            if(i == startIndex-1){
                subArr[i] = numbers[i];
            }
        }
        int num = subArr.length;
        int[] y = new int[num];
        int p = num;
        for(int i=0; i<num; i++)
        {
            y[p - 1] = subArr[i];
            p = p - 1;
        }
    }
}
