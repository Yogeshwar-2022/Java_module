import java.util.Scanner;

class ExceededTrials extends Exception{
    @Override
    public String toString() {
        return "Number Of Trials Exceeded!";
    }
    @Override
    public String getMessage() {
        return "Number Of Trials Exceeded!";
    }
}
public class Java_Chapter_14_Practice_Set {
    public static void printArray(int [] arr) throws ExceededTrials {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < arr.length) {
            try {
                System.out.print("Enter value of a : ");
                int a = sc.nextInt();
                System.out.println(arr[a]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i == arr.length) {
            throw new ExceededTrials();
        }
    }
    public static double divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        // int a = 1 --> Syntax Error
        // System.out.println("Adding 2 and 3 we get "+(2-3)); --> Logical Error
        // System.out.println("Dividing 1 by 0 we get "+(1/0)); --> Runtime Error

        try {
            double c = divide(1,2);
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Haha");
        }catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }catch (Exception e){
            System.out.println("Exception");
        }

        /*
        int [] arr = {12,13,14,15,16};
        if (i==5){
            System.out.println("Error");
        }
        */

        int [] arr = {12,23,34,45,56,67};
        try {
            printArray(arr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
