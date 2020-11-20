package pack;

class A{
    private int id;
    int rollNo = 10;
    String myName;
    void display(){
        System.out.println("In main class");
    }
}
class B extends A{
    String name;
    int rollNo = 15;
    void subDisplay(){
        System.out.println("In sub class and roll no is "+super.rollNo);
        System.out.println("In sub class and roll no is "+this.rollNo);
    }
}

public class Test{  
    public static void main(String[] args){  
        B objB=new B();
        objB.display();
        objB.subDisplay();
        //System.out.println();
    //creating instance of the encapsulated class  
    //Student s = new Student();
    //setting value in the name member  
    //s.setName("Techie");  
    //getting value of the name member  
    //System.out.println(s.getName());  
    }  
}  