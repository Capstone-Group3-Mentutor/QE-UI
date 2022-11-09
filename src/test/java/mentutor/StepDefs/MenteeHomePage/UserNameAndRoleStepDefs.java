package mentutor.StepDefs.MenteeHomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import mentutor.Page.MenteePage;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserNameAndRoleStepDefs {

    MenteePage mentee;

    @Then("User's name is visible on the right side of the page")
    public void userSNameAndRoleIsVisibleOnTheRightSideOfThePage(DataTable menteeName) throws InterruptedException {
        List<Map<String, String>> user = menteeName.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {
            String name = form.get("User's Name");

            assertEquals(name, mentee.getMenteeName());
        }

    }

    @Then("User role is visible under of user name")
    public void userRoleIsVisibleUnderOfUserName(DataTable menteeRole) {
        List<Map<String, String>> user = menteeRole.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {
            String name = form.get("User's Role");

            assertEquals(name, mentee.getMenteeRole());
        }
    }

    @Then("User's profile picture is displayed")
    public void userSProfilePictureIsDisplayed() {
        mentee.menteeProfileDisplayed();
    }
}
