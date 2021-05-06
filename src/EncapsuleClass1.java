public class EncapsuleClass1 {
    int a = 10;
    private int b = 20;

    void display(){
        System.out.println(a+"  "+b);
    }

    public int myValueB() {
        return b;
    }

    public void myVaueB(int b){
        if(b > 1000)
            this.b = b;
    }
    
    public int myA() {
        return a;
    }

    public void myValueA(int a) {
        this.a = a;
    }

    
}
