/*
Syntax :
interface <interface_name>{
    ||Code
}
class <class_name> implements <interface_name>{
    ||Code
}
 */

interface Interface1 {
    int var = 1;
    void method1();
    void method2();
}
interface Interface2 {
    int method3();
}

/*
class BASE1 {}
class BASE2 {}
class DERIVED extends BASE1,BASE2 {}
--> not valid
*/

class Implementation implements Interface1,Interface2{ //only possible with interfaces
    @Override
    public void method1() {
        System.out.println("Implementing method 1");
    }
    @Override
    public void method2() {
        System.out.println("Implementing method 2");
    }
    @Override
    public int method3() {
        return 0;
    }
}

public class Java_54_Introduction_To_Interfaces {
    public static void main(String[] args) {
        Implementation Obj = new Implementation();
        Obj.method1();
        Obj.method2(); // --> method1 , method2 are implicitly public in Interface1
        System.out.println(Obj.var); // --> var is implicitly public in Interface1
        // Obj.var = 10; --> not valid since var is implicitly final in Interface1
        System.out.println(Obj.method3());

        Interface1 MyObj = new Implementation(); // --> will only implement methods of Interface1
        Interface2 NewObj = new Implementation(); // --> will only implement methods of Interface2
    }
}


