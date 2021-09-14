public class SwitchDemo {
    static int l = 1;

    static void display(){
        System.out.println("In method");
    }
    public static void main(String[] args) {
        byte i = 10;
        int j = 1;
        String k = "2";
        char ch = 'B'; // Acsii code of B - 66
        boolean b = true;

        switch(i){
            case 'A', 10:
                System.out.println("In case 1");
                display();
                if(true){
                    System.out.println("In if");
                }
                break;
            case 'B':
                System.out.println("In case 2");
                break;
           
            case 20:
                System.out.println("In case 20");
                System.out.println("Insdie case 20 block");
                break;
            case 68:
                System.out.println("In case 66");
                break;
            default:
                System.out.println("In default");
        }

        System.out.println("In main");
    }
}
