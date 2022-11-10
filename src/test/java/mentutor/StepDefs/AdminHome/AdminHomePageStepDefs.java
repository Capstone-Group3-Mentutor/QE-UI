package mentutor.StepDefs.AdminHome;

import io.cucumber.java.en.Then;
import mentutor.Page.AdminHomePage;

public class AdminHomePageStepDefs {

    AdminHomePage admin;

    @Then("All Home Admin Page Element should be visible")
    public void allHomeAdminPageElementShouldBeVisible() {
        admin.checkAllElementVisibilityAdmin();
    }
}
