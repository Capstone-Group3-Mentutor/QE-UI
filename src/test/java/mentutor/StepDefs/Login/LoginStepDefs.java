package mentutor.StepDefs.Login;


import com.vladsch.flexmark.test.Strings;
import io.cucumber.java.en.*;
import mentutor.Page.AdminHomePage;
import mentutor.Page.LoginPage;
import mentutor.model.Roles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.AdminHomePage.ADMIN_SUCCESS_LOGIN;
import static mentutor.Page.LoginPage.FAILED_LOGIN;
import static mentutor.model.PageNavigation.ADMIN_HOME_URL;
import static mentutor.model.PageNavigation.LOGIN_URL;
import static mentutor.model.Roles.Admin;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static mentutor.CucumberTestSuite.BASE_URL;

public class LoginStepDefs {

    LoginPage login;
    AdminHomePage admin;

    @Given("User already on Login Page")
    public void alreadyOnLoginPage(){
        login.open();
    }

    @When("User want to login as {}")
    public void userWantToLoginAs(Roles role) {
        if(getDriver().getCurrentUrl() == LOGIN_URL){
            login.as(role);
        }else{
            login.open();
            login.as(role);
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("home"));
        login.clickElement("login ok");
        wait.until(ExpectedConditions.urlToBe(role.pageURL()));

    }

    @Then("User logged in as {}")
    public void userLoggedInAs(Roles role) {
        //Wait until web is redirected
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlToBe(role.pageURL()));

        //Assert page is as expected
        assertEquals(getDriver().getCurrentUrl(), role.pageURL());

        //Assert confirmation popup is visible
        admin.isSuccessLoginPopUpDisplayed(ADMIN_SUCCESS_LOGIN);
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

    @When("User login as admin but user doesnt click Login Button")
    public void userLoginAsAdminButUserDoesntClickLoginButton() {
        login.inputUsername("admin.mentutor@gmail.com");
        login.inputPassword("Admin123$");
    }

    @When("User login with {int} char length email")
    public void userLoginWithCharLengthEmail(int charCount) {
        String longEmail = Strings.repeat("a", charCount - "@gmail.com".length()) + "@gmail.com";
        login.with(longEmail, "Admin123$");
    }


    @When("User login as admin with copy pasted {}")
    public void userLoginAsAdminWithCopyPastedString(String field) {
        login.copyPasted(field, "admin.mentutor@gmail.com");
        login.inputPassword("Admin123$");
        login.clickLoginButton();
    }

    @When("User login as Admin")
    public void userLoginAsAdmin() {
        login.inputUsername("admin.mentutor@gmail.com");
        login.inputPassword("Admin123$");
    }

    @But("User press login button multiple time")
    public void userPressLoginButtonMultipleTime() {
        login.clickLoginButton();
        login.clickLoginButton();
        login.clickLoginButton();
        login.clickLoginButton();
        login.clickLoginButton();
    }

    @When("User login as admin on Windows 1")
    public void userLoginAsAdminOnWindows() {
        login.as(Admin);
    }

    @And("User open login page on Windows 2")
    public void userOpenLoginPageOnWindows() {
        login.open();
    }

    @And("User go to Login Page")
    public void userGoToLoginPage() {
        getDriver().get(BASE_URL);
    }

    @Then("User is redirected to Admin Home Page")
    public void userIsRedirectedToAdminHomePage() {
        assertEquals(getDriver().getCurrentUrl(), ADMIN_HOME_URL);
    }

    @Given("User close the browser")
    public void userCloseTheBrowser() {
        login.quit();
    }

    @Then("User is not logged in")
    public void userIsNotLoggedIn() {
        assertEquals(getDriver().getCurrentUrl(), LOGIN_URL);
    }

    @When("User type valid password")
    public void userTypeValidPassword() {
        login.inputPassword("Admin123$");
    }

    @But("User doesnt click Login Button")
    public void userDoesntClickLoginButton() {
        login.isElementInteractable("login button");
    }


    @Then("All Critical Element is visible")
    public void allCriticalElementIsVisible() {
        login.checkAllElementVisibility();
    }

}
