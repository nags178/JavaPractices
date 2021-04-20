import java.util.Scanner;

public class DuplicateNumbers {
    public static void DCount(int a,int b, int c, int d)
    {
        int[] numArr=new int[4];
        numArr[0] = a;
        numArr[1] = b;
        numArr[2] = c;
        numArr[3] = d;
        int res=0;
        int dupCount = 0;
        int diffCount = 0;
        for(int i=0;i<4;i++)
        {
            int j=0;
            for (j = 0; j < i; j++)
            {
               if (numArr[i] == numArr[j])
                    dupCount += numArr[i];
                    break;
            }
            if (i == j)
            {
                res = res+numArr[j];
            }
        }
        res = res - dupCount;
        diffCount = res - dupCount;
        System.out.println("Difference count= "+diffCount);
     }
     
     public static void main(String[] args) 
     {
         int a, b, c, d;
          Scanner sc=new Scanner(System.in);
          a =sc.nextInt();
          b =sc.nextInt();
          c =sc.nextInt();
          d =sc.nextInt();
          DCount(a,b, c, d);
          sc.close();
     }
}
