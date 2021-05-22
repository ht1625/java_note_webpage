
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.validator.internal.util.logging.Messages;

@ManagedBean
@SessionScoped
//burası genel not almada silme ve update için oluşturduğum m class
public class sil_duzenle implements Serializable {

    private data_genel upd_note;

    public data_genel getUpd_note() {
        return upd_note;
    }

    public void setUpd_note(data_genel upd_note) {
        this.upd_note = upd_note;
    }

    public String sil_note_genel(int note_id) throws Exception {
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query = "DELETE FROM GENEL_NOT WHERE note_id = " + note_id;
        int num = conn.stmt.executeUpdate(query);
        return "show_notes.xhtml";
    }

    public String upd_note_genel(int note_id, String title, String content) {

        this.upd_note = new data_genel();
        this.upd_note.setNote_id(note_id);
        this.upd_note.setTitle(title);
        this.upd_note.setContent(content);
        return "edit_genelnot.xhtml";
    }

    public String do_upd_genel() throws Exception {
        db_connect conn = new db_connect();
        conn.connection = conn.connect();
        String query = "UPDATE GENEL_NOT SET title_not='" + this.upd_note.getTitle() + "' WHERE note_id=" + this.upd_note.getNote_id();
        int num = conn.stmt.executeUpdate(query);
        String query1 = "UPDATE GENEL_NOT SET content_not='" + this.upd_note.getContent() + "' WHERE note_id=" + this.upd_note.getNote_id();
        int num1 = conn.stmt.executeUpdate(query1);
        return "show_notes.xhtml";
    }

    public sil_duzenle() {
    }
}
