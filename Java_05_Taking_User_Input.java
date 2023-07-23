import java.util.Scanner;

public class Java_05_Taking_User_Input {
    public static void main(String[] args) {

        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of these numbers is : ");
        System.out.println(sum);

//        // hasNext function
//        System.out.print("Taking input from user : ");
//        boolean b1 = sc.hasNextInt();
//        System.out.print(b1);
//
//        // String input
//        System.out.print(".next str input : ");
//        String str = sc.next(); // terminates input string at first space
//        System.out.println(str);
//        System.out.print(".nextLine str input : ");
//        String Str = sc.nextLine(); // takes entire string as input
//        System.out.println(Str);
    }
}

// In order to read data from keyboard java has scanner class
