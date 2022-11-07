package mentutor.Admin;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    public static final By SUCCESS_LOGIN = By.id("swal2-title");
    public static final By ADD_CLASS_NAME = By.id("");//TODO add id

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
}
