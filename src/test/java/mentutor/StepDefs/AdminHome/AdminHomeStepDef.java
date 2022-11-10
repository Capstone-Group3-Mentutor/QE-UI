package mentutor.StepDefs.AdminHome;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.AdminHomePage;

import static mentutor.Page.AdminHomePage.*;
import static org.junit.jupiter.api.Assertions.*;

public class AdminHomeStepDef extends UserInteractions {

    AdminHomePage admin;

    @And("User click nav option {} on Admin Page")
    public void userClickNavOptionOnAdminPage(String page) {
        admin.clickNavPage(page);
    }

    @Then("Admin Home Page Title should be {}")
    public void adminHomePageTitleShouldBeHelloAdmin(String title) {
        assertEquals(title, getElementText(ADMIN_HOME_PAGE_TITLE));
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

    @And("User can see Modal Edit User element")
    public void userCanSeeModalEditUserElement() {
        admin.checkModalElementVisibility();
    }

    @When("User input {} on Name FIeld")
    public void userInputValidNameOnNameFIeld(String name) {
        inputTextTo(name, EDIT_USER_MODAL_NAME);
    }

    @Then("{} should be inputted")
    public void alphabetShouldBeInputted(String name) {
        assertEquals(name, getElementText(EDIT_USER_MODAL_NAME));
    }

    @And("{} shouldn't be inputted")
    public void shouldNotBeInputted(String name) {
        assertNotEquals(name, getElementText(EDIT_USER_MODAL_NAME));
    }

    @When("User input {} Email")
    public void userInputEmail(String email) {
        inputTextTo(email, EDIT_USER_MODAL_EMAIL);
    }

    @Then("Email {} inputted")
    public void emailCorrectEmailGmailComInputted(String email) {
        assertNotEquals(email, getElementText(EDIT_USER_MODAL_EMAIL));
    }

    @And("User click Dropdown Button on Modal")
    public void userClickDropdownButtonOnModal() {
        clickOnElement(EDIT_USER_MODAL_CLASS_DROPDOWN);
    }

    @And("Show dropdown content")
    public void showDropdownContent() {
        checkElementIsSelected(EDIT_USER_MODAL_CLASS_DROPDOWN);
    }

    @When("User select class {}")
    public void userSelectClass(String classSelected) {
        selectTextFromDropdown(classSelected, EDIT_USER_MODAL_CLASS_DROPDOWN);
    }

    @Then("{} class should be selected")
    public void frontEndClassShouldBeSelected(String classSelected) {
        assertEquals(classSelected, getElementText(EDIT_USER_MODAL_CLASS_DROPDOWN));
    }
}
