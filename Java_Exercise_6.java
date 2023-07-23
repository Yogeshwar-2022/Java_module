class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalid Input!";
    }@Override
    public String getMessage() {
        return "Invalid Input!";
    }
}
class CannotDivideBy0Exception extends Exception{
    @Override
    public String toString() {
        return "Cannot Divide By 0!";
    }@Override
    public String getMessage() {
        return "Cannot Divide By 0!";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input Exceedes 100000";
    }@Override
    public String getMessage() {
        return "Input Exceedes 100000";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Multiplication Input Exceedes 7000";
    }@Override
    public String getMessage() {
        return "Multiplication Input Exceedes 7000";
    }
}
class calculator{
    static double add(double a,double b)throws InvalidInputException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a+b;
    }
    static double subtract(double a,double b)throws InvalidInputException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a-b;
    }
    static double multiply(double a,double b)throws InvalidInputException,MaxMultiplierException{
        if(a>7000 || b>7000){
            throw new MaxMultiplierException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a*b;
    }
    static double divide(double a,double b)throws InvalidInputException,MaxInputException,CannotDivideBy0Exception{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        if(a==0 || b==0){
            throw new CannotDivideBy0Exception();
        }
        return a/b;
    }
}
public class Java_Exercise_6 {
    public static void main(String[] args) {
        try {
            System.out.println(calculator.add(10,10));
        } catch (Exception e) {
            e.printStackTrace();
        }try {
            System.out.println(calculator.divide(10,0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
