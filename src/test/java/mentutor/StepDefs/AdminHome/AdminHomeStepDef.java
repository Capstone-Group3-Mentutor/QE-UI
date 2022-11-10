package mentutor.StepDefs.AdminHome;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.AdminHomePage;
import org.junit.jupiter.api.Assertions;

import static mentutor.Page.AdminHomePage.*;

public class AdminHomeStepDef extends UserInteractions {

    AdminHomePage admin;

    @And("User click nav option {} on Admin Page")
    public void userClickNavOptionOnAdminPage(String page) {
        admin.clickNavPage(page);
    }

    @Then("Admin Home Page Title should be {}")
    public void adminHomePageTitleShouldBeHelloAdmin(String title) {
        Assertions.assertEquals(title, getElementText(ADMIN_HOME_PAGE_TITLE));
    }
}
