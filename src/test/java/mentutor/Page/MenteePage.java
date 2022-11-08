package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenteePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final By TASK_PAGE = By.id("nav-task");
    public static final By MENTEE_TITLE = By.cssSelector(".md\\3Atext-3xl");
    public static final By MENTEE_NAME = By.cssSelector(".text-putih > span");
    public static final By VIEW_ALL_TASK_BTN = By.id("view-task");
    public static final By MENTEE_TASK_BAR = By.cssSelector(".h-auto");
    public static final By SUBMIT_TASK = By.cssSelector(".bg-task");
    public static final By BANNER = By.cssSelector(".h-\\[8rem\\]");



    @Step("User navigate through navigation bar")
    public void navTo(By element){
        driver.findElement(element).click();
    }

    @Step("Check all element visibility")
    public void checkAllElementVisible() {
        driver.findElement(MENTEE_TITLE).isDisplayed();
        driver.findElement(MENTEE_NAME).isDisplayed();
        driver.findElement(VIEW_ALL_TASK_BTN).isDisplayed();
        driver.findElement(MENTEE_TASK_BAR).isDisplayed();
        driver.findElement(SUBMIT_TASK).isDisplayed();
        driver.findElement(BANNER).isDisplayed();
    }

    @Step("Mentee page Title should be {}")
    public void pageTitleShouldBe(String message) {
        Assertions.assertEquals(message, driver.findElement(MENTEE_TITLE).getText());
    }
}
