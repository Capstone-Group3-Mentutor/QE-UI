package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.MenteePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.serenitybdd.core.Serenity.getDriver;

public class MenteePageMenuNavStepDefs extends UserInteractions {

    MenteePage mentee;

    @Then("All menu of mentee home page is displayed")
    public void allMenuOfMenteeHomePageIsDisplayed() {
        mentee.allNavMenuDisplayed();
    }

    @When("User click nav option {} on Mentee Page")
    public void userClickOptionOption(String navMenu) {
        userWaiting().until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://mentutor.vercel.app/")));
        Assertions.assertNotEquals("https://mentutor.vercel.app/", getDriver().getCurrentUrl());
        mentee.clickNavMenu(navMenu);
    }

    @Then("User redirected to Mentee page {}")
    public void userRedirectedToOptionsPage(String navMenu) {
        mentee.redirectTo(navMenu);
    }
}
