package mentutor.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.BaseTest;
import mentutor.model.Roles;
import static org.junit.Assert.*;

public class LoginStepDefs extends BaseTest {

    @Given("User already on Login Page")
    public void alreadyOnLoginPage(){
        login.open();
    }

    @When("User want to login as (.*)$")
    public void userWantToLoginAs(Roles role) {
        login.as(role);
    }

    @Then("User logged in as (.*)$")
    public void userLoggedInAs(Roles role) {
        assertEquals(role.pageTitle(), login.getTitle());
    }
}
