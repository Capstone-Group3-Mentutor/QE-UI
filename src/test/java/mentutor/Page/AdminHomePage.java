package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHomePage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    public static final By ADMIN_SUCCESS_LOGIN = By.id("swal2-title");
    public static final By ADMIN_ADD_CLASS_NAME = By.id("input-class");
    public static final By ADMIN_LOGOUT_CONFIRMATION = By.cssSelector(".swal2-popup");
    public static final By ADMIN_LOGOUT_BUTTON = By.cssSelector(".text-abu > svg");
    public static final By ADMIN_CONFIRM_LOGOUT = By.cssSelector(".swal2-confirm");
    public static final By ADMIN_CANCEL_LOGOUT = By.cssSelector(".swal2-cancel");
    public static final By ADMIN_HOME_NAV_BAR = By.cssSelector("a:nth-child(2) .hidden");
    public static final By ADMIN_CLASS_NAV_BAR = By.cssSelector("a:nth-child(2) > #nav-home");
    public static final By ADMIN_MEMBER_NAV_BAR = By.cssSelector("a:nth-child(3) > #nav-home");

    public void isSuccessLoginPopUpDisplayed(By element){
        driver.findElement(element).isDisplayed();
    }

    public String getPopUpTitle(By element){
        return driver.findElement(element).getText();
    }

    @Step("User click element on element {}")
    public void clickElement(By element){
        driver.findElement(element).click();
    }

    @Step("User check if element interactable")
    public void isElementInteractable(By element) {
        clickElement(element);
        driver.findElement(element).isSelected();
    }

    @Step("User input text {} to field {}")
    public void inputTextTo(String nameOfClass, By element) {
        driver.findElement(element).sendKeys(nameOfClass);
    }

    @Step("User check placeholder text of element {}")
    public String getPlaceHolderText(By element) {
        return driver.findElement(element).getAttribute("value");
    }

    @Step("User navigate page by clicking {} page")
    public void clickNavPage(String page) {
        switch (page){
            case "Home":
                clickElement(ADMIN_HOME_NAV_BAR);
                break;
            case "Class":
                clickElement(ADMIN_CLASS_NAV_BAR);
                break;
            case "Member":
                clickElement(ADMIN_MEMBER_NAV_BAR);
                break;
        }
    }
}
