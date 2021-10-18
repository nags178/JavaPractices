public class EncapsulationDemoNew {
    int i;
    int j;
    float f;
    private String name = "Techie"; 


    public int getI() {
        return this.i;
    }

    public void display(){
        
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public float getF() {
        return this.f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
}

class Demo{
    public static void main(String[] args) {
        EncapsulationDemoNew encObj = new EncapsulationDemoNew();
        encObj.setName("Techie Frogs");
        System.out.println(encObj.getName());
        
    }
}
