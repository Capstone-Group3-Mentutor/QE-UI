package mentutor.Page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenteeForumPage extends PageObject {
    //Comment
    public static final By COMMENT_BAR_2 = By.cssSelector(".w-\\[18rem\\]:nth-child(2) #Input-comment");
    public static final By SEND_COMMENT_2 = By.cssSelector(".w-\\[18rem\\]:nth-child(2) #btn-sendComment");
    public static final By COMMENT_BAR_3 = By.cssSelector(".w-\\[18rem\\]:nth-child(3) #Input-comment");
    public static final By SEND_COMMENT_3 = By.cssSelector(".w-\\[18rem\\]:nth-child(3) #btn-sendComment");
    public static final By VIEW_MORE_COMMENT_2 = By.cssSelector("w-\\[18rem\\]:nth-child(2) > .text-xs:nth-child(5)");
    public static final By HIDE_ALL_COMMENT_2 = By.cssSelector(".w-\\[18rem\\]:nth-child(2) > .text-xs:nth-child(6)");
    public static final By VIEW_POST_2_COMMENT = By.cssSelector("w-\\[18rem\\]:nth-child(2) > .text-xs:nth-child(7)");

    //Post
    public static final By POST_BAR = By.id("input-status");
    public static final By UPLOAD_FILE_BTN = By.cssSelector(".text-putih > path");
    public static final By SEND_POST_BTN = By.id("btn-send");
}
