public class MultilevelInheritanceDemo extends InheritanceDemo {

    String myName = "NAG";

    static public void showMsg(){
        System.out.println("In Multilevel demo class");
    }

    public void display(InheritanceDemo inheritObj){
        System.out.println(inheritObj.a+"  "+inheritObj.b);
    }



   // MultilevelInheritanceDemo(){
   //     //super();
   //     System.out.println("In multi level constructor");
   // }

    public static void main(String[] args) {
        MultilevelInheritanceDemo multiObj = new MultilevelInheritanceDemo();
       // InheritanceDemo inheritObj = new InheritanceDemo();
        multiObj.display();
        multiObj.display(multiObj);
       // InheritanceDemo.myMsg();
        //MultilevelInheritanceDemo.myMsg();
        //multiObj.myDisplay();
    }
}
