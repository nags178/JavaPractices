package Patterns;

public class TestPattern { //extends Object 
    protected int a;
    public int b;
    private int z = 30;

     static protected void myDisplay(){
        //System.out.println("In test pattern "+ a+"  "+b);
    }

    public TestPattern(){
        System.out.println("In testpattern constructor");
        //TestPattern.
    }

    public TestPattern(int a, int b){
        this.a = a;
        this.b = b;
    }
    
}
