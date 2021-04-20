import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        String s;
        char ch;
        int i=0;
        int count =0;
        Scanner sc=new Scanner(System.in);
        
        s=sc.nextLine();	
        
        s = s.toLowerCase();
        for(int j=0;j<s.length();j++)
        {
        ch=s.charAt(j);	
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            if(j<s.length()-1){
                char k = s.charAt(j+1);
                if((k >= 'a'&& k <= 'z') ){
                    count  = count + 1;
                }
            }
        }
        }
        System.out.println(count); 
    }
}
