public class Siva {
    int id;
    String name;
    void display(){
        System.out.println("in display");
    }
   
    Siva(){
        name = "Nag";
     }

     Siva(String n){
         name = n;
     }

     Siva(int i){
         id = i;
     }

     Siva(int i, String val){
        id = i;
        name = val;
    }

    public static void main(String[] args) {
       Siva sivaObj = new Siva();
       String val = "ravi";
       int i = 3;
        Siva sivaObj2 = new Siva(2);
        Siva sivaObj3 = new Siva(i,val);
        System.out.println(sivaObj3.id+"   "+sivaObj3.name);
        Abhi abhiObj = new Abhi(2);
        System.out.println(abhiObj.rollNo);
    }
    
}
