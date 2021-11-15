package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {
    @BeforeTest
    public void beforeTest() {
        initWebDriver();
    }

    @AfterTest
    public void afterTest() {
        quitWebDriver();
    }
}
