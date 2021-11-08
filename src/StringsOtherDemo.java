public class StringsOtherDemo {
    public static void main(String[] args) {
        int i = 100;
        String s = "   Hello" + " Hell";
        String s2 = "Hello All";
        String s1 = new String("Hello All");
        String s3 =  new String("Hello All");
       // s = s + ". Welcome";
        s = s.concat(". Welcome");
      /*  System.out.println(s.length());

        System.out.println(s.substring(5));
        System.out.println(s.substring(0, 7));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith(" "));
        System.out.println(s.endsWith("me"));
        System.out.println(s.charAt(20));
        System.err.println(String.valueOf(i));
       // s = s.replace("Hell", "Hi");
        //s = s.replaceAll("Hell", "Hi");
        s = s.replaceFirst("Hell", "Hi");
       // System.out.println();
        
        System.out.println(s.trim());
        // System.out.println(s.compareToIgnoreCase(s2));*/

        byte[] b = s2.getBytes();

        char ch[]=new char[10];
        s2.getChars(0, 5, ch, 5);
        for(int j=0;j<ch.length;j++)
            System.out.println(ch[j]);


        
    }
}
