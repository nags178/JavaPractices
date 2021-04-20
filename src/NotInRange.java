import java.util.Scanner;

public class NotInRange {

    static void countInRange(int arr[], int n, int x, int y) 
    { 
        for (int i = 0; i < n; i++) { 
            // check if element is not in range 
            if (arr[i] < x || arr[i] > y) {
                System.out.println("not in range ="+arr[i]);
            }    
        } 
    } 

    public static void main(String[] args) {
        int n, minRange, maxRange; 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        minRange = sc.nextInt();
        maxRange = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)  
        {    
        arr[i]=sc.nextInt();  
        }
        countInRange(arr, n, minRange, maxRange);
    } 
          
}
