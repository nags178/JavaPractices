import java.util.Scanner;

public class DistinctNumbers {
    public static int DCount(int a[],int n)
    {
        int res=0;
        
        for(int i=0;i<n;i++)
        {
            int j;

            for (j = 0; j < i; j++)

               if (a[i] == a[j])
                    break;

            if (i == j)
            {
                res++;
                System.out.println(a[i]);
            }
        }
       // System.out.println();
         return  res;
     }
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          int[] a=new int[50];
          System.out.println( "enter size of an array");
          int size=sc.nextInt();
          System.out.println( "enter elements of an array");

          for(int i=0;i<size;i++)
          {
                 a[i]=sc.nextInt();
          }

          System.out.println( "total distinct number of element "+DCount(a,size));
     }
}
