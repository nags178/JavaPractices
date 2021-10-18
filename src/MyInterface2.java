public interface MyInterface2 extends MyInterface1, MyInterface3{
    int i = 20;
    
    void myDisplay();

    
     default void defaultMethod() {
        // TODO Auto-generated method stub
        MyInterface1.super.defaultMethod();
        MyInterface3.super.defaultMethod();
    }

    default void defaultMethod1(){ // public 
        System.out.println("In default method of 2");
    }

    static void myStaticMethod(){
        System.out.println("In static method");
    }

    
}
