
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

    private List<data_genel> genelnot=null;

    public List<data_genel> getTrash_genel() {
        return trash_genel;
    }

    public void setTrash_genel(List<data_genel> trash_genel) {
        this.trash_genel = trash_genel;
    }

    public pushdata_db() {
    }

    public List<data_weeklyPlanners> getWeekly() {
        return weekly;
    }

    public void setWeekly(List<data_weeklyPlanners> weekly) {
        this.weekly = weekly;
    }
    private List<data_genel>trash_genel=null;
    private List<data_weeklyPlanners> weekly = null;

    public String pull_genel_not() throws Exception{
        this.genelnot=new ArrayList<data_genel>();
        data_genel it=new data_genel();
        db_connect con=new db_connect();
        con.connection = con.connect();
        
        String qu= "SELECT * FROM GENEL_NOT WHERE is_active = 1 AND user_id = "+user_data.user.getUser_id();
        ResultSet rst=con.stmt.executeQuery(qu);
        while(rst.next()){
            it.setNote_id(rst.getInt("note_id"));
            it.setTitle(rst.getString("title_not"));
            it.setContent(rst.getString("content_not"));
            this.genelnot.add(it);
            it=new data_genel();           
        }
        return "show_notes.xhtml";
    }
    
    
    public int size() {
        return this.genelnot.size();
    }

    public String push_trash() throws Exception {
        this.pull_genel();
        this.pull_weekly();
        return "trash.xhtml";
    }

    public void pull_weekly() throws Exception {
        this.weekly = new ArrayList<data_weeklyPlanners>();
        data_weeklyPlanners item = new data_weeklyPlanners();
        db_connect conn = new db_connect();
        conn.connection = conn.connect();

        String query = "SELECT * FROM WEEKLY_PLANNER WHERE isactive = 0 AND user_id = " + user_data.user.getUser_id();
        ResultSet rs = conn.stmt.executeQuery(query);
        while (rs.next()) {
            item.setWeekly_id(rs.getInt("weekly_id"));
            item.setMonday((String) rs.getString("monday"));
            item.setTuesday(rs.getString("tuesday"));
            item.setWednesday(rs.getString("wednesday"));
            item.setThursday(rs.getString("thursday"));
            item.setFriday(rs.getString("friday"));
            item.setSaturday(rs.getString("saturday"));
            item.setSunday(rs.getString("sunday"));
            this.weekly.add(item);
            item = new data_weeklyPlanners();
        }

    }

    public void pull_genel() throws Exception {
        this.trash_genel = new ArrayList<data_genel>();
        data_genel item = new data_genel();
        db_connect conn = new db_connect();
        conn.connection = conn.connect();

        String query = "SELECT * FROM GENEL_NOT WHERE is_active = 0 AND user_id = " + user_data.user.getUser_id();
        ResultSet rs = conn.stmt.executeQuery(query);
        while (rs.next()) {
            item.setTitle(rs.getString("title_not"));
            item.setContent(rs.getString("content_not"));
            item.setNote_id(rs.getInt("note_id"));
            this.trash_genel.add(item);
            item = new data_genel();
        }

    }
}
