import java.util.Locale;
import java.util.Scanner;

public class Java_Chapter_3_Practice_Set {
    public static void main(String[] args) {

        // Write a Java program to convert a string to lowercase.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String a = new String(sc.next());
        String a_lower = a.toLowerCase(Locale.ROOT);
        System.out.println(a_lower);

        // Write a Java program to replace - with underscores.
        System.out.print("Enter Your String : ");
        String b = new String(sc.next());
        String b_rep = b.replace('-','_');
        System.out.println(b_rep);

        // Write a Java program to fill in a letter template which looks like below
        // letter = “Dear <|name|>, Thanks a lot”
        System.out.print("Enter Name : ");
        String name = sc.next();
        String letter = new String("Dear <|name|>, Thanks a lot");
        String letter_rep = letter.replace("<|name|>",name);
        System.out.println(letter_rep);

        // Write a Java program to detect double and triple spaces in a string
        String c = "This string contains double and  triple spaces";
        System.out.println(c.indexOf("  "));
        System.out.println(c.indexOf("   "));

        // Write a program to format the following letter using escape sequence characters.
        // Letter = “Dear Harry, This Java Course is nice. Thanks”
        String d = new String("Dear Harry, This Java Course is nice. Thanks");
        String d_F = new String("Dear Harry,\nThis Java Course is nice.\nThanks");
        System.out.println(d_F);
    }
}
