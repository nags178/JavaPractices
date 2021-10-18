public class MyInterfaceDemo extends MySample implements MyInterface1, MyInterface2 {

    
    public void newDisplay(){
        System.out.println("In new display method implementation");
    }

    public void myDisplay(){
        System.out.println("In my display");
        
    }

    public void defaultMethod(){
        
    }

    

    void display(){
        System.out.println("In display of class");
        
    }

    public void helloAll(){
        System.out.println("In helloAll method");
    }

    public static void main(String[] args) {
        MyInterfaceDemo myObj = new MyInterfaceDemo();
        myObj.newDisplay();
        myObj.myDisplay();
        myObj.defaultMethod();
        MyInterface2.myStaticMethod();
        myObj.myMethod3();
        System.out.println(MyInterface1.i+"  "+MyInterface1.j+"  "+MyInterface2.j);
        
    }
}
