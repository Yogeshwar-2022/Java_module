interface FunctionalInterfaceAnonymousDemo {
    void methodZero();
}
interface InterfaceAnonymousDemo{
    void methodOne();
    void methodTwo();
}
public class Java_109_Anonymous_Classes_Lambda_Expressions {
    public static void main(String[] args) {
        //Lambda Expression
        FunctionalInterfaceAnonymousDemo Object2 = ()-> System.out.println("This is method zero");
        Object2.methodZero();

        //Anonymous class implementing an interface
        InterfaceAnonymousDemo Object1 = new InterfaceAnonymousDemo() {
            @Override
            public void methodOne() {
                System.out.println("This is method one");
            }
            @Override
            public void methodTwo() {
                System.out.println("This is method two");
            }
        };
        Object1.methodOne();
        Object1.methodTwo();
    }
}
