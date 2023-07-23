/*
Syntax : To create an instance of generic class
BaseType<Type> obj = new BaseType<Type>();
*/

import java.util.ArrayList;

class GenericDemo<T1,T2>{
    T1 t1;
    T2 t2;
    public GenericDemo(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}
public class Java_110_Java_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        int a = (int)arr.get(0);
        System.out.println(a);

        GenericDemo<String,Integer> Obj = new GenericDemo<>("Ten",10);
        System.out.println(Obj.t1+", "+Obj.t2);
    }
}
