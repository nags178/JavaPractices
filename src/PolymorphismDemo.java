public class PolymorphismDemo {
    void add(){
        System.out.println("In add no parameters");
    }

    long add(int a, int b){
        System.out.println("In add with 2 int values with long "+(a+b));
        return a+b;
    }

    void add(int a, float b){
        System.out.println("In add with 2 diff params "+(a+b));
    }

    void add(int b, String a){
        System.out.println("In add with order changed params "+(a+b));
    }

    void add(int a, int b, int c){
        c = a + b;
        System.out.println("In add with 3 params "+c);
    }
    int x = 30;
    int y = 50;
    long z = 0;
    public static void main(String[] args) {
        PolymorphismDemo polyObj = new PolymorphismDemo();
      //  polyObj.z = polyObj.x + polyObj.y;
       // System.out.println(polyObj.z);
      //  polyObj.add();
      polyObj.add(5, 10.5f);
        polyObj.z = polyObj.add(5, 10);
        System.out.println(polyObj.z);
       // polyObj.add(20, 30, 0);
      ///  polyObj.add("10", 20);
      //  polyObj.add(10, "20");
    }
}
