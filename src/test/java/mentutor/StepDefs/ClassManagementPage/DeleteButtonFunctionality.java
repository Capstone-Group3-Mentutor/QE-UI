package mentutor.StepDefs.ClassManagementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static mentutor.Page.AdminClassPage.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class DeleteButtonFunctionality extends UserInteractions {
    @Given("Admin already click kebab button on Kelas Delete")
    public void adminAlreadyClickKebabButtonOnKelasDelete() {
        clickOnElement(ADMIN_CLASS_KEBAB_DELETED);
    }

    @When("Admin choose delete button")
    public void adminChooseDeleteButton() {
//        scrollIntoView(DELETE_CLASS_BUTTON);
        clickOnElement(DELETE_CLASS_BUTTON);
    }

    @Then("Pop up delete confirmation appear")
    public void popUpDeleteConfirmationAppear() {
        checkElementVisibility(POPUP_DELETE_CONFIRM);
    }

    @When("User click cancel delete")
    public void userClickCancelDelete() {
        clickOnElement(CANCEL_DELETE_CLASS);
    }

    @Then("Class {} is not deleted")
    public void classNewClassToBeDeletedIsNotDeleted(String className) {
        getDriver().get("https://mentutor.vercel.app/inputclass");
        Boolean isPresent = getDriver().findElements(By.xpath("//*[contains(text(), '"+ className +"')]")).size() > 0;
        Assertions.assertTrue(isPresent);
    }

    @Then("Class {} is deleted")
    public void classNewClassToBeDeletedIsDeleted(String className) {
        getDriver().get("https://mentutor.vercel.app/inputclass");
        Boolean isPresent = getDriver().findElements(By.xpath("//*[contains(text(), '"+ className +"')]")).size() > 0;
        Assertions.assertFalse(isPresent);
    }

    @When("User click confirm delete")
    public void userClickConfirmDelete() {
        clickOnElement(CONFIRM_DELETE_CLASS);
    }
}
