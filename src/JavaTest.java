class JavaTest {
    static int add = 10;
    int sum;
    boolean status = true;
    byte byteVar = 127;
    int i = 50000;
    long l = 100455;
    float f = 250.01f;
    double d = 300.0;
    char c = 'A';
     static public void main(String... args) {
         int number = 50;
       
       
       // System.out.println("Hi  "+args[0]+" "+add);
        
        JavaTest javaTestObj = new JavaTest();
        javaTestObj.sum = 5;
        javaTestObj.display();
        System.out.println(javaTestObj.byteVar);
        javaTestObj.add = 10;
        //System.out.println();
    }
    static void otherDisplay(){
    
    }

    void display(){
        System.out.println(JavaTest.add);
        //sum
        otherDisplay();
        JavaTest.otherDisplay();
    }



 
}
