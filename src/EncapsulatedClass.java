public class EncapsulatedClass {
 private int age;
 private String name;
  float sal;

  EncapsulatedClass(int age, String name){
    this.age = age;
    this.name = name;
  }
    public static void main(String[] args) {
        
    }

    public float getSal(){
        return sal;
    }

    public int myAgeValue(){  // Accessor or getter
        return age;
    }

    public void setAge(int age){  // Mutator or setter
        this.age = age;
    }

    public String getName(){  
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }


}
