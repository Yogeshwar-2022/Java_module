// Write a program to sum three numbers in Java.
// Write a program to calculate CGPA using marks of three subjects (out of 100)
// Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
// Write a Java program to convert Kilometers to miles.
// Write a Java program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class Java_Chapter_1_Practice_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Num 3 : ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.print("The sum of following num is : ");
        System.out.println(sum);

        System.out.print("Enter mark 1 : ");
        double mark1 = sc.nextInt();
        System.out.print("Enter mark 2 : ");
        double mark2 = sc.nextInt();
        System.out.print("Enter mark 3 : ");
        double mark3 = sc.nextInt();
        double CGPA = (((mark1 + mark2 + mark3)/3)/10);
        System.out.print("CGPA : ");
        System.out.println(CGPA);

        System.out.print("What is your name : ");
        String name = sc.next();
        System.out.print("Good morning ");
        System.out.println(name);

        System.out.print("Enter distance in kilometers : ");
        double Km = sc.nextDouble();
        double m = Km * 0.621371192;
        System.out.print("Distance in miles is : ");
        System.out.println(m);

        System.out.print("Enter int : ");
        boolean b = sc.hasNextInt();
        if (b == false) {
            System.out.println("Not an integer");
        }else {
            System.out.println("Following number is an integer");
        }

    }
}
