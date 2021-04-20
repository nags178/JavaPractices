import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueWords {
   public static void main(String[] args) {
      String str;
      int count = 0;
      Scanner sc = new Scanner(System.in);
      str = sc.nextLine();
      String[] strArray = str.split("\\s+");
      Map<String, String> hMap = new LinkedHashMap<String, String>();
      for(int i = 0; i < strArray.length ; i++ ) {
         if(!hMap.containsKey(strArray[i])){
            count++;
         }
      }
      System.out.println(count);
   }
}