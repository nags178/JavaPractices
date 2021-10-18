public class NestedClassDemo1 {
    static int n;
    int i;
    private String name = "Techie";

    void displayOut(){
        System.out.println("In outer display");
        MyInnerClass myObj = new MyInnerClass();
        myObj.k = 10;
        myObj.display(new MyInnerClass());
        myObj.display(new MyInnerClass());

        if(myObj.k == 10){
            class IfInner{ // local inner class
                int y;

                void ifDisplay(){
                    System.out.println("In if inner display");
                }
            }
            IfInner ifObj = new IfInner();
            ifObj.ifDisplay();
        }

         class MethodInner{  // Method local inner class or local inner class
            int k;
           // static int y = 1;
           void methodDisplay(){
               System.out.println("In method inner display "+name);
           }
        }

        MethodInner methodObj = new MethodInner();
        methodObj.methodDisplay();

    }

    protected class MyInnerClass{ // Member Inner classes
        private int k;
        public boolean b;
       // static int y = 1;
        int j;

        void display(MyInnerClass myRef){
            System.out.println("My k vakue is "+ myRef.k );
            System.out.println("In inner class display");
            System.out.println(name+"  "+n+"  "+i);
            System.out.println("Inner elements "+k+"  b "+b);
            //displayOut();
        }

        MyInnerClass(){
            System.out.println("Inner class constructor");
        }

        MyInnerClass(int i){
            this();
            System.out.println("Inner class parameterized constructor");
        }

        class DeepInnerClass{
            int a;
        }

        

    }

    public static void main(String[] args) {
        NestedClassDemo1 outerObj = new NestedClassDemo1();
        outerObj.displayOut();
       // NestedClassDemo1.MyInnerClass nestedObj = outerObj.new MyInnerClass();
      //  nestedObj.display();
        

    }
}
