class MyBase {
    public MyBase() {
        System.out.println("This is a constructor of class MyBase");
    }
    public MyBase(int x){
        System.out.println("This is an overloaded constructor of class MyBase where x = "+x);
    }
}

class MyDerived extends MyBase{
    public MyDerived() {
        // super(1);
        System.out.println("This is a constructor of class MyDerived");
    }
    public MyDerived(int x, int y){
        super(x);
        System.out.println("This is an overloaded constructor of class MyDerived where y = "+y);
    }
}

class ChildOfMyDerived extends MyDerived{
    public ChildOfMyDerived() {
        System.out.println("This is a constructor of class ChildOfMyDerived");
    }
    public ChildOfMyDerived(int x, int y, int z){
        super(x,y);
        System.out.println("This is an overloaded constructor of class ChildOfMyDerived where z = "+z);
    }
}

public class Java_46_Constructors_In_Inheritance {
    public static void main(String[] args) {
        /*
        MyBase B = new MyBase();
        MyBase B_ = new MyBase(1);
        MyDerived D = new MyDerived(); // It will call  constructor of both base and derived class
        MyDerived D_ = new MyDerived(1,2);
        ChildOfMyDerived C = new ChildOfMyDerived();
         */
        ChildOfMyDerived C_ = new ChildOfMyDerived(1,2,3);
    }
}
