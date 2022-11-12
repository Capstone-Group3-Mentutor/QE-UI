package mentutor.StepDefs.MenteeForum;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;

import java.awt.*;
import java.io.File;

import static mentutor.Page.MenteeForumPage.*;
import static mentutor.Page.MentorForumPage.COMMENT_BAR_2;
import static mentutor.Page.MentorForumPage.SEND_COMMENT_2;

public class MenteeForumStepDefs extends UserInteractions {

    private String pathFile = System.getProperty("user.dir") + File.separator + "src/test/resources/features/menteeForum/tasks-file.pdf";

    @When("Mentee create a post {string}")
    public void menteeCreateAPost(String post) throws AWTException {
        inputTextTo(post, POST_BAR);
        uploadFile(UPLOAD_FILE_BTN, pathFile);
        clickOnElement(SEND_POST_BTN);
    }

    @Then("Post {string} created")
    public void postCreated(String post) {
        isMessageDisplayed(post);
    }

    @When("Mentee create a post {string} without file attachment")
    public void menteeCreateAPostWithoutFileAttachment(String post) throws AWTException {
        inputTextTo(post, POST_BAR);
        uploadFile(UPLOAD_FILE_BTN, pathFile);
        clickOnElement(SEND_POST_BTN);
    }

    @When("Mentee create a comment {string}")
    public void menteeCreateAComment(String comment) {
        inputTextTo(comment, COMMENT_BAR_2);
        clickOnElement(SEND_COMMENT_2);
    }
}
