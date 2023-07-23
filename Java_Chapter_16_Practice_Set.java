import java.io.File;
import java.io.FileWriter;

interface Interface{
    void method();
}

class DeprecatedMethodClass{
    @Deprecated
    void deprecatedMethod(){
        System.out.println("This method has been deprecated");
    }
}

public class Java_Chapter_16_Practice_Set {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecated")
        DeprecatedMethodClass Obj1 = new DeprecatedMethodClass();
        Obj1.deprecatedMethod();

        Interface I = new Interface() {
            @Override
            public void method() {
                System.out.println("This is a method");
            }
        };

        File Table = new File("Table.txt");
        Table.createNewFile();
        FileWriter WriteTable = new FileWriter("Table.txt");
        for(int i=1;i<=10;i++){
            WriteTable.write("\n19 X "+i+" = "+19*i);
        }
        WriteTable.close();
    }
}
