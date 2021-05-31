
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class deleteUpdate_weeklyPlanner implements Serializable {

     public deleteUpdate_weeklyPlanner(){}

    public data_weeklyPlanners deleteUptade;

    public data_weeklyPlanners getDeleteUptade() {
        return deleteUptade;
    }

    public void setDeleteUptade(data_weeklyPlanners deleteUptade) {
        this.deleteUptade = deleteUptade;
    }

    public String delete_week(int weekly_id) throws Exception {
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query = "UPDATE EHA.WEEKLY_PLANNER SET isactive = 0 WHERE weekly_id = " + weekly_id;
        int num = conn.stmt.executeUpdate(query);
        return "show_weeklyPlanner.xhtml";
    }

    public String update_week(int weekly_id, String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {

        this.deleteUptade = new data_weeklyPlanners();
        this.deleteUptade.setWeekly_id(weekly_id);
        this.deleteUptade.setMonday(monday);
        this.deleteUptade.setTuesday(tuesday);
        this.deleteUptade.setWednesday(wednesday);
        this.deleteUptade.setThursday(thursday);
        this.deleteUptade.setFriday(friday);
        this.deleteUptade.setSaturday(saturday);
        this.deleteUptade.setSunday(sunday);
        return "edit_haftalik.xhtml";
    }

    public String upd_week() throws Exception { 
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query = "UPDATE EHA.WEEKLY_PLANNER SET monday='" + this.deleteUptade.getMonday()+ "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num = conn.stmt.executeUpdate(query);
        String query1 = "UPDATE EHA.WEEKLY_PLANNER SET tuesday='" + this.deleteUptade.getTuesday() + "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num1 = conn.stmt.executeUpdate(query1);
        String query2 = "UPDATE EHA.WEEKLY_PLANNER SET wednesday='" + this.deleteUptade.getWednesday()+ "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num2 = conn.stmt.executeUpdate(query2);
        String query3 = "UPDATE EHA.WEEKLY_PLANNER SET thursday='" + this.deleteUptade.getThursday()+ "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num3 = conn.stmt.executeUpdate(query3);
        String query4 = "UPDATE EHA.WEEKLY_PLANNER SET friday='" + this.deleteUptade.getFriday()+ "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num4 = conn.stmt.executeUpdate(query4);
        String query5 = "UPDATE EHA.WEEKLY_PLANNER SET saturday='" + this.deleteUptade.getSaturday()+ "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num5 = conn.stmt.executeUpdate(query5);
        String query6 = "UPDATE EHA.WEEKLY_PLANNER SET sunday='" + this.deleteUptade.getSunday()+ "' WHERE weekly_id=" + this.deleteUptade.getWeekly_id();
        int num6 = conn.stmt.executeUpdate(query6);
        return "show_weeklyPlanner.xhtml";
    }

}
