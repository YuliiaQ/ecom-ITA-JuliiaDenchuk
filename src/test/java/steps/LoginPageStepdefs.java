package steps;

import enums.TableFields;
import enums.elements.HeaderDropdownButton;
import enums.elements.LoginPageInputField;
import enums.elements.LoginPageSubmitButton;
import enums.elements.MyAccountDropdownButton;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.LoginPage;

import java.util.Map;

public class LoginPageStepdefs {
    private static final LoginPage loginPage = new LoginPage();

    @Given("Login page is opened in header dropdown")
    public void loginPageIsOpenedInHeaderDropdown() {
        loginPage.headerComponent().clickHeaderDropdownButton(HeaderDropdownButton.MY_ACCOUNT_HEADER_DROPDOWN_BUTTON);
        loginPage.headerComponent().clickLoginOrRegistrationFromDropdown(MyAccountDropdownButton.LOGIN_DROPDOWN_BUTTON);
    }

    @When("I enter in the field {string} data {string} on Login page")
    public void iEnterInTheFieldDataOnLoginPage(String field, String data) {
        loginPage.inputDataToInputField(field, data);
    }

    @When("I enter in the enum field {} data {string} on Login page")
    public void iEnterInTheLoginPageInputFieldDataOnLoginPage(LoginPageInputField field, String data) {
        loginPage.inputDataToInputFieldForEnum(field, data);
    }

    @And("I click {} enum button on Login page")
    public void iClickLoginButtonOnLoginPage(LoginPageSubmitButton button) {
        loginPage.clickSubmitButtonForEnum(button);
    }

    @When("I enter text into field on Login Page:")
    public void iEnterTextIntoFieldOnLoginPage(DataTable table) {
        for (Map<String, String> row : table.asMaps()){
            String data = row.get(TableFields.INPUT_DATA.toString());
            String field = row.get(TableFields.FIELD_NAME.toString());
            loginPage.inputDataToInputFieldWithTable(field, data);
        }
    }

    @And("I click {string} button on Login page")
    public void iClickLoginButtonOnLoginPage(String button) {
        loginPage.clickSubmitButton(button);
    }


}
