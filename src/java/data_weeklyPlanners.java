
public class data_weeklyPlanners {
private int weekly_id;
public String monday;
public String tuesday;
public String wednesday;
public String thursday;
public String friday;
public String saturday;
public String sunday;

    public data_weeklyPlanners() {
    }

    public data_weeklyPlanners(int weekly_id, String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
        this.weekly_id = weekly_id;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }


    public int getWeekly_id() {
        return weekly_id;
    }

    public void setWeekly_id(int weekly_id) {
        this.weekly_id = weekly_id;
    }

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


    
}
