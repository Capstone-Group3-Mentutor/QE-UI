package mentutor.Admin;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    public static final By SUCCESS_LOGIN = By.id("swal2-title");

    public void isSuccessLoginPopUpDisplayed(By element){
        driver.findElement(element).isDisplayed();
    }

    public String getPopUpTitle(By element){
        return driver.findElement(element).getText();
    }
}
