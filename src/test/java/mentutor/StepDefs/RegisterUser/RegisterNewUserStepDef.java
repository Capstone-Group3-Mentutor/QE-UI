package mentutor.StepDefs.RegisterUser;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import com.vladsch.flexmark.test.Strings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static mentutor.Page.RegisterPage.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.*;

public class RegisterNewUserStepDef extends UserInteractions {

    Lorem lorem = LoremIpsum.getInstance();
    RegisterPage register;

    private String name = lorem.getName();
    private String email = lorem.getEmail();

    @When("Admin enter valid data for register new user")
    public void adminEnterValidDataForRegisterNewUser() {
        registerNewUser(name, email, randomRole(), randomClass(), "Mentee123$");
    }

    @Then("Registration Success")
    public void registerSuccess() {
        assertEquals("Register Success", getElementText(POP_UP_TITLE));
        clickOnElement(CONFIRM_BTN);
    }

    @And("New User is created")
    public void newUserIsCreated() {
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '" + name + "')]"));
        assertNotNull(foundElements);
    }

    @When("Admin register new member with Number on name field")
    public void adminRegisterNewMemberWithNumberOnNameField() {
        registerNewUser("732569821523452", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with special character on name field")
    public void adminRegisterNewMemberWithSpecialCharacterOnNameField() {
        registerNewUser("*(&%(&$((*", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with less than character allowed ammount on name field")
    public void adminRegisterNewMemberWithLessThanCharacterAllowedAmmountOnNameField() {
        registerNewUser("No", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with more than character allowed ammount on name field")
    public void adminRegisterNewMemberWithMoreThanCharacterAllowedAmmountOnNameField() {
        String longName = Strings.repeat("a", 60);
        registerNewUser(longName, email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with blank on name field")
    public void adminRegisterNewMemberWithBlankOnNameField() {
        registerNewUser("", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with Common Delimiter on name field")
    public void adminRegisterNewMemberWithCommonDelimiterOnNameField() {
        registerNewUser("Limiter |^ revved", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with Single Space on name field")
    public void adminRegisterNewMemberWithSingleSpaceOnNameField() {
        adminEnterValidDataForRegisterNewUser();
    }

    @When("Admin register new member with Multiple Space on name field")
    public void adminRegisterNewMemberWithMultipleSpaceOnNameField() {
        registerNewUser(name + " three", email, randomRole(), randomClass(), "Mentee123$");
    }

    @And("New User with multiple space is created")
    public void newUserWithMultipleSpaceIsCreated() {
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '" + name + " three" + "')]"));
        assertNotNull(foundElements);
    }

    @When("Admin register new member with Leading Space on name field")
    public void adminRegisterNewMemberWithLeadingSpaceOnNameField() {
        registerNewUser(" " + name, email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with End-of-Line Character on name field")
    public void adminRegisterNewMemberWithEndOfLineCharacterMOnNameField() {
        registerNewUser(name + "^M", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with Copy-Paste on name field")
    public void adminRegisterNewMemberWithCopyPasteOnNameField() {
        userCopyPasted(name, NAME_FIELD);
        inputTextTo(email, EMAIL_FIELD);
        selectTextFromDropdown(randomRole(), ROLE_FIELD);
        selectTextFromDropdown(randomClass(), CLASS_FIELD);
        inputTextTo("Mentee123$", PASSWORD_FIELD);
        clickOnElement(ADD_BTN);
    }

    @When("Admin register new member with Emoji on name field")
    public void adminRegisterNewMemberWithEmojiOnNameField() {
        registerNewUser("😀 😃 😄 😁 😆 😅", email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with all lowercased Name")
    public void adminRegisterNewMemberWithAllLowercasedName() {
        registerNewUser(name.toLowerCase(), email, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin check name field placeholder")
    public void adminCheckNameFieldPlaceholder() {
        checkElementVisibility(NAME_FIELD);
    }

    @Then("The Placeholder should be {}")
    public void thePlaceholderShouldBeFullName(String defaultPlaceholder) {
        assertEquals(defaultPlaceholder, getElementValue(NAME_FIELD, "placeholder"));
    }

    @When("Admin register new member with allowed email format")
    public void adminRegisterNewMemberWithAllowedEmailFormat() {
        registerNewUser(name, email, randomRole(), randomClass(), "Mentee123$");
    }

    @And("New User with new email is created")
    public void newUserWithNewEmailIsCreated() {
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '" + email + "')]"));
        assertNotNull(foundElements);
    }

    @When("Admin register new member with not allowed email format")
    public void adminRegisterNewMemberWithNotAllowedEmailFormat() {
        registerNewUser(name, "not.an.email", randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with all uppercased email")
    public void adminRegisterNewMemberWithAllUppercasedEmail() {
        registerNewUser(name, email.toUpperCase(), randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with special character on email field")
    public void adminRegisterNewMemberWithSpecialCharacterOnEmailField() {
        registerNewUser(name, "*&^%&(%&%@email.com", randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with less than character allowed ammount on email field")
    public void adminRegisterNewMemberWithLessThanCharacterAllowedAmmountOnEmailField() {
        registerNewUser(name, "a@a.a", randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with already registered email")
    public void adminRegisterNewMemberWithAlreadyRegisteredEmail() {
        registerNewUser(name, "jago.tester@gmail.com", randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with more than character allowed ammount on email field")
    public void adminRegisterNewMemberWithMoreThanCharacterAllowedAmmountOnEmailField() {
        String longEmail = Strings.repeat("a", 21) + "@gmail.com";
        registerNewUser(name, longEmail, randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin register new member with blank on email field")
    public void adminRegisterNewMemberWithBlankOnEmailField() {
        registerNewUser(name, "", randomRole(), randomClass(), "Mentee123$");
    }

    @When("Admin click Email Field")
    public void adminClickEmailField() {
        clickOnElement(EMAIL_FIELD);
    }

    @Then("The Cursor is on Email Field")
    public void theCursorIsOnEmailField() {
        checkElementIsSelected(EMAIL_FIELD);
    }

    @When("Admin check email field placeholder")
    public void adminCheckEmailFieldPlaceholder() {
        assertNotNull(getElementValue(EMAIL_FIELD, "placeholder"));
    }

    @Then("Email Placeholder should be {}")
    public void emailPlaceholderShouldBeE(String emailPlaceholder) {
        assertEquals(emailPlaceholder, getElementValue(EMAIL_FIELD, "plcaeholder"));
    }

    @When("Admin click Role Field")
    public void adminClickRoleField() {
        clickOnElement(ROLE_FIELD);
    }

    @Then("The role field shows options")
    public void theRoleFieldShowsOptions() {
        checkElementIsSelected(ROLE_FIELD);
    }

    @When("Admin send keys to role field")
    public void adminSendKeysToRoleField() {
        inputTextTo("mentee", ROLE_FIELD);
    }

    @Then("The input is rejected")
    public void theInputIsRejected() {
        assertNotEquals("mentee", getElementValue(ROLE_FIELD, "value"));
    }

    @When("Admin did not select role when registering new users")
    public void adminDidNotSelectRoleWhenRegisteringNewUsers() {
        registerNewUser(name, email, "Choose a role", randomClass(), "Mentee123$");
    }

    @When("Admin select role as {}")
    public void adminSelectRoleAsMentor(String role) {
        selectTextFromDropdown(role, ROLE_FIELD);
    }

    @Then("{} role is selected")
    public void mentorRoleIsSelected(String role) {
        assertEquals(role, getElementValue(ROLE_FIELD, "value"));
    }

    @When("Admin check role field placeholder")
    public void adminCheckRoleFieldPlaceholder() {
        checkElementVisibility(ROLE_FIELD);
    }

    @Then("Role Placeholder should be {}")
    public void rolePlaceholderShouldBeChooseARole(String placeholder) {
        assertEquals(placeholder, getElementValue(ROLE_FIELD, "value"));
    }

    @When("Admin click Class Field")
    public void adminClickClassField() {
        clickOnElement(CLASS_FIELD);
    }

    @Then("The Class field shows options")
    public void theClassFieldShowsOptions() {
        checkElementIsSelected(CLASS_FIELD);
    }

    @When("Admin send keys to Class field")
    public void adminSendKeysToClassField() {
        inputTextTo("Front end", CLASS_FIELD);
    }
    @Then("The input to Class field is rejected")
    public void theInputToClassFieldIsRejected() {
        assertNotEquals("Front end", getElementValue(ROLE_FIELD, "value"));
    }

    @When("Admin did not select Class when registering new users")
    public void adminDidNotSelectClassWhenRegisteringNewUsers() {
        registerNewUser(name, email, randomRole(), "Choose a class", "Mentee123$");
    }

    @When("Admin select more than one Class")
    public void adminSelectMoreThanOneClass() {
        selectTextFromDropdown("Front end", CLASS_FIELD);
        selectTextFromDropdown("Full-stack", CLASS_FIELD);
    }

    @Then("The last Class selected is active")
    public void theLastClassSelectedIsActive() {
        assertEquals("Full-stack", getElementValue(CLASS_FIELD, "value"));
    }

    @When("Admin select Class as {}")
    public void adminSelectClassAsFrontEnd(String selectedClass) {
        selectTextFromDropdown(selectedClass, CLASS_FIELD);
    }

    @Then("The {} Class is selected")
    public void theFrontEndClassIsSelected(String selectedClass) {
        assertEquals(selectedClass, getElementValue(CLASS_FIELD, "value"));
    }

    @When("Admin check Class field placeholder")
    public void adminCheckClassFieldPlaceholder() {
        checkElementVisibility(CLASS_FIELD);
    }

    @Then("Class Placeholder should be {}")
    public void classPlaceholderShouldBeChooseAClass(String placeholder) {
        assertEquals(placeholder, getElementValue(ROLE_FIELD, "value"));
    }

    @When("Admin register new member with valid format on password field")
    public void adminRegisterNewMemberWithValidFormatOnPasswordField() {
        adminEnterValidDataForRegisterNewUser();
    }


    @When("Admin register new member with less than {int} characters on password field")
    public void adminRegisterNewMemberWithLessThanCharactersOnPasswordField(int passLen) {
        String shortPassword = "A$1" + Strings.repeat("a", passLen-4);
        registerNewUser(name, email, randomRole(), randomClass(), shortPassword);
    }

    @When("Admin register new member with more than {int} characters on password field")
    public void adminRegisterNewMemberWithMoreThanCharactersOnPasswordField(int passLen) {
        String longPassword = "A$1" + Strings.repeat("a", passLen);
        registerNewUser(name, email, randomRole(), randomClass(), longPassword);
    }

    @When("Admin register new member with blank on password field")
    public void adminRegisterNewMemberWithBlankOnPasswordField() {
        registerNewUser(name, email, randomRole(), randomClass(), "");
    }

    @When("Admin register new member with copy-paste on password field")
    public void adminRegisterNewMemberWithCopyPasteOnPasswordField() {
        inputTextTo(name, NAME_FIELD);
        inputTextTo(email, EMAIL_FIELD);
        selectTextFromDropdown(randomRole(), ROLE_FIELD);
        selectTextFromDropdown(randomClass(), CLASS_FIELD);
        userCopyPasted("Mentee123$", PASSWORD_FIELD);
        clickOnElement(ADD_BTN);
    }

    @When("Admin register new member with Emoji on password field")
    public void adminRegisterNewMemberWithEmojiOnPasswordField() {
        registerNewUser(name, email, randomRole(), randomClass(), "😀 😃 😄 😁 😆 😅");
    }

    @When("Admin check password field placeholder")
    public void adminCheckPasswordFieldPlaceholder() {
        checkElementVisibility(PASSWORD_FIELD);
    }

    @Then("Password Placeholder should be {}")
    public void passwordPlaceholderShouldBe(String placeholder) {
        assertEquals(placeholder, getElementValue(PASSWORD_FIELD, "value"));
    }

    @When("Admin register new member without uppercase on password field")
    public void adminRegisterNewMemberWithoutUppercaseOnPasswordField() {
        registerNewUser(name, email, randomRole(), randomClass(), "admin123$");
    }

    @When("Admin register new member without number on password field")
    public void adminRegisterNewMemberWithoutNumberOnPasswordField() {
        registerNewUser(name, email, randomRole(), randomClass(), "Adminaaa$");
    }

    @When("Admin register new member without special char on password field")
    public void adminRegisterNewMemberWithoutSpecialCharOnPasswordField() {
        registerNewUser(name, email, randomRole(), randomClass(), "Admin1234");
    }

    @When("Tester type {} in password field")
    public void testerTypeAdmin$InPasswordField(String text) {
        inputTextTo(text, PASSWORD_FIELD);
    }

    @But("The eye icon is not clicked")
    public void theEyeIconIsNotClicked() {
        checkElementVisibility(EYE_ICON);
    }
    
    @Then("The password is masked")
    public void thePasswordIsMasked() {
        assertEquals("password", getElementValue(PASSWORD_FIELD, "type"));
    }

    @And("The eye icon is clicked")
    public void theEyeIconIsClicked() {
        clickOnElement(EYE_ICON);
    }

    @Then("The password is not masked")
    public void thePasswordIsNotMasked() {
        assertNotEquals("password", getElementValue(PASSWORD_FIELD, "type"));
    }

    @When("Tester check Add button")
    public void testerCheckAddButton() {
        checkElementVisibility(ADD_BTN);
    }

    @Then("The button label should be {}")
    public void theButtonLabelShouldBe(String btnLabel) {
        assertEquals(btnLabel, getElementText(ADD_BTN));
    }

    @Then("Message {} not shown")
    public void messageRegisterSuccessNotShown(String message) {
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '" + message + "')]"));
        assertNull(foundElements);
    }
    @When("Admin register new user with invalid data")
    public void adminRegisterNewUserWithInvalidData() {
        registerNewUser("", "", randomRole(), randomClass(), "Mentee123$");
    }

    @When("The cursor is at Register Name field")
    public void theCursorIsAtRegisterNameField() {
        checkElementIsSelected(NAME_FIELD);
    }

    @When("Uer click Register Name field")
    public void uerClickRegisterNameField() {
        clickOnElement(NAME_FIELD);
    }

    @Then("The cursor is at Register Email field")
    public void theCursorIsAtRegisterEmailField() {
        checkElementIsSelected(EMAIL_FIELD);
    }

    @When("Admin register new user with valid data but admin doesnt click Login Button")
    public void adminRegisterNewUserWithValidDataButAdminDoesntClickLoginButton() {
        inputTextTo(name, NAME_FIELD);
        inputTextTo(email, EMAIL_FIELD);
        selectTextFromDropdown(randomRole(), ROLE_FIELD);
        selectTextFromDropdown(randomClass(), CLASS_FIELD);
        userCopyPasted("Mentee123$", PASSWORD_FIELD);
    }
}
