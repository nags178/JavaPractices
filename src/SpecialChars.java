import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class SpecialChars {
 
   public static void main(String[] args) {
 
      String str ;
      Scanner sc=new Scanner(System.in);
        
      str=sc.nextLine();
      Pattern p = Pattern.compile("['@,'#,'!','*']", Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(str);
 
      System.out.println(str);
      int count = 0;
      while (m.find()) {
         count = count+1;
         
      }
      System.out.println(count);
   }
}
 