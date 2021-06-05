
import java.sql.ResultSet;

import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.sql.ResultSetMetaData;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped

public class do_login implements Serializable {

    String userName;
    user_data users;
    private List<data_genel> genelnot = null;

    public List<data_genel> getGenelnot() {
        return genelnot;
    }

    public void setGenelnot(List<data_genel> genelnot) {
        this.genelnot = genelnot;
    }

    public user_data getUsers() {
        return users;
    }

    public void setUsers(user_data users) {
        this.users = users;
    }

    public do_login() {

        this.users = new user_data();
        user_data.user = this.users;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    String pass;
    private int size=0;

    public String loginn() throws Exception {

        db_connect conn = new db_connect();
        conn.connection = conn.connect();

        String query = "SELECT * FROM USERS WHERE USERNAME ='" + this.getUserName() + "' AND PASSWORD ='" + this.getPass() + "'";
        ResultSet rs = conn.stmt.executeQuery(query);
        if (rs.next()) {
            this.pull_home_content();
            int ide = rs.getInt("id");
            user_data.user.setUser_id(ide);
            user_data.user.setFirstname(rs.getString("firstname"));
            user_data.user.setSurname(rs.getString("surname"));
            user_data.user.setEmail(rs.getString("email"));
            user_data.user.setPhoneNumber(rs.getString("phonenumber"));
            user_data.user.setBirthday(rs.getString("birthday"));
            user_data.user.setPassword(rs.getString("password"));
            user_data.user.setUsername(rs.getString("username"));
            user_data.user.setKaralama_not(rs.getString("karalama_notu"));
            return "Home.xhtml";
        }
        return "index.xhtml";
    }

    public void pull_home_content() throws Exception {

        db_connect con = new db_connect();
        con.connection = con.connect();
        ResultSet rs = con.stmt.executeQuery("select * from genel_not");
        ResultSetMetaData rsmd = rs.getMetaData();
        this.size = rsmd.getPrecision(1);
  
    }

    public int size() {
        return this.size;
    }

    public String save() {
        return "do_save.xhtml";
    }

    public String back_index() {
        return "index.xhtml";
    }

    public String exit() throws Exception {

        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query = "UPDATE USERS SET karalama_notu = '" + user_data.user.getKaralama_not() + "' WHERE id = " + user_data.user.getUser_id();
        int num = conn.stmt.executeUpdate(query);

        return "index.xhtml";
    }
}
