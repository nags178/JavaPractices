

public class MethodsDemo {
 int a, b;

public boolean display(int x, int y){
    System.out.println("In my method");
    System.out.println("In 2nd line of method");
    a = x;
    b = y;
    int c = a + b;
    displayNamesOfWeek(); // static
    display1();  // instance
    //return 20;
    if(c == 30){
        System.out.println("In if block");
        return true;
    }
    else{
        System.out.println("In else block");
        return false;
    }
}

   public static void displayNamesOfWeek(){
       System.out.println("In display");
       
   }

    void display1(){
       System.out.println("Other display");
   }
   


    public static void main(String[] args) {
        MethodsDemo methodsObj = new MethodsDemo();
        boolean d = methodsObj.display(40,20);
        System.out.println("After method");
        System.out.println(d);
        MethodsDemo.displayNamesOfWeek();
        System.out.println("After method");
        //System.out.println("after method 2");
    }
}
