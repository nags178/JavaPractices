public class SwitchPrac{
    public static void main(String[] args) {
        /*int number = 50; // number to check
        switch (number) {
            case 10:
                System.out.println("10");
                
            case 20:
                System.out.println("20");
                
            default:
                System.out.println("no matches");
                
        }
        // Basic for loop
        for(int i = 1; i <= 10; i = i + 1){
            System.out.println("i value is "+i);
        }

        // Nested For loop
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        aa:
        for(int i = 5; i>=1; i--){
            //inner loop
            bb:
            for(int j = 1; j<=i; j++){
                System.out.print("1 ");
                continue bb;
            }
            System.out.println();
           
        }

        System.out.println("Out of for");*/
        
        int i = 1;
        while(i<=10){
            
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        int j = 11;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);


       
        
    }
}