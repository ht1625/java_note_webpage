
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped


public class show_weeklyPlanners extends db_connect implements Serializable {

   public show_weeklyPlanners() {
    }

    public List<data_weeklyPlanners> weekly;

    public List<data_weeklyPlanners> getWeekly() {
        return weekly;
    }

    public void setWeekly(List<data_weeklyPlanners> weekly) {
        this.weekly = weekly;
    }

    public String days() throws Exception {
        this.weekly = new ArrayList<data_weeklyPlanners>();
        data_weeklyPlanners item = new data_weeklyPlanners();
        

        db_connect conn = new db_connect();
        conn.connection = conn.connect();

        String query = "SELECT weekly_id,monday,tuesday,wednesday,thuesday,friday,saturday,sunday FROM WEEKLY_PLANNER WHERE USER_ID = " + user_data.user.getUser_id();
        ResultSet rs = conn.stmt.executeQuery(query);
         while(rs.next()) {
             item.setWeekly_id(rs.getInt("weekly_id"));
            item.setMonday(rs.getString("monday"));
            item.setTuesday(rs.getString("tuesday"));
            item.setWednesday(rs.getString("wednesday"));
            item.setThursday(rs.getString("thursday"));
            item.setFriday(rs.getString("friday"));
            item.setSaturday(rs.getString("saturday"));
            item.setSunday(rs.getString("sunday"));
            
         this.weekly.add(item);
            item=new data_weeklyPlanners();
        }

        return "show_weeklyPlanners.xhtml";
    }

}
