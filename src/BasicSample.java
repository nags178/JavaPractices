public class BasicSample {

    int j ;  // heap area: declared at the class level and can be accessed only using the instance or object of the class
    static int z ; // static and stack area

    final int y;  // its a final value that cannot be changed further

   

    final static int MYCONSTANT;  

    { // Instance Intitialization Block - IIB
        y = 10;

    }

    static  // Static Initialization Block  - SIB
    {
        MYCONSTANT = 200;
    }

     static  public void main(String... ar) {
        //System.out.println("In main "+ar[0]);

        int i = 10;
        int i1 = 20;
        i = 30;
        i1 = 100;
        z  = 150;

        BasicSample basicObj = new BasicSample();
        basicObj.display();
       // basicObj.y = 100;
        System.out.println("Static value = "+BasicSample.z);

        if(true){
            int k = 20;

            System.out.println(BasicSample.z);
        }


       // System.out.println(k);
    }

     void display(){
        System.out.println(BasicSample.z);
    }

   
}
