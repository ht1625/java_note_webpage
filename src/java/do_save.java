
import java.io.Serializable;
import java.sql.Connection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class do_save extends db_connect implements Serializable {

    String username;
    String firstname;
    String surname;

    public do_save() throws Exception {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    String password;

    public void save() throws Exception {
        if (this.getFirstname().equals("") || this.getSurname().equals("") || this.getUsername().equals("") || this.getPassword().equals("")) {
            this.give_alert();
        } else {
            this.do_saving();
        }
    }

    public String do_saving() throws Exception {
        db_connect conn = new db_connect();
        conn.connection=conn.connect();
        String query = "INSERT INTO USERS (firstname,surname,username,password) VALUES ('" + this.getFirstname() + "','" + this.getSurname()+ "','"
                + this.getUsername() + "','" + this.getPassword() + "')";
        int num = conn.stmt.executeUpdate(query);

            return "index.xhtml";
        
    }

    public String give_alert() {
        //hata yazdır buraya
        return "index.xhtml";
    }
    
     public String do_it() {
        //başarılı uyarı yazdır buraya
        return "index.xhtml";
    }
}
