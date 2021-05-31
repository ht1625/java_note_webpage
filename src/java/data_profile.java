
public class data_profile {

    public data_profile() {
    }

    private String username;
    private String phonenumber;
    private String birthday;
    private String email;

    public data_profile(String username, String name, String surname, String phonenumber, String birthday, String email) {
        this.username = username;
        this.phonenumber = phonenumber;
        this.birthday = birthday;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
