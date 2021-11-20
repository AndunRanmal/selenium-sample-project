package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By USERNAME_INPUT_LOCATOR = By.cssSelector("#txt-username");
    private static final By PASSWORD_INPUT_LOCATOR = By.cssSelector("#txt-password");
    private static final By LOGIN_IN_BUTTON_LOCATOR = By.cssSelector("#btn-login");

    public void typeUsername(String email) {
        typeText(USERNAME_INPUT_LOCATOR, email);
    }

    public void typePassword(String password) {
        typeText(PASSWORD_INPUT_LOCATOR, password);
    }

    public void clickLoginInButton() {
        clickElement(LOGIN_IN_BUTTON_LOCATOR);
    }
}
