package mentutor.StepDefs.EditProfileMentee;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;

import java.awt.*;
import java.io.File;

import static mentutor.Page.MenteeProfilePage.*;
import static org.junit.jupiter.api.Assertions.*;

public class SubmitButtonStepDefs extends UserInteractions {

    Lorem lorem = LoremIpsum.getInstance();

    private String editName = lorem.getName();
    private String initialName = "Malinda Stokes";
    private String initialEmail = "mas.icang@gmail.com";
    private String pathToEditPics = System.getProperty("user.dir") + File.separator + "src/test/resources/features/editUserProfileByMentee/avatar.png";
    private String pathToInitialPics = System.getProperty("user.dir") + File.separator + "src/test/resources/features/editUserProfileByMentee/defaultAvatar.png";
    private static String PIC_ADDRESS;

    @After
    public void revertDefault() throws AWTException {
        clickOnElement(EDIT_USER_MENTEE);
        inputTextTo(initialName, MENTEE_FULLNAME);
        inputTextTo(initialEmail, MENTEE_EMAIL);
        uploadFile(UPLOAD_BUTTON, pathToInitialPics);
        clickOnElement(BTN_SUBMIT_MENTEE);
//        clickOnElement(BTN_CONFIRM);
    }

    @And("User click edit user icon")
    public void userClickEditUserIcon() {
        clickOnElement(EDIT_USER_MENTEE);
    }

    @When("Mentee edit user with valid data")
    public void menteeEditUserWithValidData() throws AWTException {
        inputTextTo(editName, MENTEE_FULLNAME);
        uploadFile(UPLOAD_BUTTON, pathToEditPics);
        clickOnElement(BTN_SUBMIT_MENTEE);
        PIC_ADDRESS = getElementValue(PROFILE_PICTURE, "src");
    }

    @Then("User edited")
    public void userEdited() {
        clickOnElement(BTN_CONFIRM);
        clickOnElement(BTN_CLOSE);
        checkElementVisibility(PROFILE_USER_NAME);

        //Check name edited
        assertEquals(editName, getElementText(PROFILE_USER_NAME));

        //Check File uploaded
        assertEquals(PIC_ADDRESS, getElementValue(PROFILE_PICTURE, "src"));
    }

    @When("Mentee edit user with invalid data")
    public void menteeEditUserWithInvalidData() throws AWTException {
        inputTextTo("not.an.email", MENTEE_EMAIL);
//        uploadFile(UPLOAD_BUTTON, pathToEditPics);
        clickOnElement(BTN_SUBMIT_MENTEE);
        clickOnElement(BTN_CLOSE);
    }
}
