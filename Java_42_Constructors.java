/*
Syntax :

Default Constructor -->
<class_name>(){
//code to be executed on the execution of the constructor
}

Parametrized Constructor -->
<class-name>(<data-type> param1, <data-type> param2,......){
//code to be executed on the invocation of the constructor
}

shortcut for creating constructor/getter-setter --> alt + insert
*/

class MyMainEmployee{
    int id;
    String name;
    // Default Constructor
    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    // Parameterized Constructor
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    // Constructor Overloading
    public MyMainEmployee(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class Java_42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee obj1 = new MyMainEmployee(); // Calls the constructor method
        System.out.println(obj1.getId());
        System.out.println(obj1.getName()); // returns values in default constructor

        MyMainEmployee obj2 = new MyMainEmployee("Arya",1);
        System.out.println(obj2.getId());
        System.out.println(obj2.getName()); // returns values given to parametrized constructor

        MyMainEmployee obj3 = new MyMainEmployee("Yogesh");
        System.out.println(obj3.getName()); // returns value given to overloaded parametrized constructor
    }
}
