package mentutor.Page;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static mentutor.model.PageNavigation.*;
import static org.junit.jupiter.api.Assertions.*;

public class AdminHomePage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    public static final By ADMIN_SUCCESS_LOGIN = By.id("swal2-title");
    public static final By ADMIN_ADD_CLASS_NAME = By.id("input-class");
    public static final By ADMIN_LOGOUT_CONFIRMATION = By.cssSelector(".swal2-popup");
    public static final By ADMIN_LOGOUT_BUTTON = By.cssSelector(".text-abu > svg");
    public static final By ADMIN_CONFIRM_LOGOUT = By.cssSelector(".swal2-confirm");
    public static final By ADMIN_CANCEL_LOGOUT = By.cssSelector(".swal2-cancel");

    //Critical element
    public static final By ADMIN_HOME_PAGE_TITLE = By.cssSelector(".md\\3Atext-2xl");
    public static final By LIST_USER_FIELD_TITLE = By.cssSelector(".md\\3Atext-3xl");
    public static final By LIST_USER_FIELD = By.cssSelector(".h-\\[30rem\\]");
    public static final By LIST_USER_TABLE_TITLE = By.cssSelector(".py-2");
    public static final By LIST_USER_NO = By.cssSelector(".flex:nth-child(2) > .w-\\[10\\%\\]");
    public static final By LIST_USER_NAME = By.cssSelector(".flex:nth-child(2) > .flex > .text-left");
    public static final By LIST_USER_EMAIL = By.cssSelector(".flex:nth-child(2) > .w-\\[35\\%\\]");
    public static final By LIST_USER_ROLE = By.cssSelector(".flex:nth-child(2) > .w-\\[15\\%\\]");
    public static final By LIST_USER_CLASS = By.cssSelector(".flex:nth-child(2) > .w-\\[25\\%\\]");
    public static final By LIST_USER_KEBAB = By.cssSelector(".flex:nth-child(2) svg");

    //Nav Bar
    public static final By ADMIN_HOME_NAV_BAR = By.id("nav-home");
    public static final By ADMIN_CLASS_NAV_BAR = By.cssSelector("a:nth-child(2) .hidden");
    public static final By ADMIN_MEMBER_NAV_BAR = By.cssSelector("a:nth-child(3) .hidden");


    @Step("Displaying success login")
    public void isSuccessLoginPopUpDisplayed(By element){
        driver.findElement(element).isDisplayed();
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

    @Step("User see all element on Admin Home Page")
    public void checkAllElementVisibilityAdmin() {
        driver.findElement(ADMIN_HOME_PAGE_TITLE).isDisplayed();
        driver.findElement(LIST_USER_FIELD_TITLE).isDisplayed();
        driver.findElement(LIST_USER_FIELD).isDisplayed();
        driver.findElement(LIST_USER_TABLE_TITLE).isDisplayed();
        driver.findElement(LIST_USER_NO).isDisplayed();
        driver.findElement(LIST_USER_NAME).isDisplayed();
        driver.findElement(LIST_USER_EMAIL).isDisplayed();
        driver.findElement(LIST_USER_ROLE).isDisplayed();
        driver.findElement(LIST_USER_CLASS).isDisplayed();
        driver.findElement(LIST_USER_KEBAB).isDisplayed();
        driver.findElement(ADMIN_HOME_NAV_BAR).isDisplayed();
        driver.findElement(ADMIN_CLASS_NAV_BAR).isDisplayed();
        driver.findElement(ADMIN_MEMBER_NAV_BAR).isDisplayed();
        driver.findElement(ADMIN_LOGOUT_BUTTON).isDisplayed();
    }

    @Step("User check Navigation Menu Visibility")
    public void checkNavMenuVisibility() {
        driver.findElement(ADMIN_HOME_NAV_BAR).isDisplayed();
        driver.findElement(ADMIN_CLASS_NAV_BAR).isDisplayed();
        driver.findElement(ADMIN_MEMBER_NAV_BAR).isDisplayed();
    }

    @Step("User click Nav Menu {}")
    public void clickNavMenu(String navMenu){
        switch (navMenu){
            case "Home":
                driver.findElement(ADMIN_HOME_NAV_BAR).click();
                break;
            case "Input Class":
                driver.findElement(ADMIN_CLASS_NAV_BAR).click();
                break;
            case "Input Member":
                driver.findElement(ADMIN_MEMBER_NAV_BAR).click();
                break;
            case "Logout":
                driver.findElement(ADMIN_LOGOUT_BUTTON).click();
                break;
        }
    }

    @Step("User redirected to {} page")
    public void redirectTo(String page) {
        switch (page){
            case "Home":
                assertEquals(ADMIN_HOME_URL, driver.getCurrentUrl());
                break;
            case "Input Class":
                assertEquals(ADMIN_INPUT_CLASS, driver.getCurrentUrl());
                break;
            case "Input Member":
                assertEquals(ADMIN_INPUT_USERS, driver.getCurrentUrl());
                break;
        }
    }
}
