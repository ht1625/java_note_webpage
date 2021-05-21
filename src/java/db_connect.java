
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class db_connect {

    final private String db_url = "jdbc:derby://localhost:1527/note";
    //final private String class_url = "org.apache.derby.jdbc.ClientDriver";
    final private String user = "eha";
    final private String pass = "eha123";
    public Connection connection = null;
    public Statement stmt;

    public Connection connect() {

        try {
            // Class.forName(class_url).newInstance();;
            connection = DriverManager.getConnection(db_url, user, pass);
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
