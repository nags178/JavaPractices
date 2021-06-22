package Patterns;

import java.util.Scanner;

public class RightPascalTriangle 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        // MY INPUT NUMBER VALIDATION MENTIONED BELOW
        int n;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n=obj.nextInt();
        } while (n <= 0);
        System.out.println("YES IT IS POSITIVE NUMBER AND ENTERED NUMBER : " + n);
        
        //LOGIC
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    } 
    
}
