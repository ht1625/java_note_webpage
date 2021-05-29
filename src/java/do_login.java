
import java.io.Serializable;
import java.sql.ResultSet;

import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped

public class do_login implements Serializable {

    String userName;
    user_data users;

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

    public void setPass(String pass) {
        this.pass = pass;
    }
    String pass;

    public String loginn() throws Exception {

        db_connect conn = new db_connect();
        conn.connection=conn.connect();

        String query = "SELECT * FROM USERS WHERE USERNAME ='"+this.getUserName()+"' AND PASSWORD ='"+this.getPass()+"'";
        ResultSet rs = conn.stmt.executeQuery(query);
        if (rs.next()) {
                    int ide = rs.getInt("id");
                    user_data.user.setUser_id(ide);
                    user_data.user.setFirstname(rs.getString("firstname"));
                    user_data.user.setSurname(rs.getString("surname"));
                    user_data.user.setEmail(rs.getString("email"));
                    user_data.user.setPhoneNumber(rs.getString("phonenumber"));
                    user_data.user.setBirthday(rs.getString("birthday"));
                    user_data.user.setPassword(rs.getString("password"));
                    user_data.user.setUsername(rs.getString("username"));
                    return "Home.xhtml";
                }
        return "index.xhtml";
    }

    public String save() {
        return "do_save.xhtml";
    }

    public String back_index() {
        return "index.xhtml";
    }

}
