public class StringsDemo {
    int no = 5;
    //Integer number = new Integer("10");
    static String name = "Techie";
    static String str = new String("My New String");
    static String fname = "Techie";

    public static void main(String[] args) {
        
        name.concat(" Frogs");  // Techie Frogs
        name = name + " my company";  // Techie Frogs my company
        fname = fname.concat(" Turtles");
        //String s1 = "Saah";
        //String s2 = "AA";
        String s1 = "Sachin";
        //System.out.println(s2.compareToIgnoreCase(s3));
        //System.out.println(s1.compareTo(s2));
       // System.out.println(name+"  "+str+"  "+fname);
       
       int x = 20;
       String s2 = String.valueOf(x);
       s2 = "Welcome";
      // System.out.println(s1.startsWith("Ta"));
       //System.out.println((s1.trim()).endsWith("in"));
       //System.out.println(s1.trim().length());
       ///System.out.println(s1.charAt(5));
       //System.out.println("20" + 10);
       s1 = s1.replace("Sachin", "Tendulkar");
       //System.out.println();
      // System.out.println(s1);
        StringBuffer str1 = new StringBuffer();
        str1.append("Hi Team. This is our batch. zst");
      StringBuffer str = new StringBuffer("Welcome My Team. This is our batch");  //16 + 15 = 31 - 31*2 + 2 = 64
     // str.append(" Team. How r u all. Hope all r good");
     System.out.println(str.length());
      System.out.println("My capacity before "+str.capacity());
      str.ensureCapacity(105);
      System.out.println("My capacity after "+str.capacity());
      //str.insert(7,"Greetings");
      //str.replace(0, 7, "Greetings");
      //str.deleteCharAt(7);
      //str.delete(0, 7);
      //str.reverse();
      StringBuilder strBuild = new StringBuilder("Welcome");
      strBuild.append(" Team. Hope u all are good");
      System.out.println("My capacity before "+strBuild.capacity());
      System.out.println(str);
    }

    
}
