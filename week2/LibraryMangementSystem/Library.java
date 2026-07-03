package LibraryMangementSystem;
import java.util.ArrayList;

class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added.");
    }

    public void displayBooks() {

        for (Book b : books) {

            System.out.print(b.getId() + " ");

            System.out.print(b.getTitle() + " ");

            if (b.isBorrowed())
                System.out.println("Borrowed");
            else
                System.out.println("Available");
        }
    }
}
