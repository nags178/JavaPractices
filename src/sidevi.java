class sridevi{
    int i;
 String name;
 int a;
 sridevi(){
    System.out.println("In constructor");
    i=1;
    name="Sridevi";
 }
 sridevi(int rank,String n){
    i= rank;
    name = n;
 }
 sridevi(int rank,int age,String n){
    i= rank;
    name = n;
    a=age;
 }
}