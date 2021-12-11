package pages;

import org.openqa.selenium.By;

public class BookAppointmentPage extends BasePage {
    private final static By APPOINTMENT_FORM_LOCATOR = By.cssSelector("form[method='post']");
    private final static By FACILITY_SELECTOR_LOCATOR = By.cssSelector("#combo_facility");
    private final static By HEALTH_CARE_PROGRAM_RADIO_SELECTOR = By.cssSelector(".radio-inline");
    private final static By VISIT_DATE_SELECT_LOCATOR = By.cssSelector("#txt_visit_date");
    private final static By COMMENT_TEXT_AREA_LOCATOR = By.cssSelector("#txt_comment");
    private final static By BOOK_APPOINTMENT_BUTTON_LOCATOR = By.cssSelector("#btn-book-appointment");

    public boolean appointmentFormIsDisplayed() {
        return isDisplayed(APPOINTMENT_FORM_LOCATOR);
    }

    public void selectFacility(String facility) {
        selectElement(FACILITY_SELECTOR_LOCATOR, facility);
    }

    public void selectHealthCareProgram(String radioOption) {
        selectRadio(HEALTH_CARE_PROGRAM_RADIO_SELECTOR, radioOption);
    }

    public void typeVisitDate(String date) {
        typeText(VISIT_DATE_SELECT_LOCATOR, date);
    }

    public void typeComment(String comment) {
        typeText(COMMENT_TEXT_AREA_LOCATOR, comment);
    }

    public void clickBookAppointmentButton() {
        clickElement(BOOK_APPOINTMENT_BUTTON_LOCATOR);
    }
}
