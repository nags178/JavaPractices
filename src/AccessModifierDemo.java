class HelloAll{
    public static void main(String[] args) {
        HelloAll heloObj = new HelloAll();
        heloObj.fName = "Nag";
        heloObj.hello();
    }

    int k;
    private String fName;

    void hello(){
        System.out.println("In hello method");
    }

    private HelloAll(){
        System.out.println("Hello constructor");
    }
 }
 
 public class AccessModifierDemo {

     int a; // default
    private String name;
    static int k;

    void display(){
        System.out.println("In display");
    }

    private void hello(){
        System.out.println("In hello");
    }

    //Static Initialization block
    static{
        k = 100;
        System.out.println(k);
    }
   // Static Initialization Block(SIB)> Main > Initialization Block(IB) > Constructors
    //Initialization block
    {
        a = 5;
        name = "Nag";
        k = 10;
        System.out.println(name+"  "+k+"  "+a);
    }

    //Initialization block
    {
        a = 15;
        name = "Techie";
        k = 20;
        System.out.println(name+"  "+k+"  "+a);
    }

     AccessModifierDemo(){
        System.out.println("In private constructor");
    }

     AccessModifierDemo(int i){
        System.out.println("In constructor ");
    }

    private class Inner{
        int i;
        
        void innerDisplay(){
            System.out.println("Inner display");
        }

    }

    public static void main(String[] args) {
        System.out.println("In main");
        AccessModifierDemo accessObj= new AccessModifierDemo();
        accessObj.hello();
        
        
        //studentObj.a = 5;
    }
}

 class hello{

}
