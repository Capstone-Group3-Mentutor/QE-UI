package mentutor.TasksSubmission;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskSubmissionPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final By CHOOSE_TASK_BUTTON = By.cssSelector(".bg-task");
    public static final By UPLOAD_BTN = By.cssSelector("");//TODO fix this code

    @Step("Click element")
    public void click(By element){
        driver.findElement(element).click();
    }

    @Step("User upload a file")
    public void uploadFile(String absoluteFilePath){
        driver.findElement(UPLOAD_BTN).sendKeys(absoluteFilePath);
    }
}
