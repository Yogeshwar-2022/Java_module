import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Java_111_File_Handling {
    public static void main(String[] args) throws Exception {
        //Create
        File myFile = new File("Sample.txt");
        myFile.createNewFile();

        //Write
        FileWriter myFileWrite = new FileWriter("Sample.txt");
        myFileWrite.write("This is a sample file created in java\nThe end");
        myFileWrite.close();

        //Read
        File myFileRead = new File("Sample.txt");
        Scanner sc = new Scanner(myFileRead);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

        //Delete
        File myFileDelete = new File("Sample.txt");
        myFileDelete.delete();
    }
}
