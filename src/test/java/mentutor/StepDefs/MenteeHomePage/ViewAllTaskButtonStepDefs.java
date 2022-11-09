package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.MenteePage;
import mentutor.Page.MenteeTaskPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.MenteePage.*;
import static mentutor.Page.MenteeTaskPage.*;
import static mentutor.model.PageNavigation.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class ViewAllTaskButtonStepDefs {

    MenteePage mentee;
    MenteeTaskPage menteeTask;

    @When("User click view all task button")
    public void userClickViewAllTaskButton() {
        mentee.clickOn(VIEW_ALL_TASK_BTN);
    }

    @Then("User redirected to Task Page")
    public void userRedirectedToTaskPage() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(MENTEE_TASK_PAGE));
    }

    @And("All user available task is shown")
    public void allUserAvailableTaskIsShown() {
        menteeTask.isElementVisible(MENTEE_TASK_TITLE);
    }

    @When("User go to Task Page by directly typing on browser")
    public void userGoToTaskPageByDirectlyTypingOnBrowser() {
        getDriver().get(MENTEE_TASK_PAGE);
    }

    @Then("view all task button is displayed")
    public void viewAllTaskButtonIsDisplayed() {
        menteeTask.isElementVisible(VIEW_ALL_TASK_BTN);
    }
}
