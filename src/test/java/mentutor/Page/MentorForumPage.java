package mentutor.Page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MentorForumPage extends PageObject {
    public static final By COMMENT_BAR_2 = By.id("Input-comment");
    public static final By SEND_COMMENT_2 = By.cssSelector(".w-\\[18rem\\]:nth-child(1) svg");
    public static final By COMMENT_BAR_3 = By.cssSelector(".w-\\[18rem\\]:nth-child(3) #Input-comment");
    public static final By SEND_COMMENT_3 = By.cssSelector(".w-\\[18rem\\]:nth-child(3) #btn-sendComment");
    public static final By VIEW_MORE_COMMENT_2 = By.cssSelector(".flex:nth-child(6) > .text-button");
    public static final By HIDE_ALL_COMMENT_2 = By.cssSelector(".flex:nth-child(6) > .text-gray-500");
    public static final By VIEW_POST_2_COMMENT = By.cssSelector("w-\\[18rem\\]:nth-child(2) > .text-xs:nth-child(7)");
}
