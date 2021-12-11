package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppointmentConfirmationPage;
import pages.BookAppointmentPage;
import pages.HomePage;
import pages.LoginPage;

public class CreateAppointmentTest extends BaseTest {
    private LoginPage loginPage = new LoginPage();
    private BookAppointmentPage bookAppointmentPage = new BookAppointmentPage();
    private AppointmentConfirmationPage appointmentConfirmationPage = new AppointmentConfirmationPage();

    @Test
    public void successAppointment() {
        preconditions();
        selectFacility();
        selectProgram();
        typeVisitDate();
        addAComment();
        clickBookAppointment();
        checkAppointmentDetails();
    }

    private void preconditions() {
        navigateToPage();
        maximizeWindow();
        clickMakeAnAppointmentButton();
        typeUsername();
        typePassword();
        clickLoginInButton();
    }

    private void navigateToPage() {
        openPage("https://katalon-demo-cura.herokuapp.com/");
    }

    private void clickMakeAnAppointmentButton() {
        HomePage homePage = new HomePage();
        homePage.clickMakeAnAppointmentButton();
    }

    private void typeUsername() {
        loginPage.typeUsername("John Doe");
    }

    private void typePassword() {
        loginPage.typePassword("ThisIsNotAPassword");
    }

    private void clickLoginInButton() {
        loginPage.clickLoginInButton();
    }

    private void selectFacility() {
        bookAppointmentPage.selectFacility("Hongkong CURA Healthcare Center");
    }

    private void selectProgram() {
        bookAppointmentPage.selectHealthCareProgram("Medicaid");
    }

    private void typeVisitDate() {
        bookAppointmentPage.typeVisitDate("12/12/2021");
    }

    private void addAComment() {
        bookAppointmentPage.typeComment("This is a test appointment");
    }

    private void clickBookAppointment() {
        bookAppointmentPage.clickBookAppointmentButton();
    }

    private void checkAppointmentDetails() {
        Assert.assertEquals(appointmentConfirmationPage.getFacilityTextValue(), "Hongkong CURA Healthcare Center");
        Assert.assertEquals(appointmentConfirmationPage.getProgramTextValue(), "Medicaid");
        Assert.assertEquals(appointmentConfirmationPage.getVisitDateTextValue(), "12/12/2021");
        Assert.assertEquals(appointmentConfirmationPage.getCommentTextValue(), "This is a test appointment");
    }
}
