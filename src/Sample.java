 class Sample {
    int id;
    String name;
    int rollNo;
    private Sample(int i,String n){
        //creating a parameterized constructor
       id = i;
       name = n;
       System.out.println("id="+ id +"  Name="+name);
}
 Sample(int i,String n,int roll){
    //creating a parameterized constructor
   id = i;
   name = n;
   rollNo = roll;
   System.out.println("id="+ id +"  Name="+name+" RollNo="+rollNo);
}
    
 Sample(){
    System.out.println("In default constructor");
}

    
}
