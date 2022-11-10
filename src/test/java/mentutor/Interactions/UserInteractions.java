package mentutor.Interactions;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.assertNotNull;

public class UserInteractions {

    @Step("User click on element {}")
    public void clickOnElement(By element){
        userWaiting().until(ExpectedConditions.visibilityOfElementLocated(element));
        getDriver().findElement(element).click();
    }

    @Step("User check element {} visibility")
    public void checkElementVisibility(By element){
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
}
