package LibraryMangementSystem;

public class Book {
      private int id;
    private String title;
    private boolean borrowed;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.borrowed = false;
    }

    public int getId() {
         return id;
    }

    public String getTitle() {
        return title;
    }

   public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
 
}
