
import java.io.Serializable;
import java.sql.ResultSet;

import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped

public class getdata_todo  implements Serializable {

   

    public String getList_todo() {
        return list_todo;
    }

    public void setList_todo(String list_todo) {
        this.list_todo = list_todo;
    }
   
   

    private String list_todo;

    public getdata_todo()  {}

    public String get_todo_list() throws Exception {
        if (!this.getList_todo().equals("")) {
           return  this.save_todo_list();
        } else {
           return  this.do_alert();
        }
    }

    public  String save_todo_list() throws Exception {
        
        db_connect conn = new db_connect();
        conn.connection=conn.connect();
        
        String query = "INSERT INTO TODO_LIST (user_id,element) VALUES (" + user_data.user.getUser_id() + ",'"
                + this.getList_todo() +"')";
        int num = conn.stmt.executeUpdate(query);
        return "todo_list.xhtml";
    }

    public String do_alert() {
        return "show_todolist.xhtml";
    }

}
