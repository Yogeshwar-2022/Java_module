class class1{
    int a;
    public class1(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public int returnOne(){
        return 1;
    }
}

class class2 extends class1{
    public class2(int b) {
        super(b);
        System.out.println("I am a constructor of class2");
    }
}

public class Java_47_This_And_Super_Keyword {
    public static void main(String[] args) {
        class1 C = new class1(1);
        System.out.println(C.getA());
        class2 C2 = new class2(2);
    }
}
