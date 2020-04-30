import java.util.ArrayList;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private int nowOnLoan; //IT APPEARS ON THE DIAGRAM BUT WE WILL NOT NEED IT
    public static final int MAX_ON_LOAN = 6;
    private List <Borrowable> onLoan;

    public Member(int id, String name){
        this.id = id;
        setName(name);
        onLoan = new ArrayList<Borrowable>();
    }

    public Member(){
        name = "No name entered";
        id = 0;
    }
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Id: " + id + " Name: " + name + " Now on loan: " + nowOnLoan;
    }

    public void borrows(Borrowable bor) {
        if(onLoan.size() < MAX_ON_LOAN) {
            bor.isBeingBorrowed();

            onLoan.add(bor);
        }
    }

    public void returns(Borrowable bor) {
        bor.isBeingReturned();

        onLoan.remove(bor);
    }
    //3. are there any conditions for this job to happen?
    //1. what happens to the attributes of this object?
    //2. what happens to the object parameters (if there are any) ?
}