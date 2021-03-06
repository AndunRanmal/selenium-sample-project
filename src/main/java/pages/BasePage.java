package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BasePage {
    private static WebDriver driver;
    private int timeOut = 10;

    public void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
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

    public void clickElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void typeText(By locator, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.sendKeys(value);
    }

    public String getText(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }

    public boolean isDisplayed(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))) != null;
    }

    public void selectElement(By locator, String selectText) {
        Select selector = new Select(driver.findElement(locator));
        selector.selectByVisibleText(selectText);
    }

    public void selectRadio(By locator, String radioOption) {
        List<WebElement> elements = driver.findElements(locator);
        elements.stream().filter(element -> element.getText().contains(radioOption)).collect(Collectors.toList()).get(0).click();
    }

    public void waitSomeTime(int t){
        driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
    }
}
