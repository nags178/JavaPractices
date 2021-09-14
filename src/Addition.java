import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int a = scannerObj.nextInt();
        int b = scannerObj.nextInt();
        
        int c = a + b;
        System.out.println("Addition value is "+c);
        scannerObj.close();
    }
}
