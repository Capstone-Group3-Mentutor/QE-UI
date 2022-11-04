package mentutor.Login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mentutor.BaseTest;
import mentutor.model.Roles;

import java.util.List;
import java.util.Map;

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

    @When("User want to login with valid email prefixes")
    public void userWantToLoginWithValidEmailPrefixes(DataTable credentials) throws InterruptedException {
        List<Map<String, String>> user = credentials.asMaps(String.class, String.class);
        for (Map<String, String> form : user){
            String email = form.get("email");
            String password = form.get("password");

            login.inputUsername(email);
            login.inputPassword(password);
            login.clickLoginButton();
        }
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        assertEquals(login.getTitle(), "SWAG LABS");
    }
}
