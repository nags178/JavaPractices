

 class IfElseSample {
    public static void main(String[] args) {
        /*The below code is to check condititional statements
        }*/

        int age = 19;
        int weight = 50;
        String gender = "male";
        /**
         Below is to check the age for eligilibility
         */

         int a = 10, b = 5;
         a = a + b; // 15
         b = a - b; // 10
         a = a - b; // 5

        if(age >= 18){
            if(weight >= 60){
                if(true){

                }
             System.out.println("Eligible");
            }else{
                
                System.out.println("Not eligible as per weight category");
            }
            System.out.println("Inside if block");
        }
        else {
            System.out.println("Not eligible as per age criteria");
            //System.out.println("After if block");
        }
        /*int year = 2020;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Its an leap year");
        }
        else
            System.out.println("Not an leap year"); */
      /*
            int marks = 65;
            if(marks<40){
                System.out.println("Failed");
            }
            else if(marks>=40 && marks<50){
                System.out.println("D grade");
            }
            else if(marks>=50 && marks<60){
                System.out.println("C grade");
            }
            else if(marks>=60 && marks<70){
                System.out.println("B grade");
            }
            else if(marks>=70)
            {
                System.out.println("A grade");
            }
            else{
                System.err.println("Invalid value");
            }
        
       // System.out.println("Good to donate");

        

        if(age > 18){
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

