/*
Syntax : Try-Catch block
try {
    || Code
    try {
        || Code
    }catch (Exception e){
        || Code if Exception e occurs
    }
    }catch (Exception e){
        || Code if Exception e occurs
    }
*/

import java.util.Scanner;

public class Java_82_Nested_Try_Catch_Block {
    public static void main(String[] args) {
        // outer (main) try block
        try {
            //inner try block 1
            try {
                // inner try block 2
                try {
                    int arr[] = {1, 2, 3, 4};
                    //printing the array element out of its bounds
                    System.out.println(arr[10]);
                }
                // to handles ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }
            // to handle ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }
        // to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("Array Out Of Bound");
            System.out.println(" outer (main) try block");
        }
    }
}
