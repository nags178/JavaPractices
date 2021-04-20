public class IfElseSample {
    public static void main(String[] args) {
        /*The below code is to check condititional statements
        }*/

        int age = 19;
        int weight = 60;
        String gender = "male";
        /**
         Below is to check the age for eligilibility
         */

         int a = 10, b = 5;
         a = a + b; // 15
         b = a - b; // 10
         a = a - b; // 5

        if(age > 20)
            System.out.println("Eligible");
        else
            System.out.println("Not eligible");

        for(int i = 1; i<=5; i++)
            System.out.println(i);
            
            System.out.println("After for");
        
       // System.out.println("Good to donate");

        

       /* if(age > 18){
            if(gender == "female"){
                if(weight > 50){
                    System.out.println("female eligible");
                }
                else{
                    System.out.println("female not eligible");
                }
            }
            else{
                if(weight > 40){
                    System.out.println("male eligible");
                }
                else{
                    System.out.println("male not eligible");
                }
            }
            
        }else{
            System.out.println("not eligible as age factor");
        }*/
    }
}

