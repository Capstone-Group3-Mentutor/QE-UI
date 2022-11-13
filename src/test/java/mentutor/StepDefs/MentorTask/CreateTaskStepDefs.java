package mentutor.StepDefs.MentorTask;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

import static mentutor.Page.MentorTaskPage.*;

public class CreateTaskStepDefs extends UserInteractions {

    Lorem lorem = LoremIpsum.getInstance();
    private String attachmentPath = foolProofPath("src/test/resources/features/mentorTask/sample_submission.pdf");
    private String imagePath = foolProofPath("src/test/resources/features/mentorTask/serenity-logo.png");

    @When("User create a task {string} with attachment")
    public void userCreateATaskWithAttachment(String taskTitle) throws AWTException {
        inputTextTo(taskTitle, TASK_TITLE);
        inputTextTo(lorem.getParagraphs(1,2), TASK_DESC);
        inputTextTo("2022-12-29", TASK_DUE_DATE);
        uploadAttachment(attachmentPath, TASK_ATTACH_BTN);
        uploadAttachment(imagePath, TASK_IMAGES_BTN);
        clickOnElement(TASK_ADD_BTN);
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(TASK_CONFIRM_BTN));
        clickOnElement(TASK_CONFIRM_BTN);
    }

    @Then("Task {string} created")
    public void taskIsCreated(String taskTitle) {
        isMessageDisplayed(taskTitle);
    }

    @When("User create a task {string} without attachment")
    public void userCreateATaskWithoutAttachment(String taskTitle) {
        inputTextTo(taskTitle, TASK_TITLE);
        inputTextTo(lorem.getParagraphs(1,2), TASK_DESC);
        inputTextTo("2022-12-29", TASK_DUE_DATE);
        clickOnElement(TASK_ADD_BTN);
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(TASK_CONFIRM_BTN));
        clickOnElement(TASK_CONFIRM_BTN);
    }
}
