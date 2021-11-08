class A implements TypeInterface{ // extends Object
    int i;

    void methodA(){
        System.out.println("In method A");
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }

    
}

interface TypeInterface{
    int i = 10;

    void display();

}

public class ReferenceTypeCasting extends A  implements TypeInterface{

    void methodRef(){
        System.out.println("In Method Ref");
    }

    int x = 10;

    A myDisplay(TypeInterface a){
        System.out.println("In mydisplay "+a.toString());
        return new ReferenceTypeCasting();
    }

    
    public static void main(String[] args) {
       

        ReferenceTypeCasting refObj = new ReferenceTypeCasting();

       // refObj.methodA();

        refObj.methodRef();

        refObj.display();

        A aObj = new A();  // upcasting from refObj to A class object

        aObj.methodA();

      // ((ReferenceTypeCasting)aObj).methodRef();

        refObj.methodRef();

        TypeInterface typeObj = refObj ;  // upcasting

        typeObj.display();

        if(typeObj instanceof ReferenceTypeCasting)   // false
        ((ReferenceTypeCasting)typeObj).display();

        refObj = (ReferenceTypeCasting)refObj.myDisplay(typeObj);

        System.out.println(refObj.x);

       // refObj.myDisplay(aObj);


       // aObj.methodRef();

      // String s = (String) refObj;

        


    }




    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }
}

class Super{
    void method1(){
        System.out.println("Method1");
    }
}

class SubClass11 extends Super{
    int i;
    void subMethod1(){
        System.out.println("sub method 1");
    }
}

class SubClass12 extends Super{
    int j;

    void subMethod2(){
        System.out.println("sub method 2");
    }
}

class Derived{
    public static void main(String[] args) {
        SubClass11 s1 = new SubClass11();
        s1.method1();

        SubClass12 s2 = new SubClass12();
        s2.method1();

        Super s = s1;  // Upcasting

        if(s instanceof SubClass11)
        ((SubClass11)s).subMethod1(); // Downcasting 

        String str = "ss";

        int i = 10;  // int - Integer, float - Float , double - Double  

        double d1 = 100.0;

        Integer i1 = i; // Boxing or Auto boxing

        int i2 = i1;  // Un boxing

        System.out.println(i1);

        int i3 = 130;

        double d = i3;  // primitive widening

        

        Double D = d; // Auto boxing

       // display(100); // when int - auto widening
       Integer i6 = 200;
        int i5 = i6;

        String str1 = String.valueOf(i5);
       display(Double.valueOf(i5)); // 1 - checks for same data argument
       // 2 - it does auto widening if there is a higher compatable parameter
        // 3 - if wrapper param is passed then unboxing and then widening

    }

    static void display(Double f){
        System.out.println(f+" value in display");
    }



   
}