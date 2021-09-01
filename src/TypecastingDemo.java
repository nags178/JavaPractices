class Animal{
    void eat(){
        System.out.println("Animal");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("cat method");
    }

    void eat(){
        System.out.println("cat overiding");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog eat");
    }

    void bark(){
        System.out.println("dog barks");
    }
}

public class TypecastingDemo {
    public static void main(String[] args) {

        Cat catObj = new Cat();

        Animal animalObj = catObj; //

        animalObj.eat();

        ((Cat)(animalObj)).meow();

        Animal animalObj1 = new Dog();

        animalObj1.eat();

        if(animalObj instanceof Cat)
        ((Cat)(animalObj)).meow();

        

        int i = 100;

        String s1 = "200";

        int z = Integer.parseInt(s1);

        System.out.println(z);

        long l = i; // widening or implicit type casting or Automatic type casting

        float f = 9.99f;

        int j = (int)f; // Narrowing or Explicit Type casting

        byte b = 42;
        char c = 'a';
        short s = 1024;
        double d = .123;


        System.out.println(j);

        float result =(int) ((f  * b) + (i / c) - (d * s));

        System.out.println(result);

        b =(byte)(b * 2);

        System.out.println(b);


    }
}
