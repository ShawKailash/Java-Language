// use the date class in java to print time in the following format

import java.util.Date;

public class Java_2_Date_Format {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    }
}
