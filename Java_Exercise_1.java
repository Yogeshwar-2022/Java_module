// Write a program to calculate the percentage of a given student in the CBSE board exam.
// His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)\

import java.util.Scanner;

public class Java_Exercise_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mark1 : ");
        byte mark1 = sc.nextByte();
        System.out.print("Mark2 : ");
        byte mark2 = sc.nextByte();
        System.out.print("Mark3 : ");
        byte mark3 = sc.nextByte();
        System.out.print("Mark4 : ");
        byte mark4 = sc.nextByte();
        System.out.print("Mark5 : ");
        byte mark5 = sc.nextByte();
        int percent = (((mark1 + mark2 + mark3 + mark4 + mark5)/500))*100;
        System.out.print("Percentage : ");
        System.out.println(percent);
    }
}
