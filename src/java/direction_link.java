
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped

public class direction_link implements Serializable {

    direction_link() {}

    public String back_homepage() {
        return "Home.xhtml";
    }

    public String back_genelnot() {
        return "genel_not.xhtml";
    }

    public String back_todolist() {
        return "todo_list.xhtml";
    }

    public String back_haftalık() {
        return "haftalık.xhtml";
    }

    public String shownote_genel() {
        //burdan bilgiyi alıp gidecek sayfaya
        return "show_notes.xhtml";
    }

    public String shownote_list() {
        //burdan bilgiyi alıp gidecek sayfaya
        return "show_notes.xhtml";
    }

    public String shownote_haftalık() {
        //burdan bilgiyi alıp gidecek sayfaya
        return "show_notes.xhtml";
    }

    public String shownote_cop() {
        //burdan bilgiyi alıp gidecek sayfaya
        return "show_notes.xhtml";
    }
}
