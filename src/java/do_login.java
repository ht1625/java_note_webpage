
import java.io.Serializable;
import java.sql.ResultSet;

import javax.faces.bean.SessionScoped;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped

public class do_login extends db_connect  implements Serializable {

    String userName;
    user_data users;

    public user_data getUsers() {
        return users;
    }

    public void setUsers(user_data users) {
        this.users = users;
    }
   
   
    
    public do_login()throws Exception{
          
    super();
     
    }

    public void do_loginn() throws Exception {
         
        this.users=new user_data();
        this.users=user_data.user;
        this.loginn();
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
              
        String query = "SELECT id, username, password FROM USERS";
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            if (this.getPass().equals(rs.getString("password"))) {
                if (this.getUserName().equals(rs.getString("username"))) {
                    int ide=rs.getInt("id");
                   user_data.user.setUser_id(ide);
                    return "Home.xhtml";
                }
            }
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
