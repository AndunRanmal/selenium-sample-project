package pages;

import org.openqa.selenium.By;

public class BookAppointmentPage extends BasePage {
    private final static By APPOINTMENT_FORM_LOCATOR = By.cssSelector("form[method='post']");

    public boolean appointmentFormIsDisplayed() {
        return isDisplayed(APPOINTMENT_FORM_LOCATOR);
    }
}
