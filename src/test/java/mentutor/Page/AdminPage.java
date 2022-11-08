package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    public static final By SUCCESS_LOGIN = By.id("swal2-title");
    public static final By ADD_CLASS_NAME = By.id("input-class");
    public static final By LOGOUT_CONFIRMATION = By.cssSelector(".swal2-popup");
    public static final By LOGOUT_BUTTON = By.cssSelector(".text-abu > svg");
    public static final By CONFIRM_LOGOUT = By.cssSelector(".swal2-confirm");
    public static final By CANCEL_LOGOUT = By.cssSelector(".swal2-cancel");
    public static final By HOME_NAV_BAR = By.cssSelector("a:nth-child(2) .hidden");

    public void isSuccessLoginPopUpDisplayed(By element){
        driver.findElement(element).isDisplayed();
    }

    public String getPopUpTitle(By element){
        return driver.findElement(element).getText();
    }

    public void clickElement(By element){
        driver.findElement(element).click();
    }

    public void isElementInteractable(By element) {
        clickElement(element);
        driver.findElement(element).isSelected();
    }

    public void inputTextTo(String nameOfClass, By element) {
        driver.findElement(element).sendKeys(nameOfClass);
    }

    public String getPlaceHolderText(By element) {
        return driver.findElement(element).getAttribute("value");
    }
}
