public class StaticNestedClassDemo1 {
    static int i;
    private int j;
    int k;
    protected String name;

    void displayOut(){
        System.out.println("In display out ");;
    }

    static void displayStatic(){
        System.out.println("In static display outer");
    }

    StaticNestedClassDemo1(){
        System.out.println("In constructor");
    }

    static class MyStaticClass{
        private int l;
        int m;
        static int y;

        void displayNon(){
            System.out.println("In nonstatic display");
            display();
            displayStatic();
           // System.out.println();
        }

        static void display(){
            
            System.out.println("In static display");
        }

         MyStaticClass(){
            System.out.println("In static inner class constructor");
        }

        public static void main(String[] args) {
            StaticNestedClassDemo1 staticObj = new StaticNestedClassDemo1();
            System.out.println(staticObj.name);

            MyStaticClass myObj = new MyStaticClass();
            myObj.displayNon();
        }

    }


    public static void main(String[] args) {
        StaticNestedClassDemo1.MyStaticClass nestObj = new StaticNestedClassDemo1.MyStaticClass();
        nestObj.displayNon();
        
    }
}
