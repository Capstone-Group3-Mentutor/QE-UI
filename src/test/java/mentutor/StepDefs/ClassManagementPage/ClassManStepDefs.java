package mentutor.StepDefs.ClassManagementPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static mentutor.Page.AdminClassPage.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ClassManStepDefs extends UserInteractions {

    @Given("Admin already click kebab button on Kelas Testing")
    public void adminAlreadyClickKebabButtonOnKelasTesting() {
        clickOnElement(ADMIN_CLASS_KEBAB_TESTING);
    }

    @And("Admin choose edit button")
    public void adminChooseEditButton() {
        clickOnElement(CLASS_TESTING_EDIT);
    }

    @When("Admin click edit class name field")
    public void adminClickEditClassNameField() {
        clickOnElement(MODAL_EDIT_CLASSNAME);
    }

    @Then("Edit class field can be clicked")
    public void editClassFieldCanBeClicked() {
        checkElementIsSelected(MODAL_EDIT_CLASSNAME);
    }

    @When("Admin click status class field")
    public void adminClickStatusClassField() {
        clickOnElement(MODAL_EDIT_STATUS);
    }

    @Then("Edit class field is selected")
    public void editClassFieldIsSelected() {
        checkElementIsSelected(MODAL_EDIT_STATUS);
    }

    @And("Admin select class status {}")
    public void adminSelectClassStatus(String status) {
        Select classStatus = new Select(userFindElement(MODAL_EDIT_STATUS));

        classStatus.selectByValue(status);
    }

    @And("Admin click submit button")
    public void adminClickSubmitButton() {
        clickOnElement(MODAL_EDIT_CLASS_SUBMIT);
    }

    @Then("Class Status of Kelas Testing is {}")
    public void classStatusOfKelasTestingIsNon_active(String classStatus) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(CLASS_TESTING_STATUS, classStatus));
        assertEquals(classStatus, getElementText(CLASS_TESTING_STATUS));
    }

    @And("Admin click OK on modal success Edit")
    public void adminClickOKOnModalSuccessEdit() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(OK_EDITING_CLASS_BTN));
    }

    @When("Admin click x button")
    public void adminClickXButton() {
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(MODAL_EDIT_CLASS_CLOSE_BTN));
        clickOnElement(MODAL_EDIT_CLASS_CLOSE_BTN);
    }

    @Then("Admin go back to add class page")
    public void adminGoBackToAddClassPage() {
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(EDIT_CLASS_TITLE));
    }

    @Given("Admin already click kebab button on Kelas Edit")
    public void adminAlreadyClickKebabButtonOnKelasEdit() {
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(ADMIN_CLASS_KEBAB_EDITED));
        clickOnElement(ADMIN_CLASS_KEBAB_EDITED);
    }

    @And("Admin choose edit button on Kelas Edited")
    public void adminChooseEditButtonOnKelasEdited() {
        clickOnElement(EDIT_CLASS_EDITED);
    }

    @When("Admin input {} on edit class field")
    public void adminInputValidClassnameOnEditClassField(String className) {
        inputTextTo(className, MODAL_EDIT_CLASSNAME);
        clickOnElement(MODAL_EDIT_CLASS_SUBMIT);
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(OK_EDITING_CLASS_BTN));
    }

    @Then("{} Class is created")
    public void validClassnameClassIsCreated(String className) {
        getDriver().get("https://mentutor.vercel.app/inputclass");
        assertEquals(className, getElementText(CLASS_EDITED_NAME));
    }

    @And("Class Status of Kelas Edit is {}")
    public void classStatusOfKelasEditIs(String classStatus) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(CLASS_EDIT_STATUS, classStatus));
        assertEquals(classStatus, getElementText(CLASS_EDIT_STATUS));
    }

    @Then("{} Class is not created")
    public void classIsNotCreated(String className) {
        getDriver().get("https://mentutor.vercel.app/inputclass");
        assertNotEquals(className, getElementText(CLASS_EDITED_NAME));
    }
}
