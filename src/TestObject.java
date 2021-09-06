public class TestObject {
    private int a ; 
    int b ;
    static int i = 500;

    void display(){
        //System.out.println("In old class Values of a and b "+ a +" "+b+" "+i);
        System.out.println(a+b);
    }

     TestObject(int a, int b){
         this("Nag",b);
        System.out.println("In my constructor");
         int k = 6;
        this.a = a;
        this.b = b;
    }

    TestObject(int i, int j, String s){
        this(i, j);
        System.out.println("In 3 param constructor");
        
    }

    TestObject(String n, int i){
        this(i,n);
        System.out.println("In otger");
    }

    TestObject(int i, String n){
        
        System.out.println("In string constructor");
        a = i;
        System.out.println("My a value is: "+a+"  and name  value is "+n);
        //TestObject();
    }

    TestObject(){
        this(50, 100, "Nag");
        System.out.println("In default constructor");
    }
    

    public static void main(String[] args) {
       System.out.println(TestObject2.j);
        TestObject testObj = new TestObject();
        testObj.display();
        testObj.a = 10;
        testObj.b = 20;
        testObj.display();
        TestObject testObj2 = new TestObject();
        testObj2.a = 100;
        testObj2.b = 200;
        testObj2.display();
        testObj.display();
    }
}
