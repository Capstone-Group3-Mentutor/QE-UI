package mentutor.Mentee;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenteePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static final By TASK_PAGE = By.id("nav-task");

    @Step("User navigate through navigation bar")
    public void navTo(By element){
        driver.findElement(element).click();
    }
}
