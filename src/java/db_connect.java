
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db_connect {

    public String username;
    public String password;
    static Connection cont;
    static Statement stmt;

    public void setUserName(String username) {
        this.username = username;
    }

    public void setPass(String password) {
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public String getPass() {
        return password;
    }

    public db_connect() throws Exception {
        baglantiAc();
    }

    public static void baglantiAc() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        cont = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/note;create=true",
                "eha", "eha123");
        stmt = cont.createStatement();
    }

    public static void again() throws Exception {
        cont.close();
        baglantiAc();
    }

}
