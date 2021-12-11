package pages;

import org.openqa.selenium.By;

public class AppointmentConfirmationPage extends BasePage {
    private static final By FACILITY_VALUE_TEXT_LOCATOR = By.cssSelector("#facility");
    private static final By PROGRAM_VALUE_TEXT_LOCATOR = By.cssSelector("#program");
    private static final By VISIT_DATE_VALUE_TEXT_LOCATOR = By.cssSelector("#visit_date");
    private static final By COMMENT_VALUE_TEXT_LOCATOR = By.cssSelector("#comment");

    public String getFacilityTextValue() {
        return getText(FACILITY_VALUE_TEXT_LOCATOR);
    }

    public String getProgramTextValue() {
        return getText(PROGRAM_VALUE_TEXT_LOCATOR);
    }

    public String getVisitDateTextValue() {
        return getText(VISIT_DATE_VALUE_TEXT_LOCATOR);
    }

    public String getCommentTextValue() {
        return getText(COMMENT_VALUE_TEXT_LOCATOR);
    }
}
