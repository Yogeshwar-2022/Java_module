import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_101_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd | MM | yy | E \nH | m | a");

        String Date = dt.format(df);
        System.out.println(Date);

        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String Date1 = dt.format(df1);
        System.out.println(Date1);
    }
}
