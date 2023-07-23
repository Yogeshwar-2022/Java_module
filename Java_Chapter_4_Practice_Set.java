import java.util.Scanner;

public class Java_Chapter_4_Practice_Set {
    public static void main(String[] args) {

        // What will be the output of this program:
        int a = 10;
        if (a==11){
            System.out.println("I am 11");}
        else{
            System.out.println("I am not 11");}

        // Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percent For Sub 1 : ");
        int Per1 = sc.nextInt();
        System.out.print("Enter Percent For Sub 2 : ");
        int Per2 = sc.nextInt();
        System.out.print("Enter Percent For Sub 3 : ");
        int Per3 = sc.nextInt();

        if (Per1 > 33 && Per2 > 33 && Per3 > 33 && (Per1 + Per2 + Per3) > 40 ){
            System.out.println("You Have Passed");
        }else{
            System.out.println("You Have Failed");
        }

        // Calculate income tax paid by an employee to the government as per the slabs mentioned below
        // Note that there is no tax below 2.5L. Take the input amount as input from the user.
        System.out.print("Enter Your Salary : ");
        double Salary = sc.nextInt();

        if (Salary > 250000 && Salary <= 500000) {
            System.out.print("Tax On Your Income is ");
            System.out.println(((Salary*5)/100));
        }
        else if (Salary > 500000 && Salary <= 1000000){
            System.out.print("Tax On Your Income is ");
            System.out.println(((Salary*20)/100));
        }
        else if (Salary > 1000000 ){
            System.out.print("Tax On Your Income is ");
            System.out.println(((Salary*30)/100));
        }
        else {
            System.out.println("No Tax For You");
        }

        // Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        System.out.print("Enter the number from 0 to 6 : ");
        byte num = sc.nextByte();
        switch (num){
            case (1):{System.out.println("monday");break;}
            case (2):{System.out.println("tuesday");break;}
            case (3):{System.out.println("wednesday");break;}
            case (4):{System.out.println("thursday");break;}
            case (5):{System.out.println("friday");break;}
            case (6):{System.out.println("saturday");break;}
            case (0):{System.out.println("sunday");break;}
        }

        // Write a Java program to find whether a year entered by the user is a leap year or not.
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year%4 == 0){
            System.out.println("Ït is a leap year");
        }else {
            System.out.println("not a leap year");
        }

        // Write a program to find out the type of website from the URL:
        String website = new String(sc.next());
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }else if(website.endsWith(".com")){
            System.out.println("This a commercial website");
        }else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }

    }
}
