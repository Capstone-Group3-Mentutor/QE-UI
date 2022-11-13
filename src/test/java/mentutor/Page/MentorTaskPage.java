package mentutor.Page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MentorTaskPage extends PageObject {

    public static final By TASK_TITLE = By.id("input-title");
    public static final By TASK_DESC = By.id("input-desc");
    public static final By TASK_DUE_DATE = By.id("input-date");
    public static final By TASK_ATTACH_BTN = By.id("uploadfile-btn");
    public static final By TASK_IMAGES_BTN = By.id("uploadimage-btn");
    public static final By TASK_ADD_BTN = By.id("input-file");
    public static final By TASK_CONFIRM_BTN = By.cssSelector(".swal2-actions");
}
