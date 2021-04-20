import java.util.Scanner;

public class exam3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumRow = 0;
        int sumCol = 0;
        // Reading matrix size
        // System.out.println("matrix size is:");
        int m = sc.nextInt();
        int n = 3;
        int[][] matarray = new int[m][n];
        // Reading elements into matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matarray[i][j] = sc.nextInt();
            }
        }
        // checking if sparse or not
        int counter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matarray[i][j] == 0){
                    counter++;
                    sumRow = sumRow + matarray[i][j];
                    for (int k = 0; k < n; k++) {
                        sumCol = 0;
                        for (int z = 0; z < m; z++) {
                            sumCol = sumCol + matarray[z][k];
                        }
                    }
                }
                   
            }
        }

        System.out.println("sumrow = "+sumRow+" sumcol= "+sumCol+" counter= "+counter);

        if (counter < ((m * n) / 2)) {
            System.out.println("-1");
        }

        // Calculates sum of each row of given matrix

        for (int i = 0; i < m; i++) {
            sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow = sumRow + matarray[i][j];
            }

        }
        

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (matarray[x][y] == 0) {
                    if (sumRow < sumCol) {
                        matarray[x][y] = matarray[x][y] + 1;
                        int result = 0;
                        while (result % 2 != 0) {
                            result++;
                            if (result % 2 == 0) {
                                matarray[x][y] = result;
                                break;
                            }
                        }

                    } else if (sumRow > sumCol) {
                        matarray[x][y] = matarray[x][y] + 1;
                        int result = 0;
                        while (result % 3 != 0) {
                            result++;
                            if (result % 3 == 0) {
                                matarray[x][y] = result;
                                break;
                            }
                        }
                    }
                }

            }
        }
        // printing the result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
