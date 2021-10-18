 class MyStudent{

    MyStudent(){
        System.out.println("In Mystudent constructor");
    }

    int k;
    void hello(){
        System.out.println("In student method");
    }

    

    public static void main(String[] args) {
       
        
        MyClassDemo mybj1 = new MyClassDemo("200");
        mybj1.display();
       // mybj.i = 100;
        //MyClassDemo.j = 200;
        

        MyClassDemo myOtherObj = new MyClassDemo("Nag G",100);
        //myOtherObj.i = 150;
        //MyClassDemo.j = 350;
        System.out.println("In 2nd obj "+myOtherObj.i+"  "+myOtherObj.j);
       // System.out.println("In 1st obj "+mybj.i+"  "+mybj.j);
    }
}



public class MyClassDemo {
    int i = 10;
    static int j = 20;
    String fullName;
    int a = 100;

    MyClassDemo(){
       // this(100);
       this(100);
        System.out.println("In default");
    }

    MyClassDemo(String name){
        this();
        fullName = name;
        //i = b;
        System.out.println("In 2 parameterised string constructor");
    }

    MyClassDemo(int s, String name){
        this(name);
        fullName = name;
        //i = b;
        System.out.println("In 2 parameterised 2 reverse constructor");
    }

    MyClassDemo(String name, int b){
        this(b,name);
        fullName = name;
        i = b;
        System.out.println("In 2 parameterised 2 constructor");
    }

    MyClassDemo(int a){
        i = a;
        System.out.println("In parameterised int constructor");
    }

     


    void MyClassDemo(){
        i = 5;
        j = 10;
        System.out.println("In my class demo constructor");
    }

    void display(){
        System.out.println("In display method");
    }

   /* public static void main(String[] args) {
        MyClassDemo myObj = new MyClassDemo();
        myObj.display();
        myObj.i = 5;
        MyClassDemo.j = 100;
        System.out.println(myObj.i+"   "+MyClassDemo.j);
        MyClassDemo myObj2 = new MyClassDemo();
        myObj2.i = 10;
        MyClassDemo.j = 500;
        System.out.println(myObj.i+"  "+myObj2.i+"  "+MyClassDemo.j);
        MyStudent myStudentObj = new MyStudent();
        myStudentObj.hello();
        MyStudent myStudentObj2 = new MyStudent();
        myStudentObj2.hello();
        
    }*/
}
