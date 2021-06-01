
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped


public class data_todo {
    
    private String content;
    private int ToDo_id;

    public int getToDo_id() {
        return ToDo_id;
    }

    public void setToDo_id(int ToDo_id) {
        this.ToDo_id = ToDo_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    data_todo(){}

   // void getToDo_id(int aInt) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
