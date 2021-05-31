
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class updateProfile implements Serializable {
   
        
    public updateProfile() {
    }
    
    public data_profile update;

    public data_profile getUpdate() {
        return update;
    }

    public void setUpdate(data_profile update) {
        this.update = update;
    }
    
     public String update_week( String username, String phonenumber, String birthday, String email) {

        this.update = new data_profile();
        this.update.setUsername(username);
        this.update.setPhonenumber(phonenumber);
        this.update.setBirthday(birthday);
        this.update.setEmail(email);
        return "edit_profil.xhtml";
    }

    public String upd_infos() throws Exception {
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        
        String query = "UPDATE EHA.USERS SET username='" + this.update.getUsername()+ "' WHERE id = " + user_data.user.getUser_id();
        int num = conn.stmt.executeUpdate(query);
        String query3 = "UPDATE EHA.USERS SET phonenumber='" + this.update.getPhonenumber()+ "' WHERE id = " + user_data.user.getUser_id();
        int num3 = conn.stmt.executeUpdate(query3);
        String query4 = "UPDATE EHA.USERS SET birthday='" + this.update.getBirthday()+ "' WHERE id = " + user_data.user.getUser_id();
        int num4 = conn.stmt.executeUpdate(query4);
        String query5 = "UPDATE EHA.USERS SET email='" + this.update.getEmail()+ "' WHERE id = " + user_data.user.getUser_id();
        int num5 = conn.stmt.executeUpdate(query5);

        return "profil.xhtml";


   }
    

}
