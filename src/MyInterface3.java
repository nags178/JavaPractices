public interface MyInterface3 {
    void myMethod3();
    //void myDisplay();

    public default void myDisplay(){
        System.out.println("In default mydisplay");
    }

    public default void defaultMethod(){
        System.out.println("In default mydisplay");
    }

     class InnerClassInterface {  // public and static
        int i;
        void innerMethod(){
            System.out.println("In inner method");
        }
    }

    
}
