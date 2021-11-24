package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.RegistrationPage;

public class RegistrationStepdefs {

    private static final RegistrationPage registrationPage = new RegistrationPage();
    @Given("Registration page is opened in header dropdown")
    public void registrationPageIsOpenedInHeaderDropdown() {
        registrationPage.headerComponent().clickHeaderDropdownButton("My Account");
        registrationPage.headerComponent().clickLoginOrRegistrationFromDropdown("Register");
    }

    @When("I enter in the field {string} data {string} on Registration page")
    public void iEnterDataFirstInTheFieldFirstnameOnRegistrationPage(String field, String data) {
        registrationPage.inputDataToRegistrationField(field, data);
    }

    @And("I click radiobutton Yes in the field Subscribe")
    public void iClickYesInTheFieldSubscribe() {
        registrationPage.clickNewsletterYesRadioButton();
    }

    @And("I click Agree with Privacy Policy")
    public void iClickAgreeWithPrivacyPolicy() {
        registrationPage.clickPrivacyPolicyCheckbox();
    }

    @And("I click button Continue")
    public void iClickButtonContinue() {
        registrationPage.clickContinueButton();
    }

    @And("I click button Continue after Registration")
    public void iClickButtonContinueAfterRegistration() {
        registrationPage.clickContinueButtonAfterRegistration();
    }

    @Then("Message invalid data is displayed")
    public void messageInvalidDataDisplayed() {
        registrationPage.getWarningInvalidEmailMessage();
    }

    @And("I click radiobutton No in the field Subscribe")
    public void iClickRadiobuttonNoInTheFieldSubscribe() {
        registrationPage.clickNewsletterNoRadioButton();
    }

    @Then("Message {string} is displayed")
    public void messageWarningEMailAddressIsAlreadyRegisteredIsDisplayed(String message) {
        String alertActualMessage = registrationPage.getAlertDismissibleWarning();
        Assertions.assertThat(message).as(String.format("Expected: %s, Actual: %s", message, alertActualMessage))
                .isEqualTo(alertActualMessage);
    }
}
