import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_101_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy   E    H:m a");
        String mydate = dt.format(df);
        System.out.println(mydate);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate1 = dt.format(df2);
        System.out.println(mydate1);
    }
}
