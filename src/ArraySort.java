
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int n;
        Scanner scanObj = new Scanner(System.in);
        n = scanObj.nextInt();
        Float[] numArr = new Float[n];
        for(int i = 0; i < n; i++){
            numArr[i] = scanObj.nextFloat();
        }
        Arrays.sort(numArr, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            System.out.println(BigDecimal.valueOf(numArr[i]));
        }

        scanObj.close();
    }   
}
