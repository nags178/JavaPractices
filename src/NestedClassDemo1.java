public class NestedClassDemo1 {
    static int n;
    int i;
    private String name;

    void displayOut(){
        System.out.println("In outer display");
        MyInnerClass myObj = new MyInnerClass();
        myObj.display();
        myObj.k = 10;
    }

     class MyInnerClass{
        private int k;
        public boolean b;
        //static int y;
        int j;

        void display(){
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
