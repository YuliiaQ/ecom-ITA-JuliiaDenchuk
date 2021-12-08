package steps;

import enums.TableFields;
import enums.elements.HeaderDropdownButton;
import enums.elements.LoginPageInputField;
import enums.elements.LoginPageSubmitButton;
import enums.elements.MyAccountDropdownButton;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import pages.LoginPage;
import properties.PropertyLoader;

import java.util.Map;
@Log4j
public class LoginPageStepdefs {
    private static final LoginPage loginPage = new LoginPage();

    @Given("Login page is opened in header dropdown")
    public void loginPageIsOpenedInHeaderDropdown() {
        loginPage.headerComponent().clickHeaderDropdownButton(HeaderDropdownButton.MY_ACCOUNT_HEADER_DROPDOWN_BUTTON);
        loginPage.headerComponent().clickLoginOrRegistrationFromDropdown(MyAccountDropdownButton.LOGIN_DROPDOWN_BUTTON);
    }



//    String email = PropertyLoader.getProperty("USER_EMAIL");
//    String password = PropertyLoader.getProperty("USER_PASSWORD");
//    log.info(String.format("Entering email %s", email));
//        loginPage.inputDataToInputField(LoginPageInputField.EMAIL_INPUT_FIELD.toString(), email);
//        log.info(String.format("Entering password %s", password));
//        loginPage.inputDataToInputField(LoginPageInputField.PASSWORD_INPUT_FIELD.toString(), password);
//        log.info("Click submit button");
//        loginPage.clickSubmitButton();

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


    @Given("User is logged in on Login Page")
    public void userIsLoggedInOnLoginPage() {
        loginPage.headerComponent().clickHeaderDropdownButton(HeaderDropdownButton.MY_ACCOUNT_HEADER_DROPDOWN_BUTTON);
        log.info("Account dropdown is opening");
        loginPage.headerComponent().clickLoginOrRegistrationFromDropdown(MyAccountDropdownButton.LOGIN_DROPDOWN_BUTTON);
        log.info("Login page is opening");
        String email = PropertyLoader.getProperty("USER_EMAIL");
        String password = PropertyLoader.getProperty("USER_PASSWORD");
        log.info(String.format("Entering email %s", email));
        loginPage.inputDataToInputField(LoginPageInputField.EMAIL_INPUT_FIELD.toString(), email);
        log.info(String.format("Entering password %s", password));
        loginPage.inputDataToInputField(LoginPageInputField.PASSWORD_INPUT_FIELD.toString(), password);
        log.info("Click submit button");
        loginPage.clickSubmitButtonForEnum(LoginPageSubmitButton.SUBMIT_LOGIN_BUTTON);
    }


}
