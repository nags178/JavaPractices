public interface Interface_1 {
    int i = 5; // public static final int i
     void display(); //public abstract void display();
     void hello();
    
     default void defaultMethod1(){  // public
        System.out.println("In interface default method");
    }

    private static void myStatic(){  //public
        System.out.println("In interface static method");
    }

    private void hi(){
        
    }
    public static void main(String[] args) {
        System.out.println("In interface");
       // Interface_1 intObj = new Interface_1();
       InterfaceClass  intObj = new InterfaceClass();
       intObj.display();
    }
}

class c1 implements Interface_1{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hello() {
        // TODO Auto-generated method stub
        
    }
    
}
