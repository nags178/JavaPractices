public class Programmer extends Employee{
    int k;
    String name;
    float salary = 5.0f;
 // empname, salary, display()
    void programmerDisplay(){
        System.out.println("In programmer display");
        //super.display();
    }

    //final void myDisplay(){

  //  }

  final void myDisplay(int i){
      
  }

    protected static void display(){
        System.out.println("In child display ");
        display();     
    }

    // private < default < protected < public 

    Programmer(){
      // super();
        super(100);
       // this();
        System.out.println("In child class constructor");
    }

    public static void main(String[] args) {
        Programmer pObj = new Programmer();
        System.out.println(pObj.salary);
        pObj.display();
        pObj.myDisplay();
        //Employee.display();
    }
}
