public class Title
{
    private int id;
    private String title;

    public Title (int id ,String title) {
        this.id = id;
        setTitle(title);
    }

    public Title(){
        title = "No title";
        id = 0;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String toString()
    {
        return "Id: " + id + " Title: " + title;
    }
}
