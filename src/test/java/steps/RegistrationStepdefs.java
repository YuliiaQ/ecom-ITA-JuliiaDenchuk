package steps;

import enums.TableFields;
import enums.elements.HeaderDropdownButton;
import enums.elements.MyAccountDropdownButton;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.RegistrationPage;

import java.util.Map;

public class RegistrationStepdefs {

    private static final RegistrationPage registrationPage = new RegistrationPage();
    @Given("Registration page is opened in header dropdown")
    public void registrationPageIsOpenedInHeaderDropdown() {
        registrationPage.headerComponent().clickHeaderDropdownButton(HeaderDropdownButton.MY_ACCOUNT_HEADER_DROPDOWN_BUTTON);
        registrationPage.headerComponent().clickLoginOrRegistrationFromDropdown(MyAccountDropdownButton.REGISTER_DROPDOWN_BUTTON);
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
    @When("I enter in the field enum {} data {string} on Registration page")
    public void iEnterInTheFieldEnumDataOnRegistrationPage(String field, String data) {
        registrationPage.inputDataToRegistrationField(field, data);
    }

    @When("I enter in the field data on Registration page")
    public void iEnterInTheFieldDataOnRegistrationPage(DataTable table) {
        for (Map<String, String> row : table.asMaps()){
            String field = row.get(TableFields.FIELD_NAME.toString());
            String data = row.get(TableFields.INPUT_DATA.toString());
            registrationPage.inputDataToRegistrationField(field, data);
        }
    }
}
