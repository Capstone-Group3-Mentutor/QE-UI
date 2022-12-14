package mentutor.StepDefs.ClassManagementPage;

import com.vladsch.flexmark.test.Strings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.AdminHomePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.AdminClassPage.*;
import static mentutor.Page.AdminHomePage.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class AddClassStepDefs extends UserInteractions {

    AdminHomePage admin;
    @And("Admin already on add Class Page")
    public void adminAlreadyOnAddClassPage() {
        admin.clickElement(ADMIN_CLASS_NAV_BAR);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://mentutor.vercel.app/inputclass"));
//        getDriver().get(ADMIN_INPUT_CLASS);
    }

    @When("Admin click class name field")
    public void adminClickClassNameField() {
        admin.clickElement(ADMIN_ADD_CLASS_NAME);
    }

    @Then("class field can be clicked")
    public void classFieldCanBeClicked() {
        admin.isElementInteractable(ADMIN_ADD_CLASS_NAME);
    }

    @When("Admin input {string} on add class field")
    public void adminInputOnAddClassField(String nameOfClass) {
        admin.inputTextTo(nameOfClass, ADMIN_ADD_CLASS_NAME);
        clickOnElement(BUTTON_ADD_CLASS);
    }

    @When("Admin input {int} on add class field")
    public void adminInputNumericOnAddClassField(int nameOfClass) {
        String text = Integer.toString(nameOfClass);
        admin.inputTextTo(text, ADMIN_ADD_CLASS_NAME);
    }

    @When("Admin input less than minimum char allowed on add class field")
    public void adminInputLessThanMinimumCharAllowedOnAddClassField() {
        admin.inputTextTo("xxxx", ADMIN_ADD_CLASS_NAME);
        clickOnElement(BUTTON_ADD_CLASS);
    }

    @When("Admin input exceed maximum char allowed on add class field")
    public void adminInputExceedMaximumCharAllowedOnAddClassField() {
        String longName = Strings.repeat("a", 41);
        admin.inputTextTo(longName, ADMIN_ADD_CLASS_NAME);
        clickOnElement(BUTTON_ADD_CLASS);
    }

    @Then("{string} should be inputted")
    public void shouldBeInputted(String text) {
        String actualText = admin.getPlaceHolderText(ADMIN_ADD_CLASS_NAME);
        Assertions.assertEquals(text, actualText);
    }

    @Then("{string} not be inputted")
    public void shouldnoTBeInputted(String text) {
        isMessageDisplayed(text);
    }

    @Then("Data should be rejected")
    public void dataShouldBeRejected() {
        String actualText = admin.getPlaceHolderText(ADMIN_ADD_CLASS_NAME);
        Assertions.assertEquals("", actualText);
    }

    @And("User add {} class")
    public void userAddNewClassToBeDeleted(String className) {
        Boolean isPresent = getDriver().findElements(By.xpath("//*[contains(text(), '"+ className +"')]")).size() > 0;
        if (!isPresent){
            inputTextTo(className, ADMIN_ADD_CLASS_NAME);
            clickOnElement(BUTTON_ADD_CLASS);
            clickOnElement(By.cssSelector(".swal2-confirm"));
        }

    }
}
