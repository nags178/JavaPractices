

  public class MySampleTest extends MySuperClass {
    private int c = 100;
    boolean s = false;
    byte b= 127;
    short s1 = 454;
    
    char ch = 'c';
    float f = 50.00f;
    long  l = 56667665467657568l;
    double d = 43544565476576876976857658678768789879789.00;
    public static void main(String... args) {
        //static int b = 50;
        System.out.println("Hi");
        MySampleTest samObj = new MySampleTest();
        
    }

     void display(){
        System.out.println("In parent class method");
    }

    public MySampleTest(int c, boolean s) {
        this.c = c;
        this.s = s;
        System.out.println("In parameter constructor");
    }

     MySampleTest() {
        System.out.println("In sample test construrctor");
    }
   
        

    public boolean myS(){
        return this.s;
    }

    public boolean getS() {

        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public byte getB() {
        return this.b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public short getS1() {
        return this.s1;
    }

    public void setS1(short s1) {
        this.s1 = s1;
    }

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public char getCh() {
        return this.ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public float getF() {
        return this.f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public long getL() {
        return this.l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public double getD() {
        return this.d;
    }

    public void setD(double d) {
        this.d = d;
    }

     
    

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c = c;
    }

    protected void myMethod(){
        int a = 10;
        System.out.println("In sample test method");
        
    }
}
