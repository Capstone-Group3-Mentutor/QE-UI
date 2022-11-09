package mentutor.StepDefs.MenteeTaskPage;

import io.cucumber.java.en.Then;
import mentutor.Page.MenteeTaskPage;

public class ElementVisibility {

    MenteeTaskPage menteeTask;

    @Then("All element is loaded and visible on Mentee Task Page")
    public void allElementIsLoadedAndVisibleOnMenteeTaskPage() {
        menteeTask.taskDetailAvailable();
    }
}
