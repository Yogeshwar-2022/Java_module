/*
Syntax : default method
default void <method_name>(){
    ||Code;
}
 */

interface MyInterface1{
    // Static method
    static void meth0(){
        System.out.println("this is static meth0 from MyInterface1");
    }
    // Private method
    private void meth1(){
        System.out.println("this is private meth1 from MyInterface1");
    }
    // Default method
    default void meth2(){
        meth1();
        System.out.println("this is default meth2 from MyInterface1");
    }
    // abstract method
    void meth3();
}

interface MyInterface2{
    void meth4();
}

class MyBase1 {
    public void meth5(){
        System.out.println("this is meth5 from class MyBase1");
    }
}
class MyDerived1 extends MyBase1 implements MyInterface1,MyInterface2{

    // Calls static method from MyInterface1
    public void staticImplementation(){
        MyInterface1.meth0();
    }
    // Defining meth3
    @Override
    public void meth3() {
        System.out.println("this is meth3 from MyInterface1 implemented in MyImplements");
    }

    // Overriding default meth2
    @Override
    public void meth2(){
        System.out.println("meth2 from MyInterface1 is Overridden in MyImplements");
    }

    @Override
    public void meth4() {
        System.out.println("this is meth4 from MyInterface2 implemented in MyImplements");
    }
}


public class Java_57_Interfaces_Example_Default_Methods {
    public static void main(String[] args) {
        MyDerived1 Obj = new MyDerived1();
        Obj.meth2();
        Obj.meth3();
        Obj.meth4();
        Obj.meth5();
        Obj.staticImplementation();
        MyInterface1.meth0();

        MyInterface1 MyObj = new MyDerived1();
        MyObj.meth2(); // runs overridden method
    }
}
