public abstract class MyAbstarctClass implements MyInterface1,MySample.innerInterface1{

    abstract void display();

    abstract void newMethod();

    interface innerInterface{
        int i = 1;
         void innerdisplay();

         default void hello(){
             System.out.println("In default inner");
         }
    }

    
    
    final void constDisplay(){
        System.out.println("In final method");
    }

    MyAbstarctClass(){
        System.out.println("In abstract claas constructor");
    }

    public static void main(String[] args) {
        System.out.println("In main method of abstarct class");
        

    }


}
