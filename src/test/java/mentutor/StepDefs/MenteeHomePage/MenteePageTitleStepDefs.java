package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.Then;
import mentutor.Page.MenteePage;

public class MenteePageTitleStepDefs {

    MenteePage mentee;

    @Then("Then Mentee Home Page Title should be {}")
    public void thenMenteeHomePageTitleShouldBe(String message) {
        mentee.pageTitleShouldBe(message);
    }
}
