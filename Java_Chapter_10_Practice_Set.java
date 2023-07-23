class MyCircle {
    public double R;
    public MyCircle(double r) { // Constructor
        R = r;
    }
    public double getR() { // getter --> R/Circle,Cylinder
        return R;
    }
    public double area(){ // method --> area/Circle
        return 3.14*R*R;
    }
}
class MyCylinder extends MyCircle{
    public double H;
    public MyCylinder(double h,double R) { // Constructor
        super(R);
        H = h;
    }
    public double getH() { // getter --> H/Cylinder
        return H;
    }
    public double surfaceArea(){ // method --> surfaceArea/Cylinder
        return ((2*3.14*R*H)+(2*area()));
    }
    public double volume(){ // method --> volume/Cylinder
        return 3.14*R*R*H;
    }
}

class MyRectangle {
    public double L;
    public double B;
    public MyRectangle(double l, double b) { // Constructor
        L = l;
        B = b;
    }
    public double getL() { // getter --> L/Rectangle
        return L;
    }
    public double getB() { // getter --> B/Rectangle
        return B;
    }
    public double area(){ // method --> area/Rectangle
        return L*B;
    }
}
class MyCuboid extends MyRectangle{
    public double W;
    public MyCuboid(double l, double b, double w) { // Constructor
        super(l, b);
        W = w;
    }
    public double getW() { // getter --> W/Cuboid
        return W;
    }
    public double surfaceArea(){ // method --> surfaceArea/Cylinder
        return (2*L*B)+(2*L*W)+(2*B*W);
    }
    public double volume(){ // method --> volume/Cylinder
        return L*B*W;
    }
}

class base {
    public base() {
        System.out.println("Constructor of lvl one");
    }
}
class derived1 extends base {
    public derived1() {
        System.out.println("Constructor of lvl two");
    }
}
class derived2 extends derived1 {
    public derived2() {
        System.out.println("Constructor of lvl three");
    }
}

public class Java_Chapter_10_Practice_Set {
    public static void main(String[] args) {
        MyCylinder C = new MyCylinder(12,15);
        System.out.println("Height of the Cylinder : "+C.getH());
        System.out.println("Radius of the Cylinder : "+C.getR());
        System.out.println("___________________________");
        System.out.println("Area of Circle : "+C.area());
        System.out.println("Surface Area of Cylinder : S"+C.surfaceArea());
        System.out.println("Volume of Cylinder : "+C.volume());
        System.out.println("___________________________");
        MyCuboid R = new MyCuboid(12,13,15);
        System.out.println("Length of the Cuboid : "+R.getL());
        System.out.println("Breadth of the Cuboid : "+R.getB());
        System.out.println("Width of the Cuboid : "+R.getW());
        System.out.println("___________________________");
        System.out.println("Area of Rectangle : "+R.area());
        System.out.println("Surface Area of Cuboid : "+R.surfaceArea());
        System.out.println("Volume of Cuboid : "+R.volume());
        System.out.println("___________________________");
        // derived1 obj = new derived2(); // throwing error
    }
}
