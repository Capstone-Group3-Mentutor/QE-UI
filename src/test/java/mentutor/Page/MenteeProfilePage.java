package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenteeProfilePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final By PROFILE_PICTURE = By.cssSelector(".h-\\[8rem\\]");
    public static final By PROFILE_USER_NAME = By.cssSelector("h3:nth-child(1) > .text-abu");
    public static final By PROFILE_USER_ROLE = By.cssSelector(".pl-2");
    public static final By PROFILE_USER_CLASS = By.cssSelector(".pl-1");

    @Step("User check All Element Visibility")
    public void checkAllElementVisibility() {
        driver.findElement(PROFILE_PICTURE).isDisplayed();
        driver.findElement(PROFILE_USER_NAME).isDisplayed();
        driver.findElement(PROFILE_USER_ROLE).isDisplayed();
        driver.findElement(PROFILE_USER_CLASS).isDisplayed();
    }
}
