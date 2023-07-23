/*
Syntax :
public abstract class <class_name> {
    ||Code
}
*/

abstract class Parent{
    abstract public void method1();
    abstract public void method2();
}

class Child1 extends Parent {
    @Override
    public void method1() {
        System.out.println("Implementing method 1");
    }
    @Override
    public void method2() {
        System.out.println("Implementing method 2");
    }
}

abstract class Child2 extends Parent{
    public void method3(){
        System.out.println("Implementing method 3 of child class 3");
    }
}

public class Java_53_Abstract_Class_Abstract_Methods {
    public static void main(String[] args) {
        // Parent Obj = new Parent(); --> An abstract class cannot be instantiated
        Parent Obj = new Child1(); // --> referencing abstract class via object of it's subclass
        Child1 MyObj = new Child1();

        Obj.method1();
    }
}
