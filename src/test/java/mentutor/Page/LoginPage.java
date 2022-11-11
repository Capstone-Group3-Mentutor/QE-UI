package mentutor.Page;

import mentutor.model.Roles;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("https://mentutor.vercel.app/") //TODO changes to Mentutor Page
public class LoginPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By fieldEmail = By.id("input-email");
    private final By fieldPassword = By.id("input-password");
    private final By loginButton = By.id("btn-login");
    private final By pageTitle = By.cssSelector("h1.font-semibold");
    private final By unregisteredPrompt = By.cssSelector(".text-gray-500");

    private final By loginPics = By.id("gbr-login");

//    public static final By FAILED_LOGIN = By.id("swal2-html-container");
    public static final By FAILED_LOGIN = By.className("break-words");
    public static final By LOGOUT_OK = By.cssSelector(".swal2-confirm");

    public void inputUsername(String username){
        driver.findElement(fieldEmail).clear();
        driver.findElement(fieldEmail).sendKeys(username);
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

    public void checkAllElementVisibility() {
        driver.findElement(pageTitle).isDisplayed();
        driver.findElement(fieldEmail).isDisplayed();
        driver.findElement(fieldPassword).isDisplayed();
        driver.findElement(loginButton).isDisplayed();
        driver.findElement(unregisteredPrompt).isDisplayed();
        driver.findElement(loginPics).isDisplayed();

        //Assert all text is correct
        Assertions.assertEquals("If you dont have an account, please contact admin", driver.findElement(unregisteredPrompt).getText());
        Assertions.assertEquals("Login to your account", driver.findElement(pageTitle).getText());
    }
    
    public void clickElement(String element){
        switch (element){
            case "email":
                driver.findElement(fieldEmail).click();
                break;
            case "password":
                driver.findElement(fieldPassword).click();
                break;
            case "login button":
                driver.findElement(loginButton).click();
                break;
            case "contact admin link":
                driver.findElement(By.linkText("admin")).isDisplayed();
                break;
            case "login ok":
                driver.findElement(By.cssSelector(".swal2-confirm")).click();
        }
    }

    public void isElementInteractable(String element) {
        switch (element){
            case "email":
                driver.findElement(fieldEmail).isSelected();
                break;
            case "password":
                driver.findElement(fieldPassword).isSelected();
                break;
            case "login button":
                driver.findElement(By.xpath("//*[contains(text(), 'Email is required')]")).isDisplayed();
                break;
            case "contact admin link":
                driver.findElement(By.linkText("admin")).isDisplayed();
                break;
        }
    }

    public void copyPasted(String field, String copiedString) {
        Actions user = new Actions(driver);

        clickElement(field);
        user
                .sendKeys(copiedString)
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_UP)
                .keyUp(Keys.SHIFT)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("xv")
                .keyUp(Keys.LEFT_CONTROL)
                .perform();
    }

    public void quit() {
        driver.quit();
    }
}
