
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped


public class haftalik_data extends db_connect implements Serializable {
    
       public haftalik_data() throws Exception {}
    
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
   
    public void get_monday() throws Exception {
        if (!this.getMonday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
    public void get_tuesday() throws Exception {
        if (!this.getTuesday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
    public void get_wednesday() throws Exception {
        if (!this.getWednesday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
    public void get_thursday() throws Exception {
        if (!this.getThursday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
    public void get_friday() throws Exception {
        if (!this.getFriday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
    
    
    public void get_saturday() throws Exception {
        if (!this.getSaturday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
    public void get_sunday() throws Exception {
        if (!this.getSunday().equals("")) {
        this.addWeeklyPlanner();
        } 
    }
      public void addWeeklyPlanner()throws Exception{
         db_connect conn = new db_connect();
        conn.connection=conn.connect();
        
       
      }
      
}
