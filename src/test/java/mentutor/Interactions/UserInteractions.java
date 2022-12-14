package mentutor.Interactions;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Random;

import static mentutor.Page.RegisterPage.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInteractions {

    @Step("User click on element {}")
    public void clickOnElement(By element){
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).click();
    }

    @Step("User check element {} visibility")
    public void checkElementVisibility(By element){
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).isDisplayed();
    }

    @Step("User check element {} is selected")
    public void checkElementIsSelected(By element){
        getDriver().findElement(element).isSelected();
    }

    @Step("User search element {}")
    public WebElement userFindElement(By element){
        return getDriver().findElement(element);
    }

    @Step("Get element {} text")
    public String getElementText(By element){
        return getDriver().findElement(element).getText();
    }

    @Step("User waiting ...")
    public WebDriverWait userWaiting(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(5));
    }

    @Step("User input text {} to element {}")
    public void inputTextTo(String text, By to){
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(to));
        getDriver().findElement(to).clear();
        getDriver().findElement(to).sendKeys(text);
    }

    @Step("User upload file to {}")
    public void uploadFile(By element, String path) throws AWTException {
        clickOnElement(element);
        StringSelection ss = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
//        getDriver().findElement(element).sendKeys(path);
    }

    @Step("Check text is Displayed")
    public void checkTextVisibility(String text){
        WebElement foundElements = getDriver().findElement(By.xpath("//*[contains(text(), '"+ text +"')]"));
        assertNotNull(foundElements);
    }

    @Step("Get Element {} value")
    public String getElementValue(By element, String params){
        return getDriver().findElement(element).getAttribute(params);
    }

    @Step("Scroll into view element {}")
    public void scrollIntoView(By element){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Step("Element is not visible")
    public boolean elementIsNotVisible(By element){
        return getDriver().findElements(element).size() < 1;
    }

    @Step("User select text {} from dropdown {}")
    public void selectTextFromDropdown(String text, By element){
        Select select = new Select(getDriver().findElement(element));
        select.selectByVisibleText(text);
    }

    public String randomRole(){
        String[] role = {"mentee", "mentor"};

        Random random = new Random();
        return role[random.nextInt(role.length)];
    }

    public String randomClass(){
        String[] role = {"Front End", "Base Testing", "Back End"};

        Random random = new Random();
        return role[random.nextInt(role.length)];
    }

    @Step("Registering New User")
    public void registerNewUser(String name, String email, String role, String className, String password){
        inputTextTo(name, NAME_FIELD);
        inputTextTo(email, EMAIL_FIELD);
        selectTextFromDropdown(role, ROLE_FIELD);
        selectTextFromDropdown(className, CLASS_FIELD);
        inputTextTo(password, PASSWORD_FIELD);
        clickOnElement(ADD_BTN);
    }

    @Step("User Copy paste {} to element {}")
    public void userCopyPasted(String copiedString, By element) {
        Actions user = new Actions(getDriver());

        clickOnElement(element);
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

    @Step("User see message {}")
    public void isMessageDisplayed(String message){
//        ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*"), message);
        boolean foundElements = getDriver().findElements(By.xpath("//*[contains(text(), '"+ message +"')]")).size() > 0;
        assertTrue(foundElements);
    }

    @Step("User upload file from {}")
    public void uploadAttachment(String path, By element){
        getDriver().findElement(element).sendKeys(path);
    }

    @Step("Create fool-proof path")
    public String foolProofPath(String pathFromContentRoot){
        String pre1 = System.getProperty("user.dir") + File.separator + pathFromContentRoot;
        String pre2 = pre1.replace("/", File.separator);
        return pre2.replace("\\", File.separator);
    }
}
