
public class data_genel {
    //böyle bir class a bilgileri xhtml de gösterebilmek için gerekti
    private String title;
    private String content;
    private int note_id;

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    data_genel(){}
    
}
