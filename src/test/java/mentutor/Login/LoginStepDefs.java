package mentutor.Login;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Admin.AdminPage;
import mentutor.model.Roles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static mentutor.Admin.AdminPage.*;
import static mentutor.Login.LoginPage.*;
import static mentutor.model.PageNav.*;
import static net.serenitybdd.core.Serenity.getDriver;

import static org.junit.Assert.*;

public class LoginStepDefs {

    LoginPage login;
    AdminPage admin;

    @Given("User already on Login Page")
    public void alreadyOnLoginPage(){
        login.open();
    }

    @When("User want to login as {}")
    public void userWantToLoginAs(Roles role) {
        login.as(role);
    }

    @Then("User logged in as {}")
    public void userLoggedInAs(Roles role) {
        //Wait until web is redirected
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlToBe(role.pageURL()));

        //Assert page is as expected
        assertEquals(getDriver().getCurrentUrl(), role.pageURL());

        //Assert confirmation popup is visible
        admin.isSuccessLoginPopUpDisplayed(SUCCESS_LOGIN);
    }

    @And("Message {} appeared")
    public void messageAppeared(String message) {
        //Assert confirmation popup has correct message
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '"+ message +"')]"));
        assertNotNull(foundElements);
//        assertEquals(admin.getPopUpTitle(POP_UP_TITLE), message);
    }

    @When("User want to login with unregistered Credentials")
    public void userWantToLoginWithUnregisteredCredentials() {
        login.with("unregistered@email.com", "unregistered_pass");
    }

    @Then("User cannot login")
    public void userCannotLogin() {
        assertEquals(getDriver().getCurrentUrl(), LOGIN_URL);

        //Assert popup message appeared
        login.isFailedLoginPopUpDisplayed(FAILED_LOGIN);
    }

    @When("User want to login with valid email prefixes")
    public void userWantToLoginWithValidEmailPrefixes(DataTable credentials) throws InterruptedException {
        List<Map<String, String>> user = credentials.asMaps(String.class, String.class);
        for (Map<String, String> form : user){
            String email = form.get("email");
            String password = form.get("password");

            login.inputUsername(email);
            login.inputPassword(password);
            login.clickLoginButton();
        }
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        assertEquals(login.getTitle(), "SWAG LABS");
    }
}
