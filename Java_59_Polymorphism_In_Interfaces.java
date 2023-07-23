interface NewMyInterface1{
    // Static method
    static void meth0(){
        System.out.println("this is static meth0 from NewMyInterface1");
    }
    // Private method
    private void meth1(){
        System.out.println("this is private meth1 from NewMyInterface1");
    }
    // Default method
    default void meth2(){
        meth1();
        System.out.println("this is default meth2 from NewMyInterface1");
    }
    // abstract method
    void meth3();
}

interface NewMyInterface2{
    void meth4();
}

class NewMyBase1 {
    public void meth5(){
        System.out.println("this is meth5 from class NewMyBase1");
    }
}
class NewMyDerived1 extends NewMyBase1 implements NewMyInterface1,NewMyInterface2{

    // Calls static method from MyInterface1
    public void staticImplementation(){
        NewMyInterface1.meth0();
    }
    // Defining meth3
    @Override
    public void meth3() {
        System.out.println("this is meth3 from NewMyInterface1 implemented in NewMyImplements");
    }

    // Overriding default meth2
    @Override
    public void meth2(){
        System.out.println("meth2 from NewMyInterface1 is Overridden in NewMyImplements");
    }

    @Override
    public void meth4() {
        System.out.println("this is meth4 from NewMyInterface2 implemented in NewMyImplements");
    }
}

public class Java_59_Polymorphism_In_Interfaces {
    public static void main(String[] args) {
        NewMyInterface1 MyObj = new NewMyDerived1();
        NewMyInterface1.meth0();
        MyObj.meth2(); // runs overridden method
        MyObj.meth3();
        // MyObj.meth4(); --> not valid
        // MyObj.meth5(); --> not valid
    }
}
