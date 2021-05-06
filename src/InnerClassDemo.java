public class InnerClassDemo {
    int a;
    static int b;
    private int c;
    //protected static class Inner_Class{
      private class Inner_Class{
        static final int x = 5;
        //static int w = 1;
        int num;
        private int z = 6;
        void display(){
            System.out.println("In inner class method-num val- "+num+" a value-"+a+"  b value- "+b+" c value- "+c);
        }

       // public static void main(String[] args) {
            
       // }
    }

    void displayInnerClassContent(){
        Inner_Class innerClassObj = new Inner_Class();
        //Inner_Class.x = 10;
        innerClassObj.display();
    }


    public static void main(String[] args) {
        InnerClassDemo driverClassObj = new InnerClassDemo();
        driverClassObj.a = 10;
       

        //driverClassObj.b = 100;
        InnerClassDemo.b = 100;
        InnerClassDemo.Inner_Class innerObj = driverClassObj.new Inner_Class();

       // Inner_Class innerClassObj = new Inner_Class();
        innerObj.num = 20;
        innerObj.display();
        driverClassObj.displayInnerClassContent();
    }
}
