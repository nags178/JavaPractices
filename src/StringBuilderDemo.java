public class StringBuilderDemo extends Student1 {

   
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello All. Welcome to the team");
        System.out.println(str.capacity());

        StringBuilder str1 = new StringBuilder("Hello Team");
        System.out.println(str1.capacity());

        StringBuilder str2 = new StringBuilder(50);
        str2.append("hi Team      hello all     welcome to java       session started                  ");
        System.out.println(str2.capacity());
        StringBuilderDemo strObj = new StringBuilderDemo();
        System.out.println(strObj.toString());
        
        int i = 100;

        String s = String.valueOf(i);

        




        

    }
}
