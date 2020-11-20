class Student{
    int id;
    String name;
    void display(){
        System.out.println("In method");
    }
    Student(){
        System.out.println("In my student constructor");
    }

    Student(int i, String n){
        id = i;
        name = n;
        System.out.println("in 1");
    }

    Student(String n, int i){
        id = i;
        name = n;
        System.out.println("in 2");
    }

    Student(int i, String n, String des){
        System.out.println(i+"  "+n+"  "+des);
    }
}

public class TestStudent {
     int no;
     public TestStudent(){
         no = 5;
        System.out.println("in constructor");
     }


    public static void main(String[] args) {
        
      //  TestStudent testStudent = new TestStudent();
     //   System.out.println(testStudent.no);

       

       Student studentObj = new Student("Jameema", 1);
       Student studentObj2 = new Student(1, "Nag", "Tutor");
       System.out.println(studentObj.id+"----"+studentObj.name);
       studentObj.display();
       
    }
        
    
            
}
