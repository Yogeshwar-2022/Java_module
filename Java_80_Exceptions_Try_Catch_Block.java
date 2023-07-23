/*
Syntax : Try-Catch block
try {
    || Code
    }catch (Exception e){
        || Code if Exception e occurs
    }
*/

import java.util.Scanner;

public class Java_80_Exceptions_Try_Catch_Block {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter value of b : ");
            int b = sc.nextInt();
            System.out.println("a divided by b equals to "+a/b);
        }catch (Exception e){
            System.out.println("Exception : "+e);// prints Exception e
        }
    }
}
