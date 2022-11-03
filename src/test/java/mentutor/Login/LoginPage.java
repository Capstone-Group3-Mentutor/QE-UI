package mentutor.Login;

import mentutor.model.Roles;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static starter.CucumberTestSuite.*;


@DefaultUrl(BASE_URL) //TODO changes to Mentutor Page
public class LoginPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By fieldUsername = By.id("user-name");
    private final By fieldPassword = By.id("password");
    private final By loginButton = By.id("login-button");

    public void inputUsername(String username){
        driver.findElement(fieldUsername).clear();
        driver.findElement(fieldUsername).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(fieldPassword).clear();
        driver.findElement(fieldPassword).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void as(Roles role){
        inputUsername(role.username());
        inputPassword(role.password());
        clickLoginButton();
    }

}
