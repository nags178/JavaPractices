import java.util.Scanner;

public class Count {
    
	
	public static void main(String[] args) {
		int Number, digit, Count=0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
        digit = sc.nextInt();
        String str = String.valueOf(Number);
        str = str.replace(String.valueOf(digit), "");
        Number = Integer.parseInt(str);
        System.out.println(Number);
		while(Number > 0) {
            
                Number = Number / 10;
			    Count = Count + 1;
            }
            System.out.println(Count);
             
		}
		
	}

