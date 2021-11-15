package base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static WebDriver driver;
    private int timeOut = 10;

    public void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
    }

    public void quitWebDriver() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public void openPage(String Url) {
        driver.get(Url);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public boolean clickElement(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean typeText(By locator, String value) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(value);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public String getText(By locator) {
        try {
            return driver.findElement(locator).getText();
        } catch (Exception ex) {
            return null;
        }
    }

    public void waitSomeTime(int t){
        driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
    }
}
