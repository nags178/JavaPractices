import java.util.Scanner;

public class exam {
    static int sumRow;
    static int sumCol;
    static int zeroCounter = 0, nonZeroCounter = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading matrix size
        // System.out.println("matrix rowsize is:");
        int m = sc.nextInt();
        // System.out.println("matrix colsize is:");
        int n = 3;
        int[][] matarray = new int[m][n];
        // Reading elements into matrix
        // System.out.println("enter matrix elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matarray[i][j] = sc.nextInt();
            }
        }
        // checking if sparse or not
        
        checkSparseMatrix(m, n, matarray);
        System.out.println("zero counter- "+zeroCounter+"  non-zero counter- "+nonZeroCounter);
        if(zeroCounter<nonZeroCounter){
            System.out.println("-1");
        }
      //  while(zeroCounter>=nonZeroCounter){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matarray[i][j] == 0){
                        sumRow = rowSum(i, n, matarray);
                        
                        sumCol = colSum(m, j, matarray);
                        System.out.println("col sum " + sumCol);
                       if(sumRow < sumCol){
                           for(int a = 1; a <= 1000; a++){
                               if((a+sumRow)%2==0){
                                matarray[i][j] = a;
                                break;
                               }
                            }
                       }
                      /* else if(sumRow > sumCol){
                        for(int a = 1; a <= 1000; a++){
                            if((a+sumRow)%3==0){
                             matarray[i][j] = a;
                             break;
                            }
                         }
                       }*/
                       
                    }
                }
            }
     //       checkSparseMatrix(m, n, matarray);
      //  }
        
                
        // printing output
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matarray[x][y] + " ");
            }
            System.out.println();
        }

    }

    static void checkSparseMatrix(int m, int n, int matarray[][]){
        zeroCounter = 0; 
        nonZeroCounter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matarray[i][j] == 0)
                    zeroCounter++;
                else
                    nonZeroCounter++;
            }
        }
    }

   static int rowSum(int a, int b, int matarray[][]){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sumRow = sumRow + matarray[i][j];
            }
        }
       // System.out.println("row sum " + sumRow);
        return sumRow;
    }

    static int colSum(int a, int b, int matarray[][]){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sumCol = sumCol + matarray[i][j];
            }
        }
        return sumCol;
    }
}
