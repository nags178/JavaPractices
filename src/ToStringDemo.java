public class ToStringDemo {
    int rollNo;
    String name;
    String city;

    ToStringDemo(int no, String sname, String scity){
        rollNo = no;
        name = sname;
        city = scity;
    }

    public String toString(){
        return name+" "+rollNo+" "+city;
    }


    public static void main(String[] args) {
        ToStringDemo toStringObj1 = new ToStringDemo(5, "Nag", "Hyd");
        ToStringDemo toStringObj2 = new ToStringDemo(10, "Techie", "Hyd");
        System.out.println(toStringObj1);
        System.out.println(toStringObj2);
        System.out.println(toStringObj1);
        System.out.println(toStringObj1);
        System.out.println(toStringObj1);
    }
}
