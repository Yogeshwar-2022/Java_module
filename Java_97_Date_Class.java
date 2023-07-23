import java.util.Date;

public class Java_97_Date_Class {
    public static void main(String[] args) {
        System.out.println("The maximum value of long is, " + Long.MAX_VALUE);
        System.out.println("The value of current time in ms, " + System.currentTimeMillis()+" ms");

        Date d = new Date(); //Constructor
        System.out.println(d);

        System.out.println(d.getTime()); //Returns the number of milliseconds since January 1, 1970
        System.out.println(d.getDate());
        System.out.println(d.getMonth()); //Returns value from 0 to 11
        System.out.println(d.getYear()); //Returns the number of years passed since 1900
    }
}
