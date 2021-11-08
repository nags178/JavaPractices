public class TypeCastingNewDemo {
    public static void main(String[] args) {
        int a = 10; // Integer
        float b = 10.0f;
        b = a;  // Implicit Type casting or Upcasting or Widening or Automatic Type casting is appled by compiler
        a = (int)b; // No we need to do explicit type casting or Narrowing or downcasting
        short b1 = (byte)(a + b); // Short

        double a1 = 5;   // Double
        float c1 = 10;
        b1 = (byte)(c1 + a1);

        float d = (c1 * 5) + (b1 * c1); // Wrapper class float - Float

        Animal1 animalObj = new Cat1();

        String s = "1234";
        int i = Integer.valueOf(s);//Integer.parseInt(s);
        String s1 = Integer.toString(i); //String.valueOf(i);
        String s2 = String.format("%d",i);
       // System.out.println(s2);

        //animalObj.eat();
       // animalObj.meow();
      //  display(animalObj);

        Object obj = animalObj; // upcasting

        Animal1 animalObj1 = new Dog1();
       // display(animalObj1);
       /// animalObj1.bark();

       Integer i1 = new Integer(100);  // Wrapper class
      // int i1 = 100;  // primitive
      int i2 = i1; // Unboxing - Wrapper class is converted to primitive
      System.out.println(i2);

      int i3 = 10;
      Integer i4 = i3;  // Boxing or Auto-Boxing : Primitve to Wrapper

      System.out.println(i4);
        
      display((double)i3);


    }

    static void display(Double i){
        System.out.println("My value is "+i);
    }

    static void display(Animal1 interObj){
        interObj.eat();
        if(interObj instanceof Dog1){
            Dog1 c = ((Dog1)interObj); // explicit or Down casting
            c.bark();
            System.out.println("In display " +c);
        }else{
            System.out.println("Not the dog instance");
        }
        

}
}

class SuperAnimal{
    void eat(){
        System.out.println("In super");
    }
}

class Animal1 extends SuperAnimal{
    int i = 10;
    void eat(){
        System.out.println("In animal eat");
    }
}

interface NewInterfaces{
    int k = 50;
    void eat();
}

class Dog1 extends Animal1{
    void eat(){
        System.out.println("In dog eat");
    }

    void bark(){
        System.out.println("in bark");
    }
}

class Cat1 extends Animal1 implements NewInterfaces{
    int j = 5;
    public void eat(){
        System.out.println("In eat of cat");
    }

    void meow(){
        System.out.println("In cats meow method");
    }
}
