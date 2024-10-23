// use the api class in java to print time in the following format

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_4_API {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
