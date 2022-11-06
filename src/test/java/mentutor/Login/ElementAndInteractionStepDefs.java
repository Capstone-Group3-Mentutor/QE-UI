package mentutor.Login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class ElementAndInteractionStepDefs {
    LoginPage login;
    @When("User wait until all element loaded")
    public void userCheckAllAvailableElement() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Then("All Login Page element should be visible")
    public void allLoginPageElementShouldBeVisible() {
        login.checkAllElementVisibility();
    }

    @When("User refresh the browser")
    public void userRefreshTheBrowser() {
        getDriver().navigate().refresh();
    }

    @When("User click {} field")
    public void userClickElementField(String element) {
        login.clickElement(element); //TODO if possible create enum for further improvement
    }

    @Then("The Cursor is on {} field")
    public void cursorIsOnField(String element) {
        login.isElementInteractable(element);
    }

    @Then("The element {} is responding")
    public void theElementIsResponding(String element) {
        cursorIsOnField(element);
    }

    @When("User press TAB button")
    public void userPressTABButton() {
        Actions user = new Actions(getDriver());
        user.sendKeys(Keys.TAB).perform();
    }

    @When("User press SHIFT+TAB button")
    public void userPressSHIFTTABButton() {
        Actions user = new Actions(getDriver());
        user
                .keyDown(Keys.LEFT_SHIFT)
                .sendKeys(Keys.TAB)
                .keyUp(Keys.LEFT_SHIFT)
                .perform();
    }
}
