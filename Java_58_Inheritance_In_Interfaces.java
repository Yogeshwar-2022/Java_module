/*
Syntax : Inheritance in Interface
public interface Interface1 {
    void meth1 ();
}

public interface Interface2 extends Interface1 {
    void meth 2( );
}
 */

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1 from sampleInterface");
    }
    public void meth2(){
        System.out.println("meth2 from sampleInterface");
    }
    public void meth3(){
        System.out.println("meth3 from childSampleInterface");
    }
    public void meth4(){
        System.out.println("meth4 from childSampleInterface");
    }
}

public class Java_58_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
