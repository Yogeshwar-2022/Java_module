/*
Syntax : Try-Catch block
try {
    || Code
    }catch (Exception_1 e){
        || Code if Exception_1 e occurs

    }.
     .
     .
    }catch (Exception_n e){
        || Code if Exception_n e occurs
    }catch (Exception e){ // for all remaining exceptions (optional)
        || Code if Exception e occurs
    }
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_81_Handling_Specific_Exceptions {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter value of b : ");
            int b = sc.nextInt();
            System.out.println("a divided by b equals to "+a/b);

        }catch (ArithmeticException e) { // deals with arithmetic exception
            System.out.println("You cannot divide by 0 "+e);
        }catch (InputMismatchException e) { // deals with input mismatch errors
            System.out.println("Please enter only integer values from -2,147,483,647 to 2,147,483,647" + e);
        }catch (Exception e){ // deals with all other exceptions
            System.out.println("Unknown error : "+e);
        }
    }
}
