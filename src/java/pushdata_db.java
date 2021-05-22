
import java.sql.ResultSet;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped

public class pushdata_db implements Serializable {

    public List<data_genel> getGenelnot() {
        return genelnot;
    }

    public void setGenelnot(List<data_genel> genelnot) {
        this.genelnot = genelnot;
    }


    private List<data_genel> genelnot =null;

    public pushdata_db() {
    }

    public String push_genelnot() throws Exception {
        this.genelnot = new ArrayList<data_genel>();
        data_genel item=new data_genel();
        db_connect conn = new db_connect();
        conn.connection = conn.connect();

        String query = "SELECT * FROM GENEL_NOT WHERE USER_ID = " + user_data.user.getUser_id();
        ResultSet rs = conn.stmt.executeQuery(query);
        while(rs.next()) {
            item.setTitle(rs.getString("title_not"));
            item.setContent(rs.getString("content_not"));
            item.setNote_id(rs.getInt("note_id"));
            this.genelnot.add(item);
            item=new data_genel();
        }

        return "show_notes.xhtml";
    }
 
   public int size(){
       return this.genelnot.size();
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
