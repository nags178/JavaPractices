import pack.Test;

class Student{
    int id;
    private String name;
    int no;
    

    void display(int a){
            System.out.println("In super method");
    }
   

    

    // public static void main(String[] args) {
    //     Student stObj = new Student();
    //     stObj.id = 1;
    //     stObj.name = "Nag";
    //     System.out.println(stObj.id+"  "+stObj.name);
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class TestStudent extends Student {
     int no;
     String str;

     TestStudent(){
         System.out.println("In default child");
     }

     TestStudent(int n){
        // this();
       // super(5, "50", "hello");
         System.out.println("single constructor");
        no = n;
     }

     TestStudent(int n, String s){
         this(s,n);
         no = n;
         str = s;
         System.out.println("in int and string");
     }

     

     TestStudent(String s, int n){
         this(n);
         System.out.println("in dual constructor");
        no = n;
        str = s;
     } 

     void display(){
       System.out.println("In empty subclass");
     }

     void display(int i){
        //System.out.println("In sub class "+i);
       // return i;
     }

     int display(int b,int a){
     // int c = (int)b + a;
       return a+b;
     }


    public static void main(String[] args) {

        TestStudent testObj = new TestStudent(50);
        //testObj.myContent();
        testObj.display();
        System.out.println(testObj.display(20,10));
        
        //display();
        



      //  Student stuObj = new Student();
      //  stuObj.id = 2;
     //   System.out.println("Name before value set="+stuObj.getName());
      //  stuObj.setName("Warriors");
      //  System.out.println("Name after value set="+stuObj.getName());
        
     //   stuObj.na
        
      //  TestStudent testStudent1 = new TestStudent();
        //TestStudent testStudent = new TestStudent(7,"nag");
      //  System.out.println("Data value="+testStudent.no+" "+testStudent.str);

      // test testObj = new test();
      // testObj.
      // testObj.name = "nag";
      // testObj.

      // test.display();
     //  String c =  testObj.add(10, 5, "Hi");
     //   System.out.println(c);
     //  testStudent.display();
      // System.out.println(testStudent.no );

       

      /// Student studentObj = new Student("Jameema", 1);
      // Student studentObj2 = new Student(1, "Nag", "Tutor");
     //  System.out.println(studentObj.id+"----"+studentObj.name);
     //  studentObj.display();
       
    }



     
        
    public void myContent() {
        System.out.println("In content method");
       // super.display();
       // this.display();
      //  super.no = 6;
      //  this.no = 5;
        
    }
    
    }
            

