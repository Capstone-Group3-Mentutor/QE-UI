package mentutor.StepDefs.RegisterUser;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.RegisterPage;
import org.openqa.selenium.Dimension;

import static net.serenitybdd.core.Serenity.getDriver;

public class ElementVisibilityStepDef {

    RegisterPage register;

    @Then("All Element is visible in Register page")
    public void allElementIsVisibleInRegisterPage() {
        register.checkAllElementVisibility();
    }

    @When("User resize down the browser")
    public void userResizeDownTheBrowser() {
        Dimension dimension = new Dimension(360,640);
        getDriver().manage().window().setSize(dimension);
    }
}
