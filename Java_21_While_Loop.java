/*
Syntax :
while (Boolean condition)
{
            // Statements    -> This keeps executing as long as the condition is true.
}
*/

public class Java_21_While_Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            System.out.println(i++);
        }
        /*
        while (true){
            System.out.println("This is an infinite loop");
        }
        */
    }
}
