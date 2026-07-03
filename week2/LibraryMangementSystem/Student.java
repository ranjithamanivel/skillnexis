package LibraryMangementSystem;

class Student extends User {

    public Student(String name) {
        super(name);
    }
   @Override
    public void borrowBook(Book book) {

        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book already borrowed.");
        }
    }
   @Override
    public void returnBook(Book book) {

        if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}
