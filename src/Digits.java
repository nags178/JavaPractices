import java.util.Scanner;

public class Digits {
 
public static void main (String[] args) throws java.lang.Exception 
{ 
    int n; 
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int smallest = 9; 
    while(n != 0)  
    { 
        int r = n % 10; 
        smallest = Math.min(r, smallest); 
  
        n = n / 10; 
    } 
    System.out.println(smallest); 
}   
}
