class test {
    private int i;
    String name;
     test(){
        System.out.println("In Test");
    }
    private void getMethod(){
        System.out.println("In method");
    }

    String add(int a, int b, String s){
        int c = a + b;
        return s+c;
    }

    

    static void display(){
        System.out.println("hello All");
    }

    public static void main(String[] args) {
        test testObj = new test();
       // MyPackTest myTest = new MyP
        //testObj.get
    }
}