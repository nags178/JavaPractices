public class MySuperClass{ //extends Object {
    int a = 500;
    float b = 500.35f;
    int i = 57657;

    void display(){
        System.out.println("In my super class method "+ a+"  "+b);
    }

    MySuperClass(){
        System.out.println("In My Super class constructor");
    }

    public static void main(String[] args) {
        MySuperClass superObj = new MySuperClass();
        superObj.display();

    }

   
}
