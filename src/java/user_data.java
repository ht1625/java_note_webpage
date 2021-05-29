
public class user_data {

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private int user_id = 0;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getKaralama_not() {
        return karalama_not;
    }

    public void setKaralama_not(String karalama_not) {
        this.karalama_not = karalama_not;
    }
    private String karalama_not;
    private String firstname;
    private String surname;
    private String email;
    private String phoneNumber;
    private String birthday;
    private String username;
    private String password;
    public static user_data user;

    public static user_data getUser() {
        return user;
    }

    public static void setUser(user_data user) {
        user_data.user = user;
    }

    user_data() {
    }

    user_data(int ide) {
        this.user_id = ide;
    }

}
