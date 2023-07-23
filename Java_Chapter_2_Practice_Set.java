import java.util.Scanner;

public class Java_Chapter_2_Practice_Set {
    public static void main(String[] args) {
        // What will be the result of the following expression
        float num = 7/4 * 9/2;
        // 7/4 * 9/2 --> 1.75 * 9/2 --> 15.75/2 --> 7.875
        System.out.println(num);

        // Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        char crypt_grade = (char)(grade + 8); // typecasting
        char decrpt_grade = (char)(crypt_grade - 8);
        System.out.println(decrpt_grade);

        // Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double user_num = sc.nextInt();
        if (user_num > 100){
            System.out.println("given number is greater than 100");
        }else {
            System.out.println("given number is less than 100");
        }

        // Write the following expression in a java program - (v^2-u^2)/2as
        double v = 4;
        double u = 3;
        double w = 2;
        double x = 1;

        double L = ( v*v - u*u )/(2*w*x) ;
        System.out.println(L);

        // Find the value of 'a' in expression given below
        int a = 7*49/7 + 35/7;
        System.out.println(a);
    }
}
