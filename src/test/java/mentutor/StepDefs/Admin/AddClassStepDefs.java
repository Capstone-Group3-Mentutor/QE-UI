package mentutor.StepDefs.Admin;

import com.vladsch.flexmark.test.Strings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.AdminPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.AdminPage.ADD_CLASS_NAME;
import static mentutor.Page.AdminPage.HOME_NAV_BAR;
import static net.serenitybdd.core.Serenity.getDriver;

public class AddClassStepDefs {

    AdminPage admin;
    @And("Admin already on add Class Page")
    public void adminAlreadyOnAddClassPage() {
        admin.clickElement(HOME_NAV_BAR);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://mentutor.vercel.app/inputclass"));
//        getDriver().get(ADMIN_INPUT_CLASS);
    }

    @When("Admin click class name field")
    public void adminClickClassNameField() {
        admin.clickElement(ADD_CLASS_NAME);
    }

    @Then("class field can be clicked")
    public void classFieldCanBeClicked() {
        admin.isElementInteractable(ADD_CLASS_NAME);
    }

    @When("Admin input {string} on add class field")
    public void adminInputOnAddClassField(String nameOfClass) {
        admin.inputTextTo(nameOfClass, ADD_CLASS_NAME);
    }

    @When("Admin input {int} on add class field")
    public void adminInputNumericOnAddClassField(int nameOfClass) {
        String text = Integer.toString(nameOfClass);
        admin.inputTextTo(text, ADD_CLASS_NAME);
    }

    @When("Admin input less than minimum char allowed on add class field")
    public void adminInputLessThanMinimumCharAllowedOnAddClassField() {
        admin.inputTextTo("xxxx", ADD_CLASS_NAME);
    }

    @When("Admin input exceed maximum char allowed on add class field")
    public void adminInputExceedMaximumCharAllowedOnAddClassField() {
        String longName = Strings.repeat("a", 41);
        admin.inputTextTo(longName, ADD_CLASS_NAME);
    }

    @Then("{string} should be inputted")
    public void shouldBeInputted(String text) {
        String actualText = admin.getPlaceHolderText(ADD_CLASS_NAME);
        Assertions.assertEquals(text, actualText);
    }

    @Then("{string} shouldn't be inputted")
    public void shouldnoTBeInputted(String text) {
        String actualText = admin.getPlaceHolderText(ADD_CLASS_NAME);
        Assertions.assertNotEquals(text, actualText);
    }

    @Then("Data should be rejected")
    public void dataShouldBeRejected() {
        String actualText = admin.getPlaceHolderText(ADD_CLASS_NAME);
        Assertions.assertEquals("", actualText);
    }
}
