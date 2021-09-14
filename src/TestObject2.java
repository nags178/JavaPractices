import Patterns.TestPattern;
import TestPack.TestObject;

class TestStudent1{
   private int b = 5;
}

public class TestObject2 extends TestPattern{ // Driver class - which is having an main method
    
    static int j = 5;
    int x = 1;
    int y = 2;

    void sum(){
       // TestObject testOldObj = new TestObject();
       // testOldObj.display();
       System.out.println(a);
       //TestPattern testPatternObj = new TestPattern();
    }

    public static void main(String[] args) {
        //System.out.println(TestObject.i);
       // Student1 studentObj = new Student1();
      //  System.out.println(studentObj.name);
        
        //studentObj.name
        //studentObj.
       // System.out.println(studentObj.a);
      //  TestStudent1 testStudentObj = new TestStudent1();
        //System.out.println(testStudentObj.b);
        TestObject2 testObj1 = new TestObject2();
        testObj1.x = 5;
        testObj1.y = 6;
        testObj1.sum();
        System.out.println(testObj1.x+" "+testObj1.y);

    }
}
