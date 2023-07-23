import java.util.Scanner;

class Employee_new{
    int salary;
    public int get_Salary(){
        return salary;
    }
    String name ;
    public String get_Name(){
        return name;
    }
    public void set_Name(String chg_name){
        name = chg_name;
    }
}

class CellPhone {
    String name ;
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
    public void calling(String name){
        System.out.format("Calling %S\n",name);
    }
}

class Square{
    double side;
    public double area(){
        double area = side * side;
        return area;
    }
    public double perimeter(){
        double perimeter = 4 * side;
        return perimeter;
    }
}

class Rectangle{
    double len;
    double bth;
    public double area(){
        double area = len * bth;
        return area;
    }
    public double perimeter(){
        double perimeter = (2*(len+bth));
        return perimeter;
    }
}

class TommyVicetti{
    public void kick(){
        System.out.println("Kicking");
    }
}

class Circle{
    double radi;
    public double area(){
        double area = 3.14*radi*radi;
        return area;
    }
    public double perimeter(){
        double perimeter = 2*3.14*radi;
        return perimeter;
    }
}

public class Java_Chapter_8_Practice_Set {
    public static void main(String[] args) {
        Employee_new Arya = new Employee_new();
        Arya.name = "Arya";
        Arya.salary = 200000000;
        System.out.println(Arya.get_Name());
        System.out.println(Arya.get_Salary());
        Arya.set_Name("Aryan");
        System.out.println(Arya.get_Name());

        CellPhone Obj = new CellPhone();
        Obj.name = "Arya";
        Obj.ringing();
        Obj.calling("Arya");

        Square S = new Square();
        S.side = 12d;
        System.out.println(S.area());

        TommyVicetti Fight = new TommyVicetti();
        Fight.kick();
    }

}
