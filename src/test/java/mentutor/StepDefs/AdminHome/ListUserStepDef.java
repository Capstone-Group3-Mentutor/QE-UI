package mentutor.StepDefs.AdminHome;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.AdminHomePage;

import static mentutor.Page.AdminHomePage.*;
import static mentutor.model.PageNavigation.ADMIN_HOME_URL;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListUserStepDef extends UserInteractions {

    AdminHomePage admin;

    @When("User on Admin home")
    public void userOnAdminHome() {
        assertEquals(ADMIN_HOME_URL, getDriver().getCurrentUrl());
    }

    @Then("User can see List User with detailed user profile")
    public void userCanSeeListUserWithDetailedUserProfile() {
        checkElementVisibility(LIST_USER_FIELD);
    }

    @But("There is no list users")
    public boolean thereIsNoListUsers() {
        return elementIsNotVisible(LIST_USER_NO);
    }

    @Then("User can see Task Bar title is {}")
    public void userCanSeeTaskBarTitleIsListMentorMentee(String title) {
        assertEquals(title, getElementText(LIST_USER_FIELD_TITLE));
    }

    @When("There is list user")
    public void thereIsListUser() {
        userFindElement(LIST_USER_NO);
    }

    @Then("User can see List of users")
    public void userCanSeeListOfUsers() {
        admin.listUserAvailable();
    }

    @Then("User can see Kebab Button")
    public void userCanSeeKebabButton() {
        userFindElement(LIST_USER_KEBAB);
    }

    @And("User click Kebab Button")
    public void userClickKebabButton() {
        clickOnElement(USER_DELETED_KEBAB);
    }

    @Then("Options displayed")
    public void optionsDisplayed() {
        checkElementVisibility(USER_DELETED_EDIT);
        checkElementVisibility(USER_DELETED_DELETE);
    }

    @And("User click Delete Button")
    public void userClickDeleteButton() {
        clickOnElement(USER_DELETED_DELETE);
    }

    @And("User click cancel")
    public void userClickCancel() {
        clickOnElement(CANCEL_DELETE_USER);
    }

    @And("User click Yes, delete!")
    public void userClickYesDelete() {
        clickOnElement(CONFIRM_DELETE_USER);
    }

    @And("User click Edit Button")
    public void userClickEditButton() {
        clickOnElement(USER_DELETED_EDIT);
    }

    @Then("Edit User modal appeared")
    public void editUserModalAppeared() {
        checkElementVisibility(EDIT_USER_MODAL);
    }
}
