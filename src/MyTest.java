import java.beans.Transient;

public class MyTest{

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4; // a = a | 4;
        b >>= 1;
        c <<= 1;
        //a ^= c;
        System.out.println(a + " " + b + " " + c);



        int sampleVal = 10000;
        System.out.println("My Sample Value - "+sampleVal);
        int age=20;
        
        if(age<18){
            System.out.println("Age is greater than 18");
        }
        else{
            System.out.println("Age is less than 18");
        }
        
        //System.out.println("Post execution");  
       int number =20;
       switch (number) {
        case 10:
        System.out.println("10");
        //break;
        case 20:
            System.out.println("20");
        default: 
        System.out.println("no match");
        break;
        }
    }    
           

    void displayContent(){
        int i = 1;
       

        {
            System.out.println("In block "+i);
            int k = 5;
            System.out.println(k);
        }

        System.out.println(k);
    }

}
