import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date(900000000000l);
        Date d = new Date();

        

        System.out.println(d+"   "+d1);

        int c = d1.compareTo(d1);

        System.out.println(c);

        System.out.println(d1.before(d));

        Date d2 = new Date(90000000000l);

        Date d3 = new Date();

        System.out.println(d.getTime()+"   "+d3.getTime());

        System.out.println(d.equals(d3));
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy 'in' HH:mm:ss zzz E ");
        System.out.println(s.format(d));

        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("E dd/MM/yy hh:mm:ss");

        System.out.println(ldt.format(df));
      /*  
        //
        

        LocalDate ld = LocalDate.now();

        

        LocalTime lt = LocalTime.now();

        System.out.println(ldt);*/
    }
}
