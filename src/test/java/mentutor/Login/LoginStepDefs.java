package mentutor.Login;


import com.vladsch.flexmark.test.Strings;
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

import static mentutor.Admin.AdminPage.SUCCESS_LOGIN;
import static mentutor.Login.LoginPage.FAILED_LOGIN;
import static mentutor.model.PageNavigation.LOGIN_URL;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

    @When("User login with blank email")
    public void userLoginWithBlankEmail() {
        login.with("", "Admin123$");
    }

    @When("User login with blank password")
    public void userLoginWithBlankPassword() {
        login.with("admin.mentutor@gmail.com", "");
    }

    @When("User login with blank email and blank password")
    public void userLoginWithBlankEmailAndBlankPassword() {
        login.with("", "");
    }

    @When("User login without email suffix")
    public void userLoginWithoutEmailSuffix() {
        login.with("admin.mentutor", "Admin123$");
    }


    @When("User login with {int} character password")
    public void userLoginWithCharacterPassword(int passCharCount) {
        String password = Strings.repeat("a", passCharCount);
        login.with("admin.mentutor@gmail.com", password);
    }

    @When("User login with {int} char length password")
    public void userLoginWithCharLengthPassword(int passCharCount) {
        userLoginWithCharacterPassword(passCharCount);
    }

    @When("User login with uppercase email")
    public void userLoginWithUppercaseEmail() {
        String email = "admin.mentutor@gmail.com".toUpperCase();
        login.with(email, "Admin123$");
    }

    @When("User login with uppercase password")
    public void userLoginWithUppercasePassword() {
        String password = "Admin123$".toUpperCase();
        login.with("admin.mentutor@gmail.com", password);
    }
}
