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
    public static final By EDIT_USER_MENTEE = By.cssSelector(".h-8 path");
    public static final By MENTEE_FULLNAME = By.id("input-fullname");
    public static final By MENTEE_EMAIL = By.id("input-email");
    public static final By MENTEE_PASSWORD = By.id("input-password");
    public static final By UPLOAD_BUTTON = By.id("btn-upload-gbr");
    public static final By BTN_SUBMIT_MENTEE = By.id("btn-submitMentee");
    public static final By BTN_CONFIRM = By.cssSelector(".swal2-confirm");
    public static final By BTN_CLOSE = By.cssSelector("label.cursor-pointer:nth-child(1)");


    @Step("User check All Element Visibility")
    public void checkAllElementVisibility() {
        driver.findElement(PROFILE_PICTURE).isDisplayed();
        driver.findElement(PROFILE_USER_NAME).isDisplayed();
        driver.findElement(PROFILE_USER_ROLE).isDisplayed();
        driver.findElement(PROFILE_USER_CLASS).isDisplayed();
    }
}
