package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends PageObject {

//    public final By PAGE_TITLE = By.id(""); //TODO searh element
//    public final By NAME_TITLE = By.id("");
    public final By NAME_FIELD = By.id("input-fullname");
//    public final By EMAIL_TITLE = By.id("");
    public final By EMAIL_FIELD = By.id("input-email");
//    public final By ROLE_TITLE = By.id("");
    public final By ROLE_FIELD = By.id("dropdown-role");
//    public final By CLASS_TITLE = By.id("");
    public final By CLASS_FIELD = By.id("dropdown-class");
//    public final By PASSWORD_TITLE = By.id("");
    public final By PASSWORD_FIELD = By.id("input-password");
//    public final By EYE_ICON = By.id("");
    public final By ADD_BTN = By.id("add-btnMember");

    @Managed
    WebDriver driver = getDriver();
    @Step("Check all element visibility")
    public void checkAllElementVisibility() {
//        driver.findElement(PAGE_TITLE).isDisplayed();
//        driver.findElement(NAME_TITLE).isDisplayed();
        driver.findElement(NAME_FIELD).isDisplayed();
//        driver.findElement(EMAIL_TITLE).isDisplayed();
        driver.findElement(EMAIL_FIELD).isDisplayed();
//        driver.findElement(ROLE_TITLE).isDisplayed();
        driver.findElement(ROLE_FIELD).isDisplayed();
//        driver.findElement(CLASS_TITLE).isDisplayed();
        driver.findElement(CLASS_FIELD).isDisplayed();
//        driver.findElement(PASSWORD_TITLE).isDisplayed();
        driver.findElement(PASSWORD_FIELD).isDisplayed();
//        driver.findElement(EYE_ICON).isDisplayed();
        driver.findElement(ADD_BTN).isDisplayed();
    }
}
