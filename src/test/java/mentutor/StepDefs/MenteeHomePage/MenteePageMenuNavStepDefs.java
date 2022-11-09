package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.MenteePage;

public class MenteePageMenuNavStepDefs {

    MenteePage mentee;

    @Then("All menu of mentee home page is displayed")
    public void allMenuOfMenteeHomePageIsDisplayed() {
        mentee.allNavMenuDisplayed();
    }

    @When("User click nav option {} on Mentee Page")
    public void userClickOptionOption(String navMenu) {
        mentee.clickNavMenu(navMenu);
    }

    @Then("User redirected to Mentee page {}")
    public void userRedirectedToOptionsPage(String navMenu) {
        mentee.redirectTo(navMenu);
    }
}
