public class JavaConversions {
    public static void main(String[] args) {
        
        String str = "123.1";

        float f = Float.parseFloat(str);

       // int i = Integer.parseInt(str);
       //int i = Integer.valueOf(str);
        int i = 10;
        System.out.println(f);

        String s = String.format("%s",i);//String.valueOf(i);//Integer.toString(i);

        System.out.println(s+10);
    }
}
