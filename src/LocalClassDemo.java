public class LocalClassDemo {
    int a;
    static int b;



    public class InnerClass{  // Inner Class
        int i;
        
        void innerDisplay(){
            System.out.println("In inner class display");
        }

        void display(){
            int l;
            System.out.println("In display");
    
             class LocalClass{  // Local Inner class // inside the block
                private int k;
    
                void myDisplay(){
                    
                    System.out.println("In my local class display");
                }
    
                LocalClass(){
                    System.out.println("In local class constructor");
                }
            }
    
            LocalClass localObj = new LocalClass();
            localObj.myDisplay();
        }
    }

    public static class StaticInnerClass{   //Nested class
        static int j;
        int b1;

        void staticDisplay(){
            System.out.println("In static display");
        }
    }

    public static void main(String[] args) {
        LocalClassDemo myObj = new LocalClassDemo();
        //myObj.display();
        
        StaticInnerClass staticObj = new StaticInnerClass();
        staticObj.staticDisplay();

        InnerClass innerObj = myObj.new InnerClass();
        innerObj.innerDisplay();
        innerObj.display();
    }
}
