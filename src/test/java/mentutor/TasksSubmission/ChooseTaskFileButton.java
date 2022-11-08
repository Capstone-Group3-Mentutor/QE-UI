package mentutor.TasksSubmission;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import mentutor.Mentee.MenteePage;

import static mentutor.Mentee.MenteePage.TASK_PAGE;
import static mentutor.TasksSubmission.TaskSubmissionPage.CHOOSE_TASK_BUTTON;

public class ChooseTaskFileButton {

    TaskSubmissionPage tasksubmit;
    MenteePage mentee;
    @And("User want to submit task")
    public void userWantToSubmitTask() {
        mentee.navTo(TASK_PAGE);
    }

    @When("User Click Choose Task File Button")
    public void userClickChooseTaskFileButton() {
        tasksubmit.click(CHOOSE_TASK_BUTTON);
    }

    @And("User upload File")
    public void userUploadFile() {
        tasksubmit.uploadFile("src/test/resources/features/tasksSubmission/Selenium_Cheat_Sheet_Locator.pdf");
    }


}
