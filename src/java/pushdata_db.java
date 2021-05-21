
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped

public class pushdata_db implements Serializable {

    public String[][] genelnote;
    

    public pushdata_db() {
    }

    public String push_genelnot() throws Exception {
        
        this.genelnote=new String[100][2];
        int i=0;
        db_connect conn = new db_connect();
        conn.connection=conn.connect();

        String query = "SELECT * FROM GENEL_NOT WHERE USER_ID = " + user_data.user.getUser_id();
        ResultSet rs = conn.stmt.executeQuery(query);
        if (rs.next()) {
                this.genelnote[i][0]=rs.getString("title_not");
                this.genelnote[i][1]=rs.getString("content_not");
                i++;
        }

        return "show_notes.xhtml";
    }
   

    
    public String push_list() {

        return "show_notes.xhtml";
    }

    public String push_haftalık() {

        return "show_notes.xhtml";
    }

    public String push_trash() {

        return "show_notes.xhtml";
    }
}
