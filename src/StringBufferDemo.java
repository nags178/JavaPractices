public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(); // empty string

       // str.append("Nag works with ");
        

        StringBuffer str1 = new StringBuffer("Hello Team");
        str1.append("Welcome, this session is our java session");
       // System.out.println(str1.capacity());

        StringBuffer str2 = new StringBuffer(10);
        str2.append("Hello All welcome ");
        
        str2.append("To java");

        str2.insert(2, "Hi");
       // System.out.println("string length:"+str2.length());

        //System.out.println(str2.capacity()); // capacity *2 +2

        str2.ensureCapacity(47);

       // System.out.println(str2.capacity());



        System.out.println("length: "+str1.length()+"  lastindex: "+str1.lastIndexOf("ion"));

        System.out.println("length: "+str1.length()+"  lastindex: "+str1.lastIndexOf("ion", 48));
        

        
        //System.out.println(str1);
       // System.out.println(str1.reverse());




    }
}
