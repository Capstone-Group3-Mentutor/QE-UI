package mentutor.StepDefs.MentorForum;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static mentutor.Page.MentorForumPage.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;

public class MentorForumStepDefs extends UserInteractions {


    @When("Mentor create a comment {}")
    public void createAComment(String comment) {
        inputTextTo(comment, COMMENT_BAR_2);
//        clickOnElement(SEND_COMMENT_2);
        new Actions(getDriver())
                .sendKeys(getDriver().findElement(COMMENT_BAR_2), comment)
                .sendKeys(Keys.ENTER)
                .perform();
    }

    @Then("Comment {} created")
    public void commentCreated(String comment) {
        isMessageDisplayed(comment);
    }

    @When("User click view All Comments")
    public void userClickViewAllComments() {
        clickOnElement(VIEW_MORE_COMMENT_2);
    }

    @Then("More comment loaded")
    public void moreCommentLoaded() {
//        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(VIEW_POST_2_COMMENT));
        isMessageDisplayed("Sip deh");
    }

    @When("User click view Hide Comment")
    public void userClickViewHideComment() {
        clickOnElement(HIDE_ALL_COMMENT_2);
    }

    @Then("All comment is hidden")
    public void allCommentIsHidden() {
        userWaiting().until(not(ExpectedConditions.visibilityOfElementLocated(VIEW_MORE_COMMENT_2)));
    }
}
