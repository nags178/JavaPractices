

//import NestedClassDemoNew.InnerClass1.NestInnerClass;

public class NestedClassDemoNew {
    int i;
    private String name;
    static int y = 100;

     void display(){
        System.out.println("In outer display  "+y);
        InnerClass1 innerObj = new InnerClass1();
        innerObj.innerDisplay(innerObj); 
        
        InnerClass1.NestInnerClass nestObj = innerObj.new NestInnerClass();
        nestObj.hello();

        

    }

      class InnerClass1{
        int k;
       // static int j;

        class NestInnerClass{
            
            void hello(){
                System.out.println("In hello"+y+"  "+j);
                display();
               // innerDisplay();
            }
        }

        void innerDisplay(InnerClass1 innerObj){
            //innerObj.k
            System.out.println("In inner display"+name+"  "+y);
           // display();
        }

        InnerClass1(){
            System.out.println("In inner class constructor");
        }

        

        
    }

    NestedClassDemoNew(){
        System.out.println("In outer constructor");
        InnerClass1 innerObj = new InnerClass1();
        //innerObj.innerDisplay();
    }

    public static void main(String[] args) {
        NestedClassDemoNew outerObj = new NestedClassDemoNew();
        outerObj.display();
       // NestedClassDemoNew.InnerClass1 innerObj = outerObj.new InnerClass1();
       // innerObj.innerDisplay();
      //  NestedClassDemoNew.InnerClass1.NestInnerClass nestObj = innerObj.new NestInnerClass();
       // nestObj.hello();
    }
}
