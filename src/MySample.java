 class MySample implements MyInterface3{

    interface innerInterface1{
        void innerMethod();
    }

    public static void main(String[] args) {
        MySample myObj = new MySample();
        myObj.defaultMethod();
        myObj.myDisplay();
        MyInterface3.InnerClassInterface innerObj = new MyInterface3.InnerClassInterface();
        innerObj.innerMethod();
    }

    public void defaultMethod(){ // public 
        System.out.println("In default method of 2");
    }

    public void myDisplay(){

        //local inner class
        // inside local one interface

        // local interface 

        //accessing the stuff

    }
    
    public void myMethod3() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void newDisplay() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void helloAll() {
        // TODO Auto-generated method stub
        
    }

    
}

class Sample1 extends MySample{
    public void myMethod3(){
        
    }
}

 
