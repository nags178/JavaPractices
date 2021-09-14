class ClassTest {
    int i;

    ClassTest(int c, int k, String s){  
       i = c;
       System.out.println("Name is "+s+"  value is "+k);
    }

    ClassTest(int c, int k){  
        i = c;
    }

     ClassTest(String s, int k, int c){
         System.out.println("In 3 ordered one");
     }

     ClassTest(int c){  
        // this();
         System.out.println("In int constructor");
        i = c;
     }

     ClassTest(String s){
         this(25);
        System.out.println("In string constructor");
     }

     ClassTest(){
         this("Nag");
         System.out.println("In default");
     }

     static public void main(String[] args) {

        System.out.println("Hello Team. How are you?");
	

  //  ClassTest myObj = new ClassTest(500, 20,"Nag");
  //  System.out.println(myObj.i);

       // ClassTest myObj2 = new ClassTest(1000);
      //  System.out.println(myObj2.i);

        ClassTest myObj3 = new ClassTest();

    }
 
}