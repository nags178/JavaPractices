import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("/");
        System.out.println("Enter vakue for name:");
        //sc.nextLine();
        String name = sc.next();
        
        System.out.println(name+" "+sc.delimiter());

       sc.close();

    }
}
