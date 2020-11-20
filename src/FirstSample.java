 class sample{
    int i;
    String name;
     int a;
    sample(){
       System.out.println("In constructor");
       System.out.println();
       i=1;
       name="Sridevi";
    }
    sample(int rank,String n){
       i= rank;
       name = n;
    }
    sample(int rank,int age,String n){
       i= rank;
       name = n;
       a=age;
    }
   
   }
   

public class FirstSample {
    public static void main(String[] args) { 
    
        sample firstObj = new sample();
        System.out.println(firstObj.i+"  "+firstObj.name);
        sample firstObj1 = new sample(3,"abc");
        System.out.println(firstObj1.i+" "+firstObj1.name);
        sample firstObj2 = new sample(1,28,"Abc");
        System.out.println(firstObj2.i+" age="+firstObj2.a+" Name="+firstObj2.name);
      
        sridevi sriObj = new sridevi();
        System.out.println(sriObj.i+"  "+sriObj.name);
        sridevi sr = new sridevi(2, "sri");
        System.out.println(sr.i+"  "+sr.name);
        
    }
}