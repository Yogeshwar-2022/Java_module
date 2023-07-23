/*
Syntax : Exception class
class Exception extends Exception{
    || overridden methods
    || code
}

Syntax : Throw keyword
if(condition for Exception){
            try {
                throw new Exception();
            }catch (Exception e){
                || Exception methods
            }
*/

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+"This is toString method";
    }
    @Override
    public String getMessage() {
        return super.getMessage()+"This is toMessage method";
    }
}

public class Java_83_Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary value of a : ");
        int a = sc.nextInt();
        if(a<0|a>1){
            try {
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString()); // calls toMessage method then toString method (also prints class name)
                System.out.println(e); // calls toString method (also prints class name)
                e.printStackTrace();
            }
            System.out.println("The End");
        }
    }
}
