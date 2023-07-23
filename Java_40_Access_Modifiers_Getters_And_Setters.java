class MyEmployee {

    private int id;
    private  String name; // using private (access modifier) keyword to make class members private

    public void setId(int Id){ // setter
        id = Id;
    }
    public int getId(){ // getter
        return id;
    }
}

public class Java_40_Access_Modifiers_Getters_And_Setters {
    public static void main(String[] args) {

        MyEmployee Arya = new MyEmployee();
        // Arya.id = 12 ; Throws error as id is private

        // using getter and setter method to access private members of the class
        Arya.setId(23);
        System.out.println(Arya.getId());
    }
}
