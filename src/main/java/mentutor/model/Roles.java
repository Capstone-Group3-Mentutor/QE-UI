package mentutor.model;

import static mentutor.model.PageNavigation.*;

public enum Roles {
    Admin("admin.mentutor@gmail.com", "Admin123$", ADMIN_HOME_URL),
    Mentee("tuti.tutut@gmail.com", "Mentee123$", MENTEE_HOME_PAGE),
    Mentor("marva.cook@example.com", "Mentor123$", MENTOR_HOME_TITLE),
    EditMentee("tuti.tutut@gmail.com", "Mentee123$", MENTEE_HOME_PAGE);

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
