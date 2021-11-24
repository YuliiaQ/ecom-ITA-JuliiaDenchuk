package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepdefs {
    private static final LoginPage loginPage = new LoginPage();

    @Given("Login page is opened in header dropdown")
    public void loginPageIsOpenedInHeaderDropdown() {
        loginPage.headerComponent().clickHeaderDropdownButton("My Account");
        loginPage.headerComponent().clickLoginOrRegistrationFromDropdown("Login");
    }

    @When("I enter email {string} on Login page")
    public void iEnterEmailSajowiEpevaComOnLoginPage(String email) {
        loginPage.inputEmailToEmailField(email);
    }

    @And("I enter password {string} on Login page")
    public void iEnterPasswordOnLoginPage(String password) {
        loginPage.inputPasswordToEmailField(password);
    }

    @And("I click Login button on Login page")
    public void iClickLoginButtonOnLoginPage() {
        loginPage.clickSubmitButton();
    }



}
