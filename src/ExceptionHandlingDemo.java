public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        System.out.println("before exception");
        int a1[] = {1,2,3};
        String s = null;
        String k = "12";
        int i = Integer.parseInt(k);
        if(a == 5){
            ArithmeticException ae = new ArithmeticException("My value is 5");
            throw ae;
        }

        try{
            System.out.println(a/b);
            //System.exit(0);
            System.out.println(k.charAt(1));
            System.out.println(a1[2]);
            k = "abc";
            System.out.println(Integer.parseInt(k));
            
           // System.out.println("In try after exception");
        }catch(ArithmeticException ex){
            System.out.println("Handling exception here");
            ex.printStackTrace();
            b = 2;
            System.out.println(a/b);          
        }catch(StringIndexOutOfBoundsException ex){
            ex.printStackTrace();
            k = "1234";
            System.out.println(k.charAt(3));
            try {  //nested try - catch
                System.out.println(a1[4]);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(a1[2]);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("In finally block");
        }

        
        //if(s == null)
       /* try{
            System.out.println(k.charAt(2));
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("In string exception");
            ex.printStackTrace();
           System.out.println(ex.getMessage());
        }*/
        
       /* try {
            System.out.println(a1[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/
        
        System.out.println("after exception");
    }

}
