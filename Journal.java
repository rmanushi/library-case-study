public class Journal extends Title {
    private String editor;

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Journal(int id, String title, String editor) {
        super(id, title);
        this.editor = editor;
    }

    public Journal(){
        super();
        this.editor = "No editor";
    }


   public String toString(int id, String title, String editor){
      return  super.toString() + "Editor: " + editor + ".";
   }
}
