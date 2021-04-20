import java.util.Scanner;

public class ReplaceEvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
    
        String finalStr="";
        String string_number = Integer.toString(num);
        for (int i = 0; i < string_number.length(); i++) {
            int n = Character.getNumericValue(string_number.charAt(i));
            if(n % 2 == 0){
                n= n + 1;
                finalStr = finalStr + n;
            }
            else{
                n = n - 1;
                finalStr = finalStr + n;
            }
                
        }
        System.out.println(Integer.parseInt(finalStr));
        
    }
}
