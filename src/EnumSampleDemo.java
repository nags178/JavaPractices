 enum Season implements MyInterface{ // extends Enum
     WINTER(10) {
        @Override
        void hello() {
            // TODO Auto-generated method stub
            
        }
    } , SPRING {
        @Override
        void hello() {
            // TODO Auto-generated method stub
            
        }
    }, SUMMER {
        @Override
        void hello() {
            // TODO Auto-generated method stub
            
        }
    }, FALL {
        @Override
        void hello() {
            System.out.println("In FALL hello");
            // TODO Auto-generated method stub
            
        }
    }  // public static final 
; // by default appended by compiler

    static final int i = 10;
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("In enum display");
        
    }

    abstract void hello();

    public void myDisplay(String s){
        System.out.println("In my display "+s);
    }

    @Override
    public void showMsg() {
        // TODO Auto-generated method stub
        System.out.println("In enum show msg");
        
    }

    int myValue = 0;

    Season(){  // private by compiler
        System.out.println("In enum constructor");
    }

    Season(int i){
        System.out.println("In Param constructor "+i);
        myValue = i;
    }

    public static void main(String[] args) {
        System.out.println("In main method of enum "+WINTER.myValue);
        FALL.myDisplay("FALL");
        WINTER.myDisplay("WINTER");
    }
}  

public class EnumSampleDemo {
    enum Fruits {
       
    }

    enum Day{ 
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        int i;
    } 
    public static void main(String[] args) {


        Season s[] = Season.values();
        s[0].display();
        
        for(Season s1 : s){
            System.out.println(s1.ordinal());
        }

        for(Fruits f : Fruits.values()){
            System.out.println(f);
        }

        Day myDay = Day.SUNDAY;

        switch(myDay){
            case MONDAY:
                System.out.println("Yes its monday");
                break;
            case TUESDAY:
                System.out.println("Yes its Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Yes its Wednesday");
                break;
            default:
                System.out.println("No fine day");
                break;

        }

        System.out.println("My value is "+Season.valueOf("WINTER"));
        System.out.println("My value of "+ Season.FALL);
        Season.FALL.hello();
    }
}
