import TestPack.TestObject;

class Car{
    int size;
    String model;
    static String s = "Techie";
    static final int j;
    static final float PIE;
    boolean b ; // false
    byte b1 = 12; // 1 byte default = 0 range = -128 to 127
    short s1 = -327; // -32,768 to 32,767  default = 0  2 bytes
    int i1 = 344565; // - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) default  = 0  4 bytes
    long l1= 34534345543543L; // (-2^63 to 2^63 -1  default = 0L  8 bytes
    float f1 = 3.14f; // 4 bytes default = 0.0f  unlimited
    double d1 = 3.14; // 8 bytes default = 0.0D  unlimited
    static char c = 65; // 65

    static
    {
        j = 100;
        PIE = 3.14f;
    }

    void speed(){
        System.out.println("Having 120KMPL");
    }

    void size(){
        System.out.println("x volume of size");

    }



    public static void main(String[] args) {

         int y = 5, z = 6, d = 7 ;
         y = 6;
      //   System.out.println("Character value : "+Car.c);

        Car carObj = new Car();
       // carObj.speed();
      // System.out.println(Car.s); 

        Test1 testObj = new Test1();

       // testObj.display();
        testObj.name = "Frogs";

        Test1.lastName = "My Org";

       // System.out.println(Test1.lastName);
        Test1 testObj1 = new Test1();
        testObj1.name = "Techie";
        testObj1.name  = "Techiefrogs";

        Test1.lastName = "New Org";

        //TestObject testObj2 = new TestObject(15,25,"nag");
        //testObj2.display();
        ///    System.out.println(testObj2.b);
      //  System.out.println(TestObject.i);

       //TestObject testObj22 = new TestObject();
      //  testObj22.display();

       // System.out.println(Test1.lastName);


    }

}

public class Test1 {
    int num;
    String name;
    static String lastName;

     void display(){
        System.out.println("Hello Team");
        myDisplay();
    }

    static void myDisplay(){
        System.out.println("In static method");
        //display();
    }

    public static void main(String[] args) {
        int i = 10;

        Test1 testObj = new Test1();

        System.out.println(Test1.lastName);

        System.out.println(testObj.num+"  "+testObj.name+"  "+i);

        testObj.display();

        

        
        testObj.myDisplay();


       

    }
}
