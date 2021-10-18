public class MethodsDemoNew {
    int k;
    String name;
    public static void main(String[] args) {
        System.out.println("In main method");
        MethodsDemoNew methodObj = new MethodsDemoNew();
        int a = 5;
        int b = 4;
        methodObj.display(methodObj.name, a, b, methodObj.k, 7, true);

       int c =  displayMyMessage();
        System.out.println(c);

        methodObj.displayMyMessage();



    }

    // accesmodifier returntype methodname (parameterlist = 0 to any){

    //}

         static int displayMyMessage(){
            int i = 6;
            System.out.println("In my method");
            return i;
        }

        void display(String name,int i, int y, int z, float r, boolean b){
            displayMyMessage();
            System.out.println(name+"  "+b);
        }

        void display(String name,int i, int y, int z, boolean b, float r){

        }

        void display(String name){
            
        }

       // abstract void abstractMethod();  

}
