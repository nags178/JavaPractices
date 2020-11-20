public class Operators {

    public static void main(String args[]){  
        //Unary Operators  ++ and --

        /* int x=10;  
        System.out.println(x++);//10 (11) 
        System.out.println(x); 
        System.out.println(++x);//12  
        System.out.println(x--);//12 (11) 
        System.out.println(x);
        System.out.println(--x);//10  

        int y=10;  
        int z=10;  
        System.out.println(y++ + ++y);//10+12=22  
        System.out.println(z++ + z++);//10+11=21 
        System.out.println(z); 
        
        //Unary Operators  ~ and !

        int a=10;  
        int b=-10;  
        boolean c=true;  
        boolean d=false;  
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
        System.out.println(!c);//false (opposite of boolean value)  
        System.out.println(!d);//true  
        
        //Arithmetic Operators

         int a=10;  
        int b=5;  
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0 */  

        //Left Shift Operator
        
         System.out.println(10<<2);//10*2^2=10*4=40  
        System.out.println(10<<3);//10*2^3=10*8=80  
        System.out.println(20<<5);//20*2^5=20*32=640 
        System.out.println(15<<4);//15*2^4=15*16=240   

        System.out.println(10>>2);//10/2^2=10/4=2    
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2

        /* int a=10;  
        int b=20;  
        a+=4;//a=a+4 (a=10+4)  
        b-=4;//b=b-4 (b=20-4)  
        System.out.println(a);  
        System.out.println(b);   */
        
        short a=10;  
        short b=10;  
        a=20;
        //a+=b;//a=a+b internally so fine  
       // a=a+b;//Compile time error because 10+10=20 now int  
         a=(short)(a+b);//20 which is int now converted to short  
        System.out.println(a);  
       // Operators op = new Operators();
       Operators.sumOfTwoNumbers("fdg", b); 
       //sumOfTwoNumbers(3,5);
       


       Operators.sumOfTwoNumbers(a, b);
      // sumOfTwoNumbers(10,15);
        //System.out.println(d);
    }

   static void sumOfTwoNumbers(String a, int b){
        int c = a+b;
        System.out.println("Sum of 2 numbers "+c);
    }
        
}
