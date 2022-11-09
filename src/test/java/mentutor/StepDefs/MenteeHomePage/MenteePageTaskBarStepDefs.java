package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.MenteeTaskPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.MenteeTaskPage.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.*;

public class MenteePageTaskBarStepDefs {

    MenteeTaskPage menteeTask;

    @When("There is due task")
    public void thereIsDueTask() {
        assertTrue(menteeTask.thereIsDueTask());
    }

    @Then("User can see Task Bar with detailed task")
    public void userCanSeeTaskBarWithDetailedTask() {
        menteeTask.taskDetailAvailable();
    }

    @But("There is no due task")
    public void thereIsNoDueTask() {
        assertFalse(menteeTask.thereIsDueTask());
    }

    @Then("User can see Task Bar title is Your Task")
    public void userCanSeeTaskBarTitleIsYourTask() {
        assertEquals("Your Task", menteeTask.getElementText(MENTEE_TASK_TITLE));
    }

    @Then("User can see Task title")
    public void userCanSeeTaskTitle() {
        menteeTask.elementIsVisible(MENTEE_TASK_TITLE);
    }

    @Then("User can see Task order")
    public void userCanSeeTaskOrder() {
        menteeTask.elementIsVisible(MENTEE_DETAIL_TASK_DESC);
    }

    @Then("User can see due date")
    public void userCanSeeDueDate() {
        menteeTask.elementIsVisible(MENTEE_DETAIL_TASK_DUE_DATE);
    }


    @Then("User can see Task File")
    public void userCanSeeTaskFile() {
        menteeTask.elementIsVisible(MENTEE_DETAIL_TASK_FILE_PREVIEW);
    }

    @And("User click that task file")
    public void userClickThatTaskFile() {
        menteeTask.clickElement(MENTEE_DETAIL_TASK_FILE_PREVIEW);
    }

    @Then("User can see submit button")
    public void userCanSeeSubmitButton() {
        menteeTask.elementIsVisible(MENTEE_DETAIL_TASK_SUBMIT_BTN);
    }

    @And("User click submit your task file")
    public void userClickSubmitYourTaskFile() {
        menteeTask.clickElement(MENTEE_DETAIL_TASK_SUBMIT_BTN);
    }

    @Then("User navigate to submit task modal")
    public void userNavigateToSubmitTaskModal() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MENTEE_SUBMIT_TASK_MODAL));
    }
}
