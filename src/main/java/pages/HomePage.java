package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By MAKE_AN_APPOINTMENT_BUTTON = By.id("btn-make-appointment");
    private static final By ACCOUNT_NAME_LOCATOR = By.cssSelector(".account");

    public void clickMakeAnAppointmentButton() {
        clickElement(MAKE_AN_APPOINTMENT_BUTTON);
    }

    public String getAccountName() {
        return getText(ACCOUNT_NAME_LOCATOR);
    }
}
