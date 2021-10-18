interface i1{
    void hi();
}

public class InterfaceClass  implements i1, Interface_1, MyInterface2 {

    public void display(){
        System.out.println("In display");
    }

    public void hello(){

    }

    static void myStatic(){
        System.out.println("In child static");
    }

    public void defaultMethod1(){
        System.out.println("In default override");
        Interface_1.super.defaultMethod1();
        MyInterface2.super.defaultMethod1();
    }

   

    public void myDisplay(){

    }
    int i = 115;
 public static void main(String[] args) {
     int i = 10;
     InterfaceClass intObj = new InterfaceClass();
     intObj.display();
     intObj.defaultMethod1();
     intObj.defaultMethod();
     
     Interface_1.myStatic();
     System.err.println(intObj.i+"   "+Interface_1.i);
    // Interface_1.i = 200;
 } 
 
 class hi{

 }

@Override
public void hi() {
    // TODO Auto-generated method stub
    
}

@Override
public void newDisplay() {
    // TODO Auto-generated method stub
    
}

@Override
public void myMethod3() {
    // TODO Auto-generated method stub
    
}
}
