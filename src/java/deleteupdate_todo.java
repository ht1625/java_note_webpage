
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.validator.internal.util.logging.Messages;

@ManagedBean
@SessionScoped
public class deleteupdate_todo implements Serializable {

    private data_todo upd_todo;

    public data_todo getUpd_todo() {
        return upd_todo;
    }

    public void setUpd_todo(data_todo upd_todo) {
        this.upd_todo = upd_todo;
    }

    public String del_todo(int ToDo_id,int sayac) throws Exception {
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query = "DELETE FROM TODO_LIST WHERE id = " + ToDo_id;
        int num = conn.stmt.executeUpdate(query);
        if(sayac==1){
            return "todo_list.xhtml";
        }
        else  return "show_todolist.xhtml";
    }

    public String upd_note_todo(int ToDo_id, String content) {

        this.upd_todo = new data_todo();
        this.upd_todo.setToDo_id(ToDo_id);
        this.upd_todo.setContent(content);
        return "edit_todo.xhtml";
    }

    public String do_upd_todo() throws Exception {
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query1 = "UPDATE TODO_LIST SET element='" + this.upd_todo.getContent() + "' WHERE id=" + this.upd_todo.getToDo_id();
        int num1 = conn.stmt.executeUpdate(query1);
        return "show_todolist.xhtml";
    }

    public deleteupdate_todo() {
    }
}
