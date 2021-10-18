class SubProgrammer extends Programmer{
    public static void main(String[] args) {
        SubProgrammer subObj = new SubProgrammer();
        subObj.display();
    }
}

public class Programmer extends Employee{
    int k;
    String name;
    float salary = 5.0f;
    {
        System.out.println("In instance initialization block of programmer");

    }

    static{
        System.out.println("In static ini block - programmer");
    }

 // empname, salary, display()
    void programmerDisplay(){
        System.out.println("In programmer display");
        //super.display();
    }

    //final void myDisplay(){

  //  }

  final void myDisplay(int i){
      
  }

  void myReference(Employee emp){
      System.out.println(emp.empName+"  "+emp.salary);
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
        //Sample sObj = new Sample();
      //  pObj.display();
       // pObj.myDisplay();
        pObj.myReference(pObj);
        byte i = 10;
        byte k = 30;
        pObj.sum(i,k);
        //Employee.display();
    }
}
