import java.util.ArrayList;
import java.util.Scanner;

public class Java_Exercise_7 {
    static void addBook(ArrayList<String[]> Library,String BookName, String Author){
        String[] arr = {BookName,Author};
        Library.add(arr);
    }

    static void viewBooks(ArrayList<String []> Library){
        for (String[] arr:Library) {
            System.out.println("Book name : "+arr[0]);
            System.out.println("Author name : "+arr[1]);
        }
    }

    static void issueBook(ArrayList<String[]> Library, ArrayList<String[]> LibRecord, String BookName, String Author,String IssuedTo, String IssuedOn){
        for (String[] arr:Library) {
            if(BookName.equals(arr[0]) && Author.equals(arr[1])){
                Library.remove(arr);

                String[] tArr = new String[4];
                tArr[0]=BookName;
                tArr[1]=Author;
                tArr[2]=IssuedTo;
                tArr[3]=IssuedOn;
                LibRecord.add(tArr);

                break;
            }
        }
    }

    static void returnBook(ArrayList<String[]> Library, ArrayList<String[]> LibRecord,String BookName, String Author){
        for (String[] arr:LibRecord) {
            if(BookName.equals(arr[0]) && Author.equals(arr[1])){
                String[] tArr = {arr[0],arr[1]};
                Library.add(tArr);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String[]> Library = new ArrayList<>();
        ArrayList<String[]> LibRecord = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n1.View Books\n2.Add Books\n3.Issue Book\n4.Return Book\n5.Exit");
            System.out.print("\nselect : ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (choice==1){
                viewBooks(Library);
            }

            if (choice==2){
                System.out.print("Num of Books to add : ");
                int NumAdd = Integer.parseInt(sc.nextLine());
                System.out.println();
                for (int i=0;i<NumAdd;i++) {
                    System.out.print("Book : ");
                    String BookName = sc.nextLine();

                    System.out.print("Author : ");
                    String Author = sc.nextLine();

                    addBook(Library, BookName, Author);
                }
            }

            if (choice == 3){
                viewBooks(Library);

                System.out.print("\nBook Number : ");
                int BookNum = Integer.parseInt(sc.nextLine()) - 1;
                System.out.print("Issued to : ");
                String IssuedTo = sc.nextLine();
                System.out.print("Issued on : ");
                String IssuedOn = sc.nextLine();

                String[] tArr1 = Library.get(BookNum);

                issueBook(Library, LibRecord, tArr1[0], tArr1[1], IssuedTo, IssuedOn);
            }

            if (choice == 4){
                viewBooks(LibRecord);

                System.out.print("\nBook Number : ");
                int ReturnBookNum = Integer.parseInt(sc.nextLine()) - 1;

                String[] tArr2 = LibRecord.get(ReturnBookNum);

                returnBook(Library, LibRecord, tArr2[0], tArr2[1]);
            }

            if (choice == 5){
                break;
            }
        }
    }
}
