/*
class <class_name>{
    field;
    method;
}
*/
// 1 Java file can have only public class

class Employee {
    int id ;
    int salary ;
    String name ;

    public void get_Details(){
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
        System.out.println("Salary is : " + salary);
        System.out.println();
    }
}
public class Java_38_Creating_Our_Custom_Class {
    public static void main(String[] args) {
        Employee Harry = new Employee();
        Harry.id = 1;
        Harry.name = "Harry";
        Harry.salary = 10000;

        Harry.get_Details();

        Employee john = new Employee();
        john.id = 2;
        john.salary = 12000;
        john.name = "John";

        john.get_Details();
    }
}
