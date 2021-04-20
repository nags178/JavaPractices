public class Operators {
  static int abc;
    public static void main(String args[]){  
       // String str = "gdsdgdfhgjhkgyhhgsfe65r7gdxgdgdsr";
       // String s = "34545";
       // char ch='c';
       // int a=10;
     //   Unary Operators  ++ and --
       
       // System.out.println(abc);
/*
         int x1=10;  
         x1 = x1 - 1;

         System.out.println("X value is "+ x1);

        System.out.println("X value now "+ --x1);


        System.out.println("X value is "+ x1--);//10 (11) 

         
        
        System.out.println("X value is "+x1); 



        
        
        //Unary Operators  ~ and !

       int a1=10;  
        int b1=-10;  
        boolean c1=false;  
        boolean d1=false;  
        System.out.println(~a1);//-6 (minus of total positive value which starts from 0) 
        System.out.println(~b1);
        System.out.println(c1);
        System.out.println(!c1);
        
        Explanation:

        a = 5 [0101 in Binary]
        result = ~5

        This performs a bitwise complement of 5
        ~0101 = 1010 = 10 (in decimal)

        Then the compiler will give 2’s complement
        of that number.
        2’s complement of 10 will be -6.
        result = -6

        System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
        System.out.println(!c);//false (opposite of boolean value)  
        System.out.println(!d);//true  
        
        //Arithmetic Operators

         int a1=10;  
        int b1=5;  
        System.out.println(a1+b1);//15  
        System.out.println(a1-b1);//5  
        System.out.println(a1*b1);//50  
        System.out.println(a1/b1);//2  
        System.out.println(a1%b1);//0 

        
        //Left Shift Operator
        float f = 10>>2;
         System.out.println(10<<2);//10*2^2=10*4=40  
        System.out.println(3<<3);//10*2^3=10*8=80  
        System.out.println(20<<5);//20*2^5=20*32=640 
        System.out.println(15<<4);//15*2^4=15*16=240   

        System.out.println(f);//10/2^2=10/4=2    
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2
*/
         int a1=10; 
         String str = "Hello All"; 

        int b1=20;  
        a1 += 4;//a1=a1+4 (a=10+4)  
        b1 -= 4;//b1=b1-4 (b=20-4) 
        
  //    str = str + 10 ;

  //    a1 = a1 + 10;

    //  System.out.println(str);
        
    //    System.out.println(a1);  
      //  System.out.println("b value is "+b1);   
        
        int a=1;  
        int b=5;  
        int c=12;  

        c %= 5; // c = c % 5;

        int min = (a<b)? a : b;  
       // System.out.println(min);  

        //System.out.println(a<b || a++>c);//false && = false  
        //System.out.println(a);//10 because second condition is not checked  

        //System.out.println(a<b | a++<c); //false && true = false  
        //System.out.println(a);//11 because second condition is checked  
        
   /*     int val1 = 10;
    int val2 = 20;
    int val3 = 30;
    int val4 = 40;
 
    int result1, result2, result3, result4;
 
    // Increment operator
    result1 = ++val1;
    result2 = val2++;
 
    // Decrement operator
    result3 = --val3;
    result4 = val4--;
 
    System.out.println("Value 1 = " + val1);
    System.out.println("Value 2 = " + val2);
    System.out.println("Value 3 = " + val3); 
    System.out.println("Value 4 = " + val4); 
 
    System.out.println("Result 1 = " + result1); 
    System.out.println("Result 2 = " + result2);
    System.out.println("Result 3 = " + result3);
    System.out.println("Result 4 = " + result4);

    System.out.println(result1++); */
    int z = 10;
    //System.out.println(z*++z);
    //System.out.println(++z);
    System.out.println(++z*++z); // 12
    System.out.println(z);

    int val1 = 0;
    val1 = val1 + z;
    //  System.out.println(val1);
   // System.out.println(++a*++a);

      /*  int a2=10;  
        float b2=10.5f;  
        int c2;
        a2=20;
        //a2 = a2 + b2;//a=a+b internally so fine  
        b2 = a2+b2;//Compile time error because 10+10=20 now int  

         a2=(int)(a2+b2); //20 which is int now converted to short  
        System.out.println(a2);  


        int x = 5;
        int y = 5;
        System.out.println(x >= y); 
       // Operators op = new Operators();
        //Operators.sumOfTwoNumbers("fdg", b); 
       //sumOfTwoNumbers(3,5);
       


       Operators.sumOfTwoNumbers(a, b);
      // sumOfTwoNumbers(10,15);
        //System.out.println(d);*/
    }

   static void sumOfTwoNumbers(int a, int b){
        int c = a+b;
        System.out.println("Sum of 2 numbers "+c);
    }
        
}
