package mentutor.StepDefs.AdminHome;

import io.cucumber.java.en.And;
import mentutor.Page.AdminHomePage;

public class AdminHomeStepDef {

    AdminHomePage admin;

    @And("User click nav option {} on Admin Page")
    public void userClickNavOptionOnAdminPage(String page) {
        admin.clickNavPage(page);
    }
}
