class Cylinder{
    private double R;
    private double H;

    public double getRadius() {
        return R;
    }
    public void setRadius(double R) {
        this.R = R;
    }

    public double getHeight() {
        return H;
    }
    public void setHeight(double H) {
        this.H = H;
    }

    public double surface_area() {
        double V;
        V = 3.14*R*R*H;
        return V;
    }
    public double volume() {
        double SA;
        SA = ((2*3.14*R*H) + (2*3.14*R*R));
        return SA;
    }
}

class CylinderNew{
    private double r;
    private double h;
    public CylinderNew(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getRadiusNew() {
        return r;
    }
    public double getHeightNew() {
        return h;
    }
}

class RectangleNew {
    private int L;
    private int B;
    public RectangleNew(){
        this.L = 4;
        this.B = 5;
    }
    public RectangleNew(int L , int B){
        this.L = L;
        this.B = B;
    }
    public RectangleNew(int L) {
        this.L = L;
    }

    public int getL() {
        return L;
    }
    public int getB() {
        return B;
    }
}

class Sphere {
    private double Rad;

    public double getRad() {
        return Rad;
    }
    public void setRad(double Rad) {
        this.Rad = Rad;
    }
}

public class Java_Chapter_9_Practice_Set {
    public static void main(String[] args) {
        Cylinder C = new Cylinder();
        C.setRadius(15);
        C.setHeight(12);
        System.out.println("Radius of Cylinder : "+C.getRadius());
        System.out.println("Height of Cylinder : "+C.getHeight());
        System.out.println("S.Area of Cylinder : "+C.surface_area());
        System.out.println("Volume of Cylinder : "+C.volume());

        CylinderNew c = new CylinderNew(12 ,15);
        System.out.println("Radius of Cylinder : "+c.getRadiusNew());
        System.out.println("Height of Cylinder : "+c.getHeightNew());

        RectangleNew R = new RectangleNew();
        System.out.println("Length of Rectangle : "+R.getL());
        System.out.println("Breadth of Rectangle : "+R.getB());
        RectangleNew r = new RectangleNew(12,15);
        System.out.println("Length of Rectangle : "+r.getL());
        System.out.println("Breadth of Rectangle : "+r.getB());
        RectangleNew Q = new RectangleNew(12);
        System.out.println("Length of Rectangle : "+Q.getL());

        Sphere S = new Sphere();
        S.setRad(5);
        System.out.println("Radius of Sphere : "+S.getRad());
    }
}
