public class EncapsulationDemo {
    public static void main(String[] args) {
        EncapsuleClass1 encObj = new EncapsuleClass1();
        encObj.myVaueB(1100);
        encObj.myValueA(300);
        System.out.println(encObj.myValueB()+"  "+encObj.myA());
        //encObj.display();
    }
}
