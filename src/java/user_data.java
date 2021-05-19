
public class user_data {

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private int user_id = 0;

    public static user_data user;

    user_data() {
    }

    user_data(int ide) {
        this.user_id = ide;
    }

}
