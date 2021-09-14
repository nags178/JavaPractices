class SeniorAccountant extends Employee{

    SeniorAccountant(){
        //super();
        System.out.println("In senior - accountant constructor");
    }

    void myAccount(){
        System.out.println("In account");
    }
}

class SubAccountant extends Accountant{

    SubAccountant(){
        //super();
        System.out.println("In sub-accountant constructor");
    }

    public static void main(String[] args) {
        SubAccountant subObj = new SubAccountant();
        subObj.display();
    }
}

public class Accountant extends SeniorAccountant{
    Accountant()
    {
        //super();
        System.out.println("In accountant constructor");
    }
}
