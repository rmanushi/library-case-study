public class Book extends Title {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public Book(){
        super();
        this.author = "No author";
    }

    public String toString(int id, String title, String author){
        return super.toString() + "Author: " + author + ".";
    }
}
