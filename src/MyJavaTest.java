import newpack.packtest;

 class SubClass{
   private int num = 5;
   //int num = 10;

     String displayValue(String x, int y){
       
        return x+y;
    }

    int displayValue(int y, int x){
        System.out.println("in int method");
        return y+x;
    }

    long displayValue(long y, long x){
        System.out.println("In long method");
        return y+x;
    }

   private static void display(){
        System.out.println("In display");
    }
}
    //abstract void myMethod();

   

class MyJavaTest extends MySampleTest {
    int i = 100;

    MyJavaTest(){
        int i = 60;
       System.out.println("In java test constructor");
       System.out.println(super.i);
       System.out.println(this.i);
       System.out.println(i);
    }

    
    void display(){
        System.out.println("In child class method");
    }
  
    public static void main(String[] args) {
        
       MyJavaTest myObj = new MyJavaTest();
       myObj.display();
      //  myObj.getB();
       // myObj.setC(250);
        //myObj.a = 10;
       // System.out.println(myObj.i);
        //System.out.println(super.i);
        
       
      //  SubClass subObj = new SubClass(500,"Nag");
      //  MySampleTest sampleObj = new MySampleTest(100,true);
        
       // sampleObj.setC(500);
        //System.out.println(sampleObj.getC());
        
      //  packtest packObj =new packtest();
        //packObj.pa
       // MyJavaTest myObj = new MyJavaTest();
       // myObj.pa
        //sampleObj.my
        
        //display();
      //  SubClass.display();
       // String name = subObj.displayValue(10, "Hello All");
       // System.out.println(name);
       // System.out.println(subObj.displayValue(20, "NAG"));
      //  subObj.display();
       // SubClass subObj1 = new SubClass(10);
      ///  SubClass subObj2 = new SubClass("NAG");
      //  SubClass subObj3 = new SubClass(10,"NAG");
        //subObj.display();
       // MySampleTest mySampleObj = new MySampleTest();
       // mySampleObj.myMethod();
      //  MyJavaTest myObj = new MyJavaTest();
       // myObj.i = 100;
       // System.out.println(myObj.i);
      //  myObj.display();
      //  a = 100;
     //   MyJavaTest myObj1 = new MyJavaTest();
       // myObj1.i = 200;
       // System.out.println(myObj1.i);
      //  myObj1.display();
       // System.out.println("Static a now "+a);
       // System.out.println("i from obj "+myObj.i);
    }

}
