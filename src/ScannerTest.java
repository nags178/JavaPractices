import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        
        //sc.useDelimiter("/");
        //System.out.println("Enter age");
        //int age = sc.nextInt();
       do{
            System.out.print("Please enter age: ");
            while (!sc.hasNextInt()) {
                //String input = 
                sc.next();
                
                System.out.println("Entered value is not a valid age. Please enter valid age");
            }
            age = sc.nextInt();
        } while (age <= 0);

        System.out.println("Enter value for name:");
        //sc.nextLine();
        String name = sc.next();  // string value  \n
        sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        //boolean b = sc.nextBoolean(); \n
        System.out.println("The name is "+name+" age is "+age+"  address is "+address+"  char is "+name.charAt(2));
        
        System.out.println(sc.delimiter());

       sc.close();

    }
}
