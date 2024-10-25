import java.util.Date;

public class Java_97_Date_Class {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.getClass());
    }
}
