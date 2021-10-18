class Student{
    int x;
    private int y;
}

class Student1 {
    private int a = 10;
    int b = 20;
    static String name = "Hello";
    private void display(){
        System.out.println("In student1 class method");
    }

    

    public static void main(String[] args) {
        Student stuObj = new Student();
       // stuObj.y = 10;
    }

}
