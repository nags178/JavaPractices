

public class NestedClassDemo {
    private int i = 100;
    static int y = 50;
     void display(){
        InnerClass innerObj = new InnerClass();
        innerObj.show();
        NestedClassDemo.InnerClass.InnerClass3 innerObj3 = innerObj.new InnerClass3();
        innerObj3.display1();
        System.out.println("In display method");
    }

    protected class InnerClass{
        int j;
        
        void show(){
           // display();
           // display();
            System.out.println("In show method "+i+" "+y);
        }

        
        public class InnerClass3{
            int z;
            void display1(){
                System.out.println(i+"  "+j);
            }
        }
    }

    private class InnerClass1{
        int j;
        void display(){
            System.out.println("In inner display method");
        }
    }

    public static void main(String[] args) {
        NestedClassDemo nestedObj = new NestedClassDemo();
        nestedObj.display();
       // NestedClassDemo.InnerClass innerObj = nestedObj.new InnerClass();
      //  innerObj.show();
      //  NestedClassDemo.InnerClass1 innerObj1 = nestedObj.new InnerClass1();
      //  innerObj1.display();
      //  NestedClassDemo.InnerClass.InnerClass3 innerObj3 = innerObj.new InnerClass3();
      //  innerObj3.display1();
    }
}
