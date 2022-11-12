package mentutor.Page;

import mentutor.model.PageNavigation;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentorHomePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();
    PageNavigation pageNav;

    public static final By MENTOR_HOME_NAV = By.id("nav-homemntor");
    public static final By MENTOR_TASK_NAV = By.id("nav-inputtask");
    public static final By MENTOR_FORUM_NAV = By.id("nav-forummentor");
    public static final By MENTOR_PROFILE_NAV = By.id("nav-profile");

    @Step("User check all element visibility")
    public void userCheckNavVisibility(){
        driver.findElement(MENTOR_HOME_NAV).isDisplayed();
        driver.findElement(MENTOR_TASK_NAV).isDisplayed();
        driver.findElement(MENTOR_FORUM_NAV).isDisplayed();
        driver.findElement(MENTOR_PROFILE_NAV).isDisplayed();
    }

    @Step("Mentor navigate through page")
    public void navigateTo(String page) {
        switch (page){
            case "Home":
                driver.findElement(MENTOR_HOME_NAV).click();
                break;
            case "Task":
                driver.findElement(MENTOR_TASK_NAV).click();
                break;
            case "Forum":
                driver.findElement(MENTOR_FORUM_NAV).click();
                break;
            case "Profile":
                driver.findElement(MENTOR_PROFILE_NAV).click();
                break;
        }
    }

    @Step("Mentor make sure he is on {} page")
    public void isUserOnCorrectPage(String page) {
        switch (page){
            case "Home":
                assertEquals(pageNav.MENTOR_HOME_TITLE, driver.getCurrentUrl());
                break;
            case "Task":
                assertEquals(pageNav.MENTOR_INPUT_TASK, driver.getCurrentUrl());
                break;
            case "Forum":
                assertEquals(pageNav.MENTOR_FORUM, driver.getCurrentUrl());
                break;
            case "Profile":
                assertEquals(pageNav.MENTOR_PROFILE, driver.getCurrentUrl());
                break;
        }
    }
}
