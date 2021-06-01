
import java.sql.ResultSet;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped

public class datadb_todo implements Serializable {

    public List<data_todo> getToDo() {
        return todo;
    }

    public void setTodo(List<data_todo> todo) {
        this.todo = todo;
    }


    public List<data_todo> todo = null;

    public datadb_todo() {
    }

    public String pull_todolist(int sayac) throws Exception {
        this.todo = new ArrayList<data_todo>();
        data_todo item=new data_todo();
        db_connect conn = new db_connect();
        conn.connection = conn.connect();

        String query = "SELECT * FROM TODO_LIST WHERE user_id = " + user_data.user.getUser_id();
        ResultSet ts = conn.stmt.executeQuery(query);
        while(ts.next()) {
            item.setContent(ts.getString("element"));
            item.setToDo_id(ts.getInt("id"));
            this.todo.add(item);
            item=new data_todo();
        }
       if(sayac==1){
           return "todo_list.xhtml";
       }
       else{
           return "show_todolist.xhtml";
       }
        
    }

}
