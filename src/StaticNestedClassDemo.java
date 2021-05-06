//import OuterClass.NestedClass;

class OuterClass {
   // class StaticNestedClassDemo{
    static int i = 10;
    private int x = 15;

    static class NestedClass{
        int a = 5;
        static int y = 10;
        private int b = 10;

        void display(){
            a = 10;
            b = 20;
           // x = 30;
            i = 50;
            System.out.println("Values-> i= "+i+" a= "+a+" b= "+b);
        }

        public static void main(String[] args) {
            System.out.println("In inner class main");
        }
    }

    

//public static void main(String[] args) {
  //  StaticNestedClassDemo.NestedClass nestedObj = new StaticNestedClassDemo.NestedClass();
    //nestedObj.b
    //System.out.println(nestedObj.b);
    //nestedObj.display();
// }

}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
       OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
       //nestedObj.b
       nestedObj.display();
    }
}
