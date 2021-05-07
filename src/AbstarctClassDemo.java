abstract class MyAbstractClass{
    
    int i = 10;
    
    void display(){
        System.out.println("In non-abstract method");
    }
    
    abstract void myAbstractMethod();

    abstract int sum(int a,int b);

    final void showMsg(){
        System.out.println("In final method");
    }

    static void myMsg(){
        System.out.println("In static method");
    }

    MyAbstractClass(){
        System.out.println("In my abstarct class constructor");
    }

    MyAbstractClass(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        MyAbstractClass.myMsg();
        AbstarctClassDemo absDemoObj = new AbstarctClassDemo(30);
        absDemoObj.myAbstractMethod();

    }

}

public class AbstarctClassDemo extends MyAbstractClass{

    AbstarctClassDemo(int i){
        super(i);
    }

    void myAbstractMethod(){
        System.out.println("In child abstract implementation");
    }

    void myAbstractMethod(int a){
        
    }

    int sum(int a, int b){
        
        return a+b;
    }

    public static void main(String[] args) {
        AbstarctClassDemo absObj = new AbstarctClassDemo(20);
        absObj.display();
        absObj.myAbstractMethod();
        System.out.println(absObj.sum(10, 20));
    }
}
