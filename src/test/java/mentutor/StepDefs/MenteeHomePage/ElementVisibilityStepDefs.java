package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.Then;
import mentutor.Page.MenteePage;

public class ElementVisibilityStepDefs {

    MenteePage mentee;

    @Then("All Home Mentee Page should be visible")
    public void allHomeMenteePageShouldBeVisible() {
        mentee.checkAllElementVisible();
    }
}
