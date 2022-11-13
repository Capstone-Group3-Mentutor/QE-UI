package mentutor.StepDefs.MentorHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.MentorHomePage;

public class MentorMenuNavStepDef extends UserInteractions {

    MentorHomePage mentorHome;

    @Then("All menu of Mentor home page is displayed")
    public void allMenuOfMentorHomePageIsDisplayed() {
        mentorHome.userCheckNavVisibility();
    }

    @When("User click nav option {} on Mentor Home Page")
    public void userClickNavOptionTaskOnMentorHomePage(String page) {
        mentorHome.navigateTo(page);
    }

    @Then("User redirected to Mentor page {}")
    public void userRedirectedToMentorPageTask(String page) {
        mentorHome.isUserOnCorrectPage(page);
    }
}
