public class TestObject {
    private int a = 5; 
    int b = 10;
    static int i = 500;

    void display(){
        //System.out.println("In old class Values of a and b "+ a +" "+b+" "+i);
        System.out.println(a+b);
    }

    protected TestObject(){
        System.out.println("In my constructor");
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
