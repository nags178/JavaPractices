import javax.naming.ldap.Rdn;

public class MethodsDemo {
 int a, b;

public int display(int x, int y){
    System.out.println("In my method");
    System.out.println("In 2nd line of method");
    a = x;
    b = y;
   // int c = a + b;
    return a + b;
    
}

    public static void main(String[] args) {
        MethodsDemo methodsObj = new MethodsDemo();
        int d = methodsObj.display(10,20);
        System.out.println("After method");
        System.out.println(d);
        //System.out.println("after method 2");
    }
}
