package mentutor.StepDefs.AdminHome;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mentutor.Interactions.UserInteractions;

import static org.junit.jupiter.api.Assertions.*;
import static mentutor.Page.AdminHomePage.*;

public class SubmitEditUserStepDefs extends UserInteractions {

    Lorem lorem = LoremIpsum.getInstance();

    private String NEW_NAME = lorem.getName();
    private String NEW_EMAIL = lorem.getEmail();

    @And("User edit user with valid data")
    public void userEditUserWithValidData() {
        inputTextTo(NEW_NAME, EDIT_USER_MODAL_NAME);
        inputTextTo(NEW_EMAIL, EDIT_USER_MODAL_EMAIL);
        inputTextTo("Admin123$", EDIT_USER_MODAL_PASSWORD);
        selectTextFromDropdown("Front end", EDIT_USER_MODAL_CLASS_DROPDOWN);
        clickOnElement(EDIT_USER_MODAL_BTN_SUBMIT);
    }

    @And("User data edited")
    public void userDataEdited() {
        assertEquals(NEW_NAME, getElementText(LIST_USER_NAME));
        assertEquals(NEW_EMAIL, getElementText(LIST_USER_EMAIL));
    }

    @And("User edit user with invalid data")
    public void userEditUserWithInvalidData() {
        inputTextTo("not.an.email", EDIT_USER_MODAL_EMAIL);
        clickOnElement(EDIT_USER_MODAL_BTN_SUBMIT);
    }

    @And("User data not edited")
    public void userDataNotEdited() {
        assertNotEquals("not.an.email", getElementText(LIST_USER_EMAIL));
    }

    @And("User click Confirm Edit")
    public void userClickConfirmEdit() {
        clickOnElement(CONFIRM_EDIT_USER);
    }

    @Then("Success Edit User")
    public void successEditUser() {
        assertEquals("Success Update", getElementText(SUCCESS_EDIT_USER));
    }

    @Then("Failed Update User")
    public void failedUpdateUser() {
        assertEquals("Failed Updated", getElementText(SUCCESS_EDIT_USER));
    }

    @And("User close edit modal")
    public void userCloseEditModal() {
        clickOnElement(CLOSE_EDIT_MODAL);
    }
}
