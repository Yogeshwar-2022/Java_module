/*
Syntax : Upcasting
BaseClass obj = new DerivedClass();
*/

class One {
    void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My class name is One");
    }
}
class Two extends One {
    public void welcome(){
        System.out.println("WELCOME");
    }
    public void name(){
        System.out.println("My class name is Two");
    }
}

public class Java_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        One obj = new One();
        Two obj1 = new Two();
        // Dynamic method dispatch
        One obj2 = new Two(); // Upcasting
        // Two Obj = new One(); --> not valid
        obj2.greet();
        // obj2.welcome(); --> not valid
        obj2.name(); // method which overrides the method is called
    }
}
