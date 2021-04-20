import java.util.Scanner;

public class ATM {
    static int minimumWithdrawal(int N, int ATM[], int X){
        int sum = 0, count = 0;
        for(int i=0;i<N;i++){
            sum = sum + ATM[i];
            if(sum == X){
                count++;
                return count;
            }
            if(sum < X){
                count++;
            }
        }
        if(sum<X){
            return -1;
        }
        else{
            return count;
        }
    }
    public static void main(String[] args) {
        int N, X, withdrawalCount;
        Scanner scannerObj = new Scanner(System.in);
        N = scannerObj.nextInt();
        int[] ATM = new int[N];
        for(int i = 0; i<N; i++){
            ATM[i] = scannerObj.nextInt();
        }
        X = scannerObj.nextInt();
        withdrawalCount = minimumWithdrawal(N, ATM, X);
        System.out.println(withdrawalCount);
        scannerObj.close();
    }
}
