

import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class haftalik_data extends db_connect implements Serializable {


    public haftalik_data() throws Exception {
    }

    public String monday;
    public String tuesday;
    public String wednesday;
    public String thursday;
    public String friday;
    public String saturday;
    public String sunday;

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public void weekly() throws SQLException, Exception {
        this.addWeeklyPlanner();
    }

    public void addWeeklyPlanner() throws Exception, SQLException {

        db_connect conn = new db_connect();
        conn.connection=conn.connect();

        String query ="INSERT INTO EHA.WEEKLY_PLANNER (user_id ,monday, tuesday,wednesday,thursday,friday,saturday,sunday) VALUES (" +user_data.user.getUser_id()+ ",'"
                + this.getMonday() + "','" + this.getTuesday() + "','" + this.getWednesday() + "','" + this.getThursday() + "','" + this.getFriday() + "','"
                + this.getSaturday() + "','" + this.getSunday() +"')";
        int num = conn.stmt.executeUpdate(query);
  
   }

}