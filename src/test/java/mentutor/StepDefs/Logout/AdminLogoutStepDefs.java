package mentutor.StepDefs.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.AdminPage;

import static mentutor.Page.AdminPage.*;
import static mentutor.model.PageNavigation.ADMIN_HOME_URL;
import static mentutor.model.PageNavigation.LOGIN_URL;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertEquals;

public class AdminLogoutStepDefs {

    AdminPage admin;

    @When("User click logout menu")
    public void userClickLogoutMenu() {
        admin.clickElement(LOGOUT_BUTTON);
        admin.isElementVisible(LOGOUT_CONFIRMATION);
    }

    @And("User click confirm logout")
    public void userClickConfirmLogout() {
        admin.clickElement(CONFIRM_LOGOUT);
    }

    @Then("User is logged out")
    public void userIsLoggedOut() {
        assertEquals(LOGIN_URL, getDriver().getCurrentUrl());
    }

    @And("User click cancel logout")
    public void userClickCancelLogout() {
        admin.clickElement(CANCEL_LOGOUT);
    }

    @Then("User is not logged out")
    public void userIsNotLoggedOut() {
        assertEquals(ADMIN_HOME_URL, getDriver().getCurrentUrl());
        admin.clickElement(HOME_NAV_BAR);
    }
}
