public class StringBufferNewDemo {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();  // created an empty string & capacity as 16
        
        //StringBuffer str = "hello";

        StringBuffer strBuff1 = new StringBuffer("Hello Team");  // deafult capacity(16) + length of the string = capacity
       // System.out.println(strBuff1.capacity());

        StringBuffer strBuff2 = new StringBuffer(100); // used capacity constructor
       // System.out.println(strBuff2.capacity());

        strBuff.append("Hi Team. Welcome to the training session"); // original string is getting modified
       
        strBuff.append("Good Morning"); // capacity = 40 
       

        strBuff.append(". Practice well. It helps you to gain more knowledge");
       // System.out.println(strBuff.length()+"   "+strBuff.capacity()); // old capacity * 2 + 2 

        

        int a = 500;

        strBuff.insert(1, false);
       

        strBuff.replace(0, 3, "My");

        strBuff.delete(0, 5);
        strBuff.deleteCharAt(5);

        strBuff.reverse();

        System.out.println(strBuff1+"  "+strBuff1.capacity());

       // strBuff1.append(". Welocme to the java training. Dont miss any of the sessions. Lets all grow together. Welcome");

        strBuff1.ensureCapacity(100);  // old = 26*2 + 2 = 54

        System.out.println(strBuff1.length()+"  "+strBuff1.capacity());
       // System.out.println(strBuff);


        //System.out.println(strBuff);











    }
}
