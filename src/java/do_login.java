
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class do_login implements Serializable {

    String userName;

    public do_login() {
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

    public String loginn() {
        if (this.userName.equals("eha") && this.pass.equals("eha123")) {
            return "Home.xhtml";
        } else {
            return "do_login.xhtml";
        }
    }

    public String save() {

        return "do_save.xhtml";

    }

}
