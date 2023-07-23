/*
Method Syntax :
returnType nameOfMethod(){
//Method body
}
*/

public class Java_31_Methods {

    // Defining a method
    static int add(int a , int b){
        return a + b;
    }

    // Void return type has no return value
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    // Using integer as parameter and trying to modify it
    static void change1(int a){
        a = 98;
    }

    // Using array as parameter and modifying it
    static void change2(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        int x = 1 ; int y = 3;
        System.out.println(add(x,y));

        // Calling function by creating a class object (For non-static functions)
        Java_31_Methods obj = new Java_31_Methods();
        int c = obj.add(x,y);
        System.out.println(c);

        // Calling a void function
        tellJoke();

        // Case 1: Changing the Integer
        int a = 45;
        change1(a);
        System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array (Same for objects as parameters)
        int [] marks = {52, 73, 77, 89, 98, 94};
        change2(marks);
        System.out.println("The value of x after running change is: " + marks[0]);
    }
}

