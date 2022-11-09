package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static mentutor.model.PageNavigation.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenteePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final By MENTEE_NAV_TASK_PAGE = By.cssSelector("#nav-task > svg");
    public static final By MENTEE_NAV_FORUM_PAGE = By.cssSelector("#nav-forum path:nth-child(1)");
    public static final By MENTEE_NAV_PROFILE_PAGE = By.cssSelector("#nav-profile path:nth-child(2)");
    public static final By MENTEE_NAV_HOME_PAGE = By.cssSelector("a:nth-child(1) path");
    public static final By MENTEE_TITLE = By.cssSelector(".md\\3Atext-3xl");
    public static final By MENTEE_NAME = By.cssSelector(".text-putih > span");
    public static final By VIEW_ALL_TASK_BTN = By.id("view-task");
    public static final By MENTEE_TASK_BAR = By.cssSelector(".h-auto");
    public static final By SUBMIT_TASK = By.cssSelector(".bg-task");
    public static final By BANNER = By.cssSelector(".h-\\[8rem\\]");
    public static final By MENTEE_PROFILE_PICTURE = By.id("gbr-hero");
    public static final By HERO_PICS = By.cssSelector("div.w-\\[18rem\\]:nth-child(2)");

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
        assertEquals(message, driver.findElement(MENTEE_TITLE).getText());
    }

    @Step("See mentee name on home page")
    public String getMenteeName() {
        return driver.findElement(By.id("name-profile")).getText();
    }

    @Step("See if users role displayed")
    public String getMenteeRole() {
        return driver.findElement(By.cssSelector(".pl-2 > p:nth-child(2)")).getText();
    }

    @Step("See if mentee profile displayed")
    public void menteeProfileDisplayed() {
        driver.findElement(MENTEE_PROFILE_PICTURE).isDisplayed();
    }

    @Step("Click on element")
    public void clickOn(By element) {
        driver.findElement(element).click();
    }

    @Step("Check all nav menu is displayed")
    public void allNavMenuDisplayed() {
        driver.findElement(MENTEE_NAV_HOME_PAGE).isDisplayed();
        driver.findElement(MENTEE_NAV_TASK_PAGE).isDisplayed();
        driver.findElement(MENTEE_NAV_FORUM_PAGE).isDisplayed();
        driver.findElement(MENTEE_NAV_PROFILE_PAGE).isDisplayed();
    }

    @Step("User click Nav Menu {}")
    public void clickNavMenu(String navMenu) {
        switch (navMenu){
            case "Task":
                driver.findElement(MENTEE_NAV_TASK_PAGE).click();
                break;
            case "Forum":
                driver.findElement(MENTEE_NAV_FORUM_PAGE).click();
                break;
            case "Profile":
                driver.findElement(MENTEE_NAV_PROFILE_PAGE).click();
                break;
            case "Home":
                driver.findElement(MENTEE_NAV_HOME_PAGE).click();
                break;
        }
    }

    @Step("User redirect to {} page")
    public void redirectTo(String navMenu) {
        switch (navMenu){
            case "Task":
                assertEquals(MENTEE_TASK_PAGE, driver.getCurrentUrl());
                break;
            case "Forum":
                assertEquals(MENTEE_FORUM_PAGE, driver.getCurrentUrl());
                break;
            case "Profile":
                assertEquals(MENTEE_PROFILE_PAGE, driver.getCurrentUrl());
                break;
            case "Home":
                assertEquals(MENTEE_HOME_PAGE, driver.getCurrentUrl());
                break;
        }
    }

    @Step("{} element is visible")
    public void elementDisplayed(By element){
        driver.findElement(element).isDisplayed();
    }
}
