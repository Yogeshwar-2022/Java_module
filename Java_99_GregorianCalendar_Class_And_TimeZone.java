import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Java_99_GregorianCalendar_Class_And_TimeZone {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.get(Calendar.DATE)+" / "+(g.get(Calendar.MONTH)+1) +" / "+g.get(Calendar.YEAR));
        System.out.println(g.get(Calendar.HOUR)+" : "+g.get(Calendar.MINUTE));

        System.out.println("Time zone, "+g.getTimeZone().getID());
        System.out.println("Leap Year, "+g.isLeapYear(g.get(Calendar.YEAR)));

        /*
        for (String s:TimeZone.getAvailableIDs()) {
            System.out.println(s);
        }
         */
        System.out.println("Default Time zone, "+TimeZone.getDefault().getID());
    }
}
