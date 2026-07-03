package LibraryMangementSystem;

public class Driver {
    public static void main(String[] args) {
    
        Library library = new Library();

        Book b1 = new Book(1, "Java");
        Book b2 = new Book(2, "Spring Boot");

        library.addBook(b1);
        library.addBook(b2);

        Student s = new Student("Ranjitha");

        System.out.println();

        library.displayBooks();

        System.out.println();

        s.borrowBook(b1);

        System.out.println();

        library.displayBooks();

        System.out.println();

        s.returnBook(b1);

        System.out.println();

        library.displayBooks();
    }
}
