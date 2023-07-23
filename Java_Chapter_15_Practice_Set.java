import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Java_Chapter_15_Practice_Set {
    public static void main(String[] args) {
        ArrayList<String> Student_List = new ArrayList<>(10);
        Student_List.add("AB");
        Student_List.add("BC");
        Student_List.add("CD");
        Student_List.add("DE");
        Student_List.add("EF");
        Student_List.add("FG");
        Student_List.add("GH");
        Student_List.add("HI");
        Student_List.add("IJ");
        Student_List.add("JK");
        for (String s:Student_List) {
            System.out.println(s);
        }

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String D = dt.format(df);
        System.out.println(D);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);
        //Only one instance is stored in hash set
    }
}
