package mentutor.model;

import static mentutor.model.PageNav.*;

public enum Roles {
    Admin("standard_user", "secret_sauce", ADMIN_HOME_TITLE),
    Mentor("locked_out_user", "secret_sauce", MENTOR_HOME_TITLE),
    Mentee("problem_user", "secret_sauce", MENTEE_HOME_TITLE);

    private final String username;
    private final String password;
    private final String pageTitle;

    Roles(String username, String password, String pageTitle){
        this.username = username;
        this.password = password;
        this.pageTitle = pageTitle;
    }

    public String username(){
        return username;
    }

    public String password(){
        return password;
    }
    public String pageTitle(){
        return pageTitle;}
}
