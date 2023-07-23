/*
class Subclass-name extends Superclass-name {
    //methods and fields
}
*/

class Base {
    public int x;

    // getter
    public int getX() {
        return x;
    }

    // setter
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Java_45_Inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        // b.setY(8); --> not valid
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(12);
        d.setX(16);
        System.out.println(d.getY());
        System.out.println(d.getX());
    }
}
