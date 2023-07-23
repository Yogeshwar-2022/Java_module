/**
 * This is a demo class for understanding java docs
 * <p>Here we are learning about javadocs tags for methods</p>
 * @author Arya
 * @version Alpha
 * @since 2022
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Java Docs</a>
 */
public class Java_107_JavaDocs_Method_Tags {
    /**
     * This is method for division
     * @param a Dividend
     * @param b Divisor
     * @return integer quotient for a divided b
     * @throws ArithmeticException divisor is 0
     */
    static int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}
