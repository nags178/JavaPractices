package TestPack;

import mynewpack.Test;


public  class TestObject extends Test {
    private int a ; 

     int b ;
   // static int i = 500;

    void newDisplay(){
        System.out.println("New Display");
    }

    private void display(){
        //System.out.println("In old class Values of a and b "+ a +" "+b+" "+i);
     //   System.out.println(a+b);
      //  newDisplay();
       // TestObject.myDisplay();
    }

    static void myDisplay(){
        System.out.println("In static");
        TestObject tObj = new TestObject();
        tObj.display();
       // tObj.testDisplay();
       System.out.println(tObj.k);
        
    }

    
   

    private TestObject(int i, int j, String s){
       // this(i, j);
        System.out.println("In 3 param constructor");
        
    }

    private TestObject(String n, int i){
        this(i,n);
        System.out.println("In otger");
    }

    private TestObject(int i, String n){
        
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
      
        TestObject testObj = new TestObject();
        testObj.display();
        testObj.a = 10;
        testObj.b = 20;
        testObj.display();
        TestObject testObj2 = new TestObject(10,20,"Nag");
        testObj2.a = 100;
        testObj2.b = 200;
        testObj2.display();
        testObj.display();
    }
}
