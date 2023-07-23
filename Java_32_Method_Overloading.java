// method overloading by changing return type

class calculate1 {
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
}

// method overloading by changing number of arguments

class calculate2 {
    int multiply(int c, int d) {
        return c * d;
    }
    int multiply(int c, int d, int e) {
        return c * d * e;
    }
}

public class Java_32_Method_Overloading {
    public static void main(String[] args) {

        calculate1 obj1 = new calculate1();
        int x = obj1.multiply(5,4);
        double y = obj1.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + x);
        System.out.println("Mutiply method : returns double  : " + y);

        calculate2 obj2 = new calculate2();
        int p = obj2.multiply(5,4);
        int q = obj2.multiply(5,4,3);
        System.out.println(p);
        System.out.println(q);
    }
}
