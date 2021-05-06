public class ConstructorDemo {
    int a, b;
    float c;
    String userName;
    
    private ConstructorDemo(){
        
        System.out.println("Default");
        a = 5;
        b = 10;
    }

    
    ConstructorDemo(int x, int y){
        this(x, y, "name");
        System.out.println("Parametered 1");
        a = x;
        b = y;
    }

    ConstructorDemo(int x, float y){
        this();
        System.out.println("Parametered 2 "+y+"  "+x);
        a = x;
        c = y;
    }

    
    private ConstructorDemo(int x, int y, String name){
        this(5, 4.5f);
        System.out.println("Parametered 3 ");
        a = x;
        b = y;
        userName = name;
    }


    

    public static void main(String[] args) {
        ConstructorDemo constructorDemoObj = new ConstructorDemo();
        System.out.println(constructorDemoObj.a+"  "+constructorDemoObj.b);
        
      //  ConstructorDemo constructorDemoObj1 = new ConstructorDemo(10,20);
      //  System.out.println(constructorDemoObj1.a+"  "+constructorDemoObj1.b);
        
     //   ConstructorDemo constructorDemoObj2 = new ConstructorDemo(30,40.5f);
      //  System.out.println(constructorDemoObj2.a+"  "+constructorDemoObj2.c);

     //   ConstructorDemo constructorDemo3 = new ConstructorDemo(15, 45, "My Team");
      //  System.out.println(constructorDemo3.a+"  "+constructorDemo3.b+" "+constructorDemo3.userName );
    }
}
