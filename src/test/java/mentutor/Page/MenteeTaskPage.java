package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenteeTaskPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final By MENTEE_TASK_TITLE = By.cssSelector("h1.text-lg");
    public static final By MENTEE_DUE_TASK_BAR = By.cssSelector(".h-auto");
    public static final By MENTEE_DETAIL_TASK_TITLE = By.cssSelector(".md\\3Atext-2xl");
    public static final By MENTEE_DETAIL_TASK_DESC = By.cssSelector(".mt-3");
    public static final By MENTEE_DETAIL_TASK_DUE_DATE = By.cssSelector(".text-button:nth-child(2)");
    public static final By MENTEE_DETAIL_TASK_FILE_PREVIEW = By.cssSelector(".w-\\[4\\.5rem\\]");
    public static final By MENTEE_DETAIL_TASK_POINT = By.cssSelector(".text-xs:nth-child(1)");
    public static final By MENTEE_DETAIL_TASK_SUBMIT_BTN = By.cssSelector(".bg-task");
    public static final By MENTEE_SUBMIT_TASK_MODAL = By.cssSelector(".modal-box");
    public static final By MENTEE_UPLOAD_FILE_MODAL = By.cssSelector(".text-2xl > path");

    @Step("There is due task")
    public boolean thereIsDueTask() {
        return driver.findElement(MENTEE_DUE_TASK_BAR).isDisplayed();
    }

    @Step("Task detail available")
    public void taskDetailAvailable() {
        driver.findElement(MENTEE_DETAIL_TASK_TITLE).isDisplayed();
        driver.findElement(MENTEE_DETAIL_TASK_DESC).isDisplayed();
        driver.findElement(MENTEE_DETAIL_TASK_DUE_DATE).isDisplayed();
//        driver.findElement(MENTEE_DETAIL_TASK_FILE_PREVIEW).isDisplayed();
        driver.findElement(MENTEE_DETAIL_TASK_POINT).isDisplayed();
        driver.findElement(MENTEE_DETAIL_TASK_SUBMIT_BTN).isDisplayed();
    }

    @Step("Get text")
    public String getElementText(By element){
        return driver.findElement(element).getText();
    }

    @Step("{} element is visible")
    public void elementIsVisible(By element){
        driver.findElement(element).isDisplayed();
    }

    @Step("User click on {}")
    public void clickElement(By element){
        driver.findElement(element).click();
    }

}
