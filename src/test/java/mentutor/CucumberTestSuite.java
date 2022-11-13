package mentutor;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags = "@rerunbroken"


)
public class CucumberTestSuite {
    public static final String BASE_URL = "https://mentutor.vercel.app/";

}
