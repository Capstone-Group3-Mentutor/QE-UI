package mentutor.StepDefs.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.AdminHomePage;
import mentutor.Page.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.AdminHomePage.*;
import static mentutor.model.PageNavigation.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertEquals;

public class AdminLogoutStepDefs extends UserInteractions {

    AdminHomePage admin;
    LoginPage login;

    @When("User click logout menu")
    public void userClickLogoutMenu() {
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(ADMIN_LOGOUT_BUTTON));
        admin.clickElement(ADMIN_LOGOUT_BUTTON);
    }

    @And("User click confirm logout")
    public void userClickConfirmLogout() {
        admin.clickElement(ADMIN_CONFIRM_LOGOUT);
    }

    @Then("User is logged out")
    public void userIsLoggedOut() {
        login.clickElement("login ok");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(LOGIN_URL));
    }

    @And("User click cancel logout")
    public void userClickCancelLogout() {
        admin.clickElement(ADMIN_CANCEL_LOGOUT);
    }

    @Then("User is not logged out")
    public void userIsNotLoggedOut() {
        assertEquals(ADMIN_HOME_URL, getDriver().getCurrentUrl());
        admin.clickElement(ADMIN_HOME_NAV_BAR);
    }

    @Then("User is not logged out from mentee")
    public void userIsNotLoggedOutFromMentee() {
        assertEquals(MENTEE_HOME_PAGE, getDriver().getCurrentUrl());
    }

    @Then("User is not logged out from mentor")
    public void userIsNotLoggedOutFromMentor() {
        assertEquals(MENTOR_HOME_TITLE, getDriver().getCurrentUrl());
    }
}
