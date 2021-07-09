public class StaticNestedCassDemo {
    int i = 50;
    private int j = 30;
    static int z = 40;
    static void display(){
       // System.out.println("In display method");
        StaticInnerClass obj = new StaticInnerClass();
        obj.show();
        System.out.println("In display method end");
    }

    private static class StaticInnerClass{
        int k = 40;
        static int a = 40;
        void show(){
            //display();
            System.out.println("In show method: "+z);
        }
    }

    private static class StaticInnerClass1{
        int k = 40;
        void show1(){
            System.out.println("In show1 method");
        }
    }

    public static void main(String[] args) {
        StaticNestedCassDemo staticObj = new StaticNestedCassDemo();
        staticObj.display();
        
        //StaticNestedCassDemo.StaticInnerClass staticInnerObj = new StaticNestedCassDemo.StaticInnerClass();
       // staticInnerObj.show();
       // staticInnerObj.z;
    }
}
