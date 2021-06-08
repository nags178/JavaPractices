import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner scanObj = new Scanner(System.in);
        name = scanObj.next();
        System.out.println("Hello "+name+"!");
        scanObj.close();
    }
}
