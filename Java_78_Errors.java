import java.util.Scanner;

public class Java_78_Errors {
    public static void main(String[] args) {
        // Syntax error -->
        /*
        int a = 3
        b = 4;
        System.out.println("sum of a and b is "+a+b);
         */

        // logical error
        int a = 3;
        int b = 4;
        System.out.println("sum of a and b is "+a*b);

        // Run-time error
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for K : ");
        int K = sc.nextInt();
        // If you put K = 0 you will experience run time error
        System.out.println("Dividing 1 by K we get "+1/K);

    }
}
