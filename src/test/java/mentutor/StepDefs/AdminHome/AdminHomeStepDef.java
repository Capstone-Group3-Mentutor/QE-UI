package mentutor.StepDefs.AdminHome;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Then("All menu of Admin home page is displayed")
    public void allMenuOfAdminHomePageIsDisplayed() {
        admin.checkNavMenuVisibility();
    }

    @When("User click nav option {} on Admin Home Page")
    public void userClickNavOptionTaskOnAdminHomePage(String navMenu) {
        admin.clickNavMenu(navMenu);
    }

    @Then("User redirected to Admin page {}")
    public void userRedirectedToAdminPageInputClass(String page) {
        admin.redirectTo(page);
    }
}
