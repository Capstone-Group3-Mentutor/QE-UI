package mentutor.Page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AdminClassPage extends PageObject {

    public static final By ADMIN_CLASS_KEBAB_TESTING = By.cssSelector(".flex:nth-child(9) path");
    public static final By CLASS_TESTING_EDIT = By.cssSelector(".flex:nth-child(9) .hover\\3Atext-button");
    public static final By MODAL_EDIT_CLASSNAME = By.cssSelector(".my-5 > #input-class");
    public static final By MODAL_EDIT_STATUS = By.id("dropdown-status");
    public static final By MODAL_EDIT_CLASS_SUBMIT = By.id("btn-submitEditClass");
    public static final By CLASS_TESTING_STATUS = By.cssSelector("div.flex:nth-child(9) > p:nth-child(4)");
    public static final By OK_EDITING_CLASS_BTN = By.cssSelector(".swal2-confirm");
    public static final By MODAL_EDIT_CLASS_CLOSE_BTN = By.cssSelector(".hover\\3Atext-button:nth-child(2)");
    public static final By EDIT_CLASS_TITLE = By.cssSelector(".md\\:space-y-2 > h1:nth-child(1)");
    public static final By ADMIN_CLASS_KEBAB_EDITED = By.cssSelector(".flex:nth-child(14) path");
    public static final By EDIT_CLASS_EDITED = By.cssSelector(".flex:nth-child(14) .hover\\3Atext-button");
    public static final By CLASS_EDITED_NAME = By.cssSelector("div.flex:nth-child(14) > p:nth-child(2)");
    public static final By CLASS_EDIT_STATUS = By.cssSelector("div.flex:nth-child(14) > p:nth-child(4)");
    public static final By BUTTON_ADD_CLASS = By.id("btn-addClass");
    public static final By ADMIN_CLASS_KEBAB_DELETED = By.cssSelector(".flex:nth-child(15) path");
    public static final By DELETE_CLASS_BUTTON = By.cssSelector(".flex:nth-child(15) a");
    public static final By POPUP_DELETE_CONFIRM = By.cssSelector(".swal2-popup");
    public static final By CANCEL_DELETE_CLASS = By.cssSelector(".swal2-cancel");
    public static final By CONFIRM_DELETE_CLASS = By.cssSelector(".swal2-confirm");
    public static final By CLASS_DELETED_NAME = By.cssSelector("div.flex:nth-child(15) > p:nth-child(2)");


}
