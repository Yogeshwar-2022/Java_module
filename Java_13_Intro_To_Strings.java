import java.util.Scanner;

public class Java_13_Intro_To_Strings {
    public static void main(String[] args) {

        //String name = new String("Arya");
        String name = "Arya";
        System.out.print("The name is : ");
        System.out.println(name);

        int a = 6;
        float b = 5.6554f;
        //System.out.printf("The value of a is %d and value of b is %f", a, b);
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.println(" ");
        //Here 8.2 means 8 spaces (including the number and excluding the decimal point) and 2 numbers after decimal point

        Scanner sc = new Scanner(System.in);
        //String st = sc.next();
        //String st = sc.nextLine();
        //System.out.println(st);

        //Creating strings using literal
        String str1 = "CodeWithHarry";
        String str2 = "CodeWithHarry";
        System.out.println(str1 == str2);

        //Creating strings using new keyword
        String Str1 = new String("Keep coding");
        String Str2 = new String("Keep coding");
        System.out.println(Str1 == Str2);
    }
}
