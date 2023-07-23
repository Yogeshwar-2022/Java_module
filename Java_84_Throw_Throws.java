/*
Syntax : Throws
public <return_type> <function_name> (<parameters>) throws <exception_name> {
    || code
}
*/

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Cannot Be Negative!" ;
    }
    @Override
    public String getMessage() {
        return "Radius Cannot Be Negative!";
    }
}

public class Java_84_Throw_Throws {
    public static double area(double r) throws NegativeRadiusException {
        if(r<0) {
            throw new NegativeRadiusException();
        }return Math.PI*r*r;
    }
    public static void divide(int a, int b) throws ArithmeticException {
        System.out.println("Division : " + a/b);
    }
    public static void main(String[] args) {
        double r = -1;
        try {
            System.out.println(area(r));
        }catch (Exception e){
            System.out.println("Exception "+e);
        }
        int a = 1;
        int b = 0;
        divide(a,b);
    }
}
