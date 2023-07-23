public class Java_Chapter_7_Practice_Set {

    static void table(int n){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }

    static void pattern(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    static int rec_Sum(int n){
        if(n==1){
            return 1;
        }
        return n + rec_Sum(n - 1 );
    }

    static void pattern_Rev(int n){
        for (int i = n ; i > 0 ; i--){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    static int fibonacci(int n){
        if(n == 1 || n == 2){
            return n - 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    static int avg(int... arr){
        int sum = 0;
        for (int ele:arr) {
            sum += ele;
        }
        return sum/ arr.length;
    }

    static void pattern_Rev_Rec(int n) {
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern_Rev_Rec(n-1);
        }
    }

    static void pattern_Rec(int n) {
        if (n > 0) {
            pattern_Rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double C_to_F(double C){
        double F = ((C*1.8)+32);
        return F;
    }

    static int sum(int n){
        int sum = 0;
        for (int i = 0 ; i <= n ; i++ ){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        table(11);
        pattern(3);
        System.out.println(rec_Sum(4));
        pattern_Rev(3);
        System.out.println(fibonacci(4));
        System.out.println(avg(1,2,3,4,5));
        pattern_Rev_Rec(3);
        pattern_Rec(3);
        System.out.println(C_to_F(100d));
        System.out.println(sum(4));
    }
}
