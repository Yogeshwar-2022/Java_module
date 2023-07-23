class Library{
    String[] books = new String[6];
    String[] booksIss = new String[6];
    int sr = 0;

    void addBook(String newBook){
        this.books[sr] = newBook;
        sr++;
    }

    void displayBooks(){
        System.out.println("-----------------");
        System.out.print("available Books : \n");
        System.out.println("-----------------");
        for (String i : books) {
            if(i == null){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------");
        System.out.print("Issued Books : \n");
        System.out.println("-----------------");
        for (String j : booksIss) {
            if(j == null){
                continue;
            }
            System.out.println(j);
        }
        System.out.println("-----------------");
    }

    void issueBook(String issBook){
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i] == issBook){
                System.out.println(issBook + " is now issued to you");
                this.booksIss[i] = issBook;
                this.books[i] = null;
                return;
            }
        }
        System.out.println(issBook + " is not present in our library");
        displayBooks();
    }

    void returnBook(String retBook){
        for(int i = 0 ; i < this.booksIss.length ; i++){
            if(this.booksIss[i] == retBook){
                System.out.println("You have returned " + retBook);
                booksIss[i] = null;
                books[i] = retBook;
                return;
            }
        }
        System.out.println(retBook + " does not belong to our library");
        displayBooks();
    }
}

public class Java_Exercise_4 {
    public static void main(String[] args) {
        Library L = new Library();
        L.addBook("Beyond Good and Evil");
        L.addBook("Communist Manifesto");
        L.addBook("Plato's republic");
        L.addBook("The Myth of Sisyphus");
        L.addBook("The Prince");
        L.addBook("Art of War");
        L.displayBooks();
        L.issueBook("The Prince");
        L.displayBooks();
        L.returnBook("The Prince");
        L.displayBooks();
        L.issueBook("Thus spoke zarathustra");
        L.returnBook("Tao Te Cheng");
    }
}
