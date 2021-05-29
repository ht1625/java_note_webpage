
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

public class get_data  implements Serializable {
   
    
    public String getGenel_not() {
        return genel_not;
    }

    public void setGenel_not(String genel_not) {
        this.genel_not = genel_not;
    }

    public String getTitle_genel_not() {
        return title_genel_not;
    }

    public void setTitle_genel_not(String title_genel_not) {
        this.title_genel_not = title_genel_not;
    }

    public String genel_not;
    public String title_genel_not;


    public get_data()  {}

    public void get_genel_note() throws Exception {
        if (!this.getGenel_not().equals("") && !this.getTitle_genel_not().equals("")) {
            this.save_genelnot();
        } else {
            this.do_alert();
        }
    }

    public void save_genelnot() throws Exception {
        
        db_connect conn = new db_connect();
        conn.connection=conn.connect();
        
        String query = "INSERT INTO GENEL_NOT (user_id,title_not,content_not) VALUES (" + user_data.user.getUser_id() + ",'" + this.getTitle_genel_not() + "','"
                + this.getGenel_not() +"')";
        int num = conn.stmt.executeUpdate(query);
        this.do_alert();
    }

    public String do_alert() {
        return "show_notes.xhtml";
    }

}
