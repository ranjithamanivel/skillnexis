package LibraryMangementSystem;

abstract class User {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    abstract void borrowBook(Book book);

    abstract void returnBook(Book book);
}
