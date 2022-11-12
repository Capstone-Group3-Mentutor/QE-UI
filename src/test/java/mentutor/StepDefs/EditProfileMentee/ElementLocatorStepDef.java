package mentutor.StepDefs.EditProfileMentee;

import io.cucumber.java.en.Then;
import mentutor.Interactions.UserInteractions;
import mentutor.Page.MenteeProfilePage;

public class ElementLocatorStepDef extends UserInteractions {

    MenteeProfilePage menteeProfile;

    @Then("All element is loaded and visible on Mentee Profile Page")
    public void allElementIsLoadedAndVisibleOnMenteeProfilePage() {
        menteeProfile.checkAllElementVisibility();
    }
}
