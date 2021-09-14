public class OperatorsDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        
       // System.out.println(i++ + ++j); // 10 + 11 = 21
       // System.out.println(++i + j++); // 12 + 11 = 23
        // i = 12  j = 12

        // 5 = 0101 = 1010 = -6 
       // System.out.println(~i); // 10 = 01010 = 10101  = 11011 = -11

       // boolean t = false;

      //  System.out.println(!t);

      //System.out.println(i + j);
     // System.out.println(i - j);
     // System.out.println(i * j);
     // System.out.println(i / j); // quotient
     // System.out.println(i % j); //  remainder 

     // val<<times = val * 2^times

     //System.out.println(10<<3); // 10 * 2 ^3 = 10 * 8 = 80
     //   System.out.println(5<<6); // 5 * 2 ^ 6 = 5 * 2*2*2*2*2*2 = 5 * 64 = 320

        //val>>times = val / 2^times

     //   System.out.println(10>>3); // 10 / 2^3 = 10 / 8 = 1

     //   System.out.println(5>>2); // 5 / 4 = 1

     // Bitwise AND(&) & OR(|)

     /*System.out.println(i<j & i++<j); // i = 10; j =5 false & false = false
     System.out.println(i);
     System.out.println(i>j | i<++j); // true | false = true
     System.out.println(j);

     // Logical AND(&&) and OR(||)
     System.out.println("in logical");
     i = 10;
      j = 5;
     System.out.println(i<j && i++<j); // false & false = false
     System.out.println(i);
     System.out.println(i>j || i<j++); // true |  = true
     System.out.println(j);

     System.out.println(i | j); // 
     //  1010
     //  1101
     //--------
     //  1111 
     i = 10;
     j = 5;
     i-=4; // i = i - 4 ;
     j+=3; // j = j + 3;
        System.out.println(i+"   "+j);
        short a = 5;
        short b = 5;
        b = (short)(a + b); // expression the default type is int
        System.out.println(i  < j);*/

        System.out.println(i & j);

    }
}
