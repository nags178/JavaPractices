public class EncapsulationDemo {
   static int i;
   final int k =25;
   int name;
    public static void main(String[] args) {
        int age = 25;
        String name = "Techie";
       EncapsulatedClass encObj = new EncapsulatedClass(30,"Techie");
       //encObj.setAge(age);
       //encObj.setName(name);
       //encObj.getSal()
       System.out.println(encObj.myAgeValue()+"   "+encObj.getName());

      
    }

    public int getI(int a){
        this.i = a;
        return i;
    }


    public int getK() {
        return this.k;
    }


    public int getName() {
        return this.name;
    }

    public void setName(int name) {
        this.name = name;
    }
    

}
