package mentutor.Login;

import mentutor.model.Roles;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static starter.CucumberTestSuite.*;


@DefaultUrl("https://mentutor.vercel.app/login") //TODO changes to Mentutor Page
public class LoginPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By fieldUsername = By.id("input-email");
    private final By fieldPassword = By.id("input-password");
    private final By loginButton = By.id("btn-login");

    public static final By FAILED_LOGIN = By.id("swal2-html-container");

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

    public void with(String email, String password){
        inputUsername(email);
        inputPassword(password);
        clickLoginButton();
    }

    public void isFailedLoginPopUpDisplayed(By element){
        driver.findElement(element).isDisplayed();
    }

}
