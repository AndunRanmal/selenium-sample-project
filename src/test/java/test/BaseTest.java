package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;

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
