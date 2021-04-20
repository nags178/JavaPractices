import java.util.Scanner;
public class PermutationsSample {
    public static void main(String[] args) {
        int n, m, k, x;
        int noOfWays=0;
        Scanner scannerObj = new Scanner(System.in);
        n = scannerObj.nextInt();
        m = scannerObj.nextInt();
        k = scannerObj.nextInt();
        x = scannerObj.nextInt();
        noOfWays = books(n, m, k, x);
        System.out.println(noOfWays);
        scannerObj.close();
    }

    public static int books(int n, int m, int k, int x){
        int ways=0;
        ways = combination(n,1) * combination(m,x) * combination(k,x);
        return ways;
    }

    static int combination(int a, int b){
        int comb = 0;
        try{
        comb = factorial(a) / (factorial(b) * factorial(a-b));
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        return comb;
    }

    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while(i <= n) {
           fact *= i;
           i++;
        }
        return fact;
     }


    
}
