
public class user_data {

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private  int user_id = 0;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    private String firstname;
    private String nickname;
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
