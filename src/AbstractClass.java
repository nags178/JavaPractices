class MyDemo extends NewAbstractClass1 {
    
   MyDemo(){
        //super();
        System.out.println("In subclass constructor");
    }

    protected void newAbsMethod(){
        System.out.println("In new abs method");
        //return 1;
    }
    
    

    void newMessage(){
        System.out.println("In new message");
    }

    


}

class NewDemo {
    NewDemo(){
        System.out.println("In new demo constructor");
    }
}

abstract class NewAbstractClass1 extends AbstractClass{
    int i;
    abstract void newAbsMethod();

    void show(){
        System.out.println("In show method");
    }

    void display(){
        System.out.println("In display");
    }
}



public abstract class AbstractClass {

    int i = 10;

    abstract void display();

    abstract void newMessage();

     final void finalMethod(){
        System.out.println("In final method");
    }

    static void staticMethod(){
        System.out.println("In Static method");
    }

    void myMessage(){
        System.out.println("In my message");
    }

    AbstractClass(){
        System.out.println("In abstarct class constructor");
    }


    public static void main(String[] args) {
      //  AbstractClass abstractObj = new AbstractClass();
        System.out.println("Hi there");
        MyDemo myObj = new MyDemo();
        myObj.myMessage();
        myObj.display();
        myObj.newMessage();
        myObj.finalMethod();
        myObj.newAbsMethod();
        
        //myObj.staticMethod();
        AbstractClass.staticMethod();
    }
}
