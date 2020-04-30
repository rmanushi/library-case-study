public class BookCopy implements Borrowable {
    private int id;
    private boolean available;
    private Book book;

    public BookCopy(int id, Book book) {
        this.id = id;
        this.book = book;
        available = true;
    }

    public BookCopy(){
        id = 0;
        available = false;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public boolean isAvailable()
    {
        return available;
    }

    @Override
    public void isBeingBorrowed() {
        if (available){
            available = false;

        }
    }

    @Override
    public void isBeingReturned() {
        if (!available){
            available = true;
        }

    }

    public String toString() {
        return "BookCopy [id=" + id + ", available=" + available + "]";
    }


    //3. are there any conditions for this job to happen?
    //1. what happens to the attributes of this object?
    //2. what happens to the object parameters (if there are any) ?
}
