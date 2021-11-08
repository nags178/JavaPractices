public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        char ch = 'Z';

        int i = ch;  // Widening or Automatic Type Casting or Implicit Type Casting

        long l = i; // (long)i

        float f = 90.43f; // (float)l

        l = (long)f; // Narrowing or Explicit type casting. We are using the cast operator "()"

        ch = (char)i;

        i = 250;

        byte b = (byte)i;

        b = (byte)(b+ch);

        double d = 100.00;

        d = b+i+ch+l+f+d;
        
        short s = 70;

        s = (short)(s * 2 + d);

        System.out.println(s);

    


    }
}
