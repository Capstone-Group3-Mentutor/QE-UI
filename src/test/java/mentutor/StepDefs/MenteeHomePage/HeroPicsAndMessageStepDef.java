package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.Then;
import mentutor.Page.MenteePage;

import static mentutor.Page.MenteePage.*;

public class HeroPicsAndMessageStepDef {

    MenteePage mentee;

    @Then("User can see Hero Pics and Message")
    public void userCanSeeHeroPicsAndMessage() {
        mentee.elementDisplayed(HERO_PICS);
    }
}
