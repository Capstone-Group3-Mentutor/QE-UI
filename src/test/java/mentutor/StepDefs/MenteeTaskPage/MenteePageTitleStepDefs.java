package mentutor.StepDefs.MenteeTaskPage;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertNotNull;

public class MenteePageTitleStepDefs {
    @Then("Page Title should be {}")
    public void pageTitleShouldBe(String title) {
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '"+ title +"')]"));
        assertNotNull(foundElements);
    }
}
