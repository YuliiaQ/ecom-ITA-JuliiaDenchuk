package tests;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import pages.BasePage;
import pages.HeaderComponent;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    HeaderComponent headerPage;
    RegistrationPage registrationPage;

    private static final String loginErrorExpectedText = "Warning: No match for E-Mail Address and/or Password.";
    private static final String confirmationEmailExpectedMessage = "An email with a confirmation link has been sent your email address.";
    private static final String invalidEmailExpectedWarning = "Warning: The E-Mail Address was not found in our records, please try again!";

//    @Test
//    void loginWithValidEmailValidPasswordField(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
//        loginPage.inputPasswordToEmailField("123123");
//        loginPage.clickSubmitButton();
//        Assertions.assertThat(loginPage.isMyAccountPageTitleDisplayed()).isEqualTo(true);
//    }
//
//    @Test
//    void loginWithValidEmailEmptyPasswordField(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
//        loginPage.inputPasswordToEmailField("");
//        loginPage.clickSubmitButton();
//        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
//        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
//                .isEqualTo(loginErrorExpectedText);
//    }
//
//    @Test
//    void loginWithValidPasswordEmptyEmailField(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("");
//        loginPage.inputPasswordToEmailField("123123");
//        loginPage.clickSubmitButton();
//        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
//        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
//                .isEqualTo(loginErrorExpectedText);
//    }
//
//    @Test
//    void loginWithValidEmailInvalidPasswordField(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
//        loginPage.inputPasswordToEmailField("1234567");
//        loginPage.clickSubmitButton();
//        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
//        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
//                .isEqualTo(loginErrorExpectedText);
//    }
//    @Test
//    void errorAlertValidationWhenEmailIsNotRegistered() {
//        loginPage= new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("test@gmail.com");
//        loginPage.inputPasswordToEmailField("1234");
//        loginPage.clickSubmitButton();
//        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
//        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
//                .isEqualTo(loginErrorExpectedText);
//    }
//    @Test
//    void loginWithValidEmailAndForgottenPasswordLink(){
//        loginPage= new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
//        loginPage.clickForgottenPasswordLink();
//        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
//        loginPage.clickContinueButton();
//        String confirmationEmailActualMessage = loginPage.getConfirmationLinkMessage();
//        Assertions.assertThat(confirmationEmailActualMessage).as("error message is different")
//                .isEqualTo(confirmationEmailExpectedMessage);
//    }
//
//    @Test
//    void loginWithInvalidEmailAndForgottenPassword(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.inputEmailToEmailField("testtt@gmail.com");
//        loginPage.clickForgottenPasswordLink();
//        loginPage.inputEmailToEmailField("testtt@gmail.com");
//        loginPage.clickContinueButton();
//        String invalidEmailActualWarning = loginPage.getWarningInvalidEmailMessage();
//        Assertions.assertThat(invalidEmailActualWarning).as("error message is different")
//                .isEqualTo(invalidEmailExpectedWarning);
//    }
//
//    @Test
//    void forgottenPasswordWithEmptyEmailAndPassword (){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.clickForgottenPasswordLink();
//        loginPage.clickContinueButton();
//        String invalidEmailActualWarning = loginPage.getWarningInvalidEmailMessage();
//        Assertions.assertThat(invalidEmailActualWarning).as("error message is different")
//                .isEqualTo(invalidEmailExpectedWarning);
//    }
//
//    @Test
//    void loginWithInvalidEmailAndForgottenPasswordButton(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.clickForgottenPasswordButton();
//        loginPage.inputEmailToEmailField("testtt@gmail.com");
//        loginPage.clickContinueButton();
//        String invalidEmailActualWarning = loginPage.getWarningInvalidEmailMessage();
//        Assertions.assertThat(invalidEmailActualWarning).as("error message is different")
//                .isEqualTo(invalidEmailExpectedWarning);
//    }
//
//    @Test
//    void loginWithValidEmailAndForgottenPasswordButton(){
//        loginPage = new LoginPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        loginPage.clickForgottenPasswordButton();
//        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
//        loginPage.clickContinueButton();
//        String confirmationEmailActualMessage = loginPage.getConfirmationLinkMessage();
//        Assertions.assertThat(confirmationEmailActualMessage).as("error message is different")
//                .isEqualTo(confirmationEmailExpectedMessage);
//    }
//
//    @Test
//    void unsuccessfulRegistrationWithEmptyEmailField(){
//        headerPage = new HeaderComponent();
//        registrationPage = new RegistrationPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        registrationPage.inputDataToRegistrationField("firstname", "Test");
//        registrationPage.inputDataToRegistrationField("lastname", "Test");
//        registrationPage.inputDataToRegistrationField("telephone", "12345667");
//        registrationPage.inputDataToRegistrationField("password", "1234");
//        registrationPage.inputDataToRegistrationField("confirm", "1234");
//        registrationPage.clickNewsletterYesRadioButton();
//        registrationPage.clickPrivacyPolicyCheckbox();
//        registrationPage.clickContinueButton();
//        String getEmailDoesNotAppearActualMessage = registrationPage.getWarningInvalidEmailMessage();
//        Assertions.assertThat(getEmailDoesNotAppearActualMessage).as("error message is different")
//                .isEqualTo(getEmailDoesNotAppearActualMessage);
//    }
//
//    @Test
//    void successfulRegistrationWithAllFields(){
//        headerPage = new HeaderComponent();
//        registrationPage = new RegistrationPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        registrationPage.inputDataToRegistrationField("firstname", "Test");
//        registrationPage.inputDataToRegistrationField("lastname", "Test");
//        registrationPage.inputDataToRegistrationField("email", "sajowi9588@epeva.com");
//        registrationPage.inputDataToRegistrationField("telephone", "12345667");
//        registrationPage.inputDataToRegistrationField("password", "123123");
//        registrationPage.inputDataToRegistrationField("confirm", "123123");
//        registrationPage.clickNewsletterYesRadioButton();
//        registrationPage.clickPrivacyPolicyCheckbox();
//        registrationPage.clickContinueButton();
//        String getEmailIsAlreadyExistActualMessage = registrationPage.getMessageOfExistingEmail();
//        Assertions.assertThat(getEmailIsAlreadyExistActualMessage).as("error message is different")
//                .isEqualTo(getEmailIsAlreadyExistActualMessage);
//    }
//
//    @Test
//    void failedRegistrationWhenPasswordFieldIsEmpty(){
//        headerPage = new HeaderComponent();
//        registrationPage = new RegistrationPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        registrationPage.inputDataToRegistrationField("firstname", "Test");
//        registrationPage.inputDataToRegistrationField("lastname", "Test");
//        registrationPage.inputDataToRegistrationField("telephone", "12345667");
//        registrationPage.inputDataToRegistrationField("email", "sajowi9588@epeva.com");
//        registrationPage.clickNewsletterYesRadioButton();
//        registrationPage.clickPrivacyPolicyCheckbox();
//        registrationPage.clickContinueButton();
//        String getIncorrectPasswordActualMessage = registrationPage.getMessageOfIncorrectPassword();
//        Assertions.assertThat(getIncorrectPasswordActualMessage).as("error message is different")
//                .isEqualTo(getIncorrectPasswordActualMessage);
//    }
//
//    @Test
//    void failedRegistrationWhenFirstNameIsEmpty (){
//        headerPage = new HeaderComponent();
//        registrationPage = new RegistrationPage();
//        loginPage.headerComponent().clickAccountDropdown();
//        loginPage.headerComponent().clickLoginFromDropdown();
//        registrationPage.inputDataToRegistrationField("lastname", "Test");
//        registrationPage.inputDataToRegistrationField("email", "sajowi9588@epeva.com");
//        registrationPage.inputDataToRegistrationField("telephone", "12345667");
//        registrationPage.inputDataToRegistrationField("password", "123123");
//        registrationPage.inputDataToRegistrationField("confirm", "123123");
//        registrationPage.clickNewsletterYesRadioButton();
//        registrationPage.clickPrivacyPolicyCheckbox();
//        registrationPage.clickContinueButton();
//        String getMessageOfEmptyFirstnameActualMessage = registrationPage.getMessageOfEmptyFirstname();
//        Assertions.assertThat(getMessageOfEmptyFirstnameActualMessage).as("error message is different")
//                .isEqualTo(getMessageOfEmptyFirstnameActualMessage);
//    }
}
