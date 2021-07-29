public class StringsNewDemo extends StringsDemo{
    public static void main(String[] args) {
        String s = "Hello Team";
        String s1 = new String();  // some memory in heap
        s1 = "Hi"; //it creates new instance and points that memory location to s1
        String s2 = new String("Welcome");
        char ch[]={'h','e','l','l','o'};
        String s3 = new String(ch);
        System.out.println(s+"  "+s1+"   "+s2+"   "+s3);

        String str="Sachin";
        String str1 = "Sazhin"; //q r s t u v w x y z
        String str2 = "Sahin";
        String str3 = new String("Sachin");
        str = str.concat(" Tendulkar"); // Sachin Tendulkar
                                        // 012345
        // System.out.println(str);
       // System.out.println(str1+"   "+str2);
       // System.out.println(str1.equals(str3));
       // System.out.println(str1 == str3);
       // System.out.println(str1 == str2);
       // System.out.println(str.compareTo(str1));
       // System.out.println(str2.compareToIgnoreCase(str1));
       // System.out.println(str1 + str2);
      /* System.out.println(str.substring(6));
       System.out.println(str.substring(0, 6));
       System.out.println(str.toLowerCase());
       System.out.println(str.toUpperCase());
       System.out.println(str.trim());
       System.out.println(str.startsWith("Sal"));
       System.out.println(str.endsWith("kar "));
       System.out.println(str.charAt(15));
       System.out.println(str.length());
       int x = 100;
       String str5 = String.valueOf(x);
    
       System.out.println(str5);

       System.out.println(str.replace("Sachin", "Sourav Ganguly"));
       System.out.println(str.replace('S', 'K'));*/

       StringBuffer strBuff = new StringBuffer(); //16
      // System.out.println(strBuff.capacity());
       strBuff.append("Hello All");
      // System.out.println(strBuff.capacity());
       strBuff.ensureCapacity(40);
       strBuff.insert(5," Welcome");
      // System.out.println("length: "+strBuff.length());
      // System.out.println(strBuff.capacity());
       strBuff.replace(0, 5, "Hi");
       strBuff.delete(0, 3);
       strBuff.deleteCharAt(0);
       strBuff.reverse();
      // System.out.println("length: "+strBuff.length());
       //System.out.println(strBuff.capacity());
       strBuff.append("This is the July to August batch");
      // System.out.println("length: "+strBuff.length());
      // System.out.println(strBuff.capacity());
       strBuff.append("This is the July to August batch");
      // System.out.println("length: "+strBuff.length());
       //System.out.println(strBuff.capacity());
      
      
       StringBuffer strBuff1 = new StringBuffer("Welcome Team");
       StringBuffer strBuff2 =  new StringBuffer(32); //32
       //System.out.println(strBuff+"      "+strBuff1+"     "+strBuff2);

       StringsNewDemo strDemo = new StringsNewDemo();
       System.out.println(strDemo); // strDemo.toString()

        
    }

   
}
