package mentutor.model;

import static mentutor.model.PageNavigation.*;

public enum Roles {
    Admin("admin.mentutor@gmail.com", "Admin123$", ADMIN_HOME_URL),
    Mentor("anggalagi@gmail.com", "Angga123$", MENTOR_HOME_TITLE),
    Mentee("chusaini.mentee@gmail.com", "Fakhri123$", MENTEE_HOME_TITLE);

    private final String username;
    private final String password;
    private final String pageURL;

    Roles(String username, String password, String pageURL){
        this.username = username;
        this.password = password;
        this.pageURL = pageURL;
    }

    public String username(){
        return username;
    }

    public String password(){
        return password;
    }
    public String pageURL(){
        return pageURL;}
}
