abstract class AbstractClass1 {

    int i;

    abstract void display();

    abstract void other();

    void displayAll(){
        System.out.println("In display all");
    }

    final void hello(){
        System.out.println("In hello");
    }

    static void staticMethod(){
        System.out.println("In static");
    }

    AbstractClass1(){
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        AbstractClassDemo absObj = new AbstractClassDemo();
        absObj.display();
    }
}

abstract class OtherClass1 extends AbstractClass1{

    
}

class AbstractClassDemo extends OtherClass1{

    void display(){

    }

    void other() {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        AbstractClassDemo absObj = new AbstractClassDemo();
        absObj.displayAll();
    }

    
    
}
