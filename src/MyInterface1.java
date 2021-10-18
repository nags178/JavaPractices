@FunctionalInterface
public interface MyInterface1 {
    int i = 6; // public static final int i = 6; // constants

     int j = 10;

    private void display(){
        System.out.println("In display private method");
        myStaticMethod();
    } 

    default void defaultMethod(){ // public 
        System.out.println("In default method of 1");
        display();
    }

    static void myStaticMethod(){
        System.out.println("In static method");
        
    }
    
    void newDisplay();// public abstract void newdisplay();

    

    

    public static void main(String[] args) {
        System.out.println("In main of interface");
       // MyInterface1 myObj = new MyInterface1(){
            
       // };
       // myObj.display();
    }
}
