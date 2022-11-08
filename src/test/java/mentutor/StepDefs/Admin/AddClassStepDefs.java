package mentutor.StepDefs.Admin;

import com.vladsch.flexmark.test.Strings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Page.AdminPage;

import static mentutor.Page.AdminPage.*;
import static mentutor.model.PageNavigation.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class AddClassStepDefs {

    AdminPage admin;
    @And("Admin already on add Class Page")
    public void adminAlreadyOnAddClassPage() {
        getDriver().get(ADMIN_INPUT_CLASS);
    }

    @When("Admin click add class field")
    public void adminClickAddClassField() {
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
}
