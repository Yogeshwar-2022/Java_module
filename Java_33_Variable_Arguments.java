/*
public static void foo(int... arr){
    // arr is available here as int[] arr
}
*/

class calculate {

    // Parameters of this function are array of given arguments
    static int add(int... arr) {
        int result = 0;
        for (int ele : arr) {
            result = result + ele;
        }
        return result;
    }

    // This function takes at least one argument
    static int add_at_least_1_arg(int a, int... arr) {
        int result = 0;
        for (int ele : arr) {
            result = result + ele;
        }
        return result;
    }
}

public class Java_33_Variable_Arguments {
    public static void main(String[] args) {
        System.out.println(calculate.add(1, 2));
        System.out.println(calculate.add(2, 3, 4));
        System.out.println(calculate.add_at_least_1_arg(4, 5, 6));
    }
}

