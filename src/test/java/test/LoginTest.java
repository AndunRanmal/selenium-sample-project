package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookAppointmentPage;
import pages.LoginPage;
import pages.HomePage;

public class LoginTest extends BaseTest {
    private LoginPage loginPage = new LoginPage();

    @Test
    public void SuccessLogin() {
        navigateToPage();
        maximizeWindow();
        clickMakeAnAppointmentButton();
        typeUsername();
        typePassword();
        clickLoginInButton();
        checkAppointmentFormIsDisplayed();
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

    private void checkAppointmentFormIsDisplayed() {
        BookAppointmentPage bookAppointmentPage = new BookAppointmentPage();
        Assert.assertTrue(bookAppointmentPage.appointmentFormIsDisplayed());
    }
}
