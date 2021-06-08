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

   
}

interface MultiInterface1{
    void multiInfo();
}

abstract class NewAbstractClass extends MyAbstractClass implements MultiInterface1 {
    int a = 20;

    

    void myAbstractMethod(){
        System.out.println("In child abstract implementation");
    }

   
    abstract void newMethod();

}



public class AbstarctClassDemo extends NewAbstractClass{

    void myAbstractMethod(int a){

    }

    int sum(int a, int b){
        
        return a+b;
    }


    void newMethod(){
        System.out.println("In new method");
    }

    
    public static void main(String[] args) {
        AbstarctClassDemo absObj = new AbstarctClassDemo();
        absObj.display();
        absObj.myAbstractMethod();
        System.out.println(absObj.sum(10, 20));
    }

    @Override
    public void multiInfo() {
        // TODO Auto-generated method stub
        
    }
}
