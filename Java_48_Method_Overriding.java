class A{
    public int a ;
    public int arya(){
        return 4;
    }
    public void meth(){
        System.out.println("I am a method meth of class A");
    }
    public void meth1(){
        System.out.println("I am a method meth1 of class A");
    }
}

class B extends A{
    // Method Overriding
    @Override // Denotes overriding is happening
    public void meth1(){
        System.out.println("I am a method meth1 of class B");
    }
    public void meth2(){
        System.out.println("I am method meth2 of class B");
    }
}

public class Java_48_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth1();
        b.meth1();
    }
}
