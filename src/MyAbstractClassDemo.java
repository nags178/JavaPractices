public abstract class MyAbstractClassDemo extends MyAbstarctClass implements MyAbstarctClass.innerInterface {
     int i;

     static int k;

     final int z = 10;

    public void display(){
        System.out.println("In implementation of my abstract method");
    }

    abstract void otherAbstractMethod();

    
    

    public static void main(String[] args) {
       // MyAbstractClassDemo myObj = new MyAbstractClassDemo();
        System.out.println("In extended abstract class");
        MyDemo1 myDemoObj = new MyDemo1();
        myDemoObj.display();
        myDemoObj.innerdisplay();
        String arr[] = {};
        MyDemo1.main(arr);
    }
        
}


class MyDemo1 extends MyAbstractClassDemo{

    public void helloAll(){
        System.out.println("In hello method");
    }

    
    void newMethod(){
        System.out.println("In implementation of abstract method");
    }

    public static void main(String[] args) {
        System.out.println("In mydemo1 main method");
    }


    @Override
    public void newDisplay() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void myDisplay() {
        // TODO Auto-generated method stub
        
    }


    @Override
    void otherAbstractMethod() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void innerdisplay() {
        System.out.println("In inner display");
        
    }


    @Override
    public void innerMethod() {
        // TODO Auto-generated method stub
        
    }

}
