package tests;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.assertj.core.api.Assertions;
import pages.BasePage;
import pages.LoginPage;

public class LoginTest extends BasePage {
    LoginPage loginPage;

    private static final String loginErrorExpectedText = "Warning: No match for E-Mail Address and/or Password.";
    private static final String confirmationEmailExpectedMessage = "An email with a confirmation link has been sent your email address.";
    private static final String invalidEmailExpectedWarning = "Warning: The E-Mail Address was not found in our records, please try again!";

    @Test
    void loginWithValidEmailValidPasswordField(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.inputPasswordToEmailField("123123");
        loginPage.clickSubmitButton();
        Assertions.assertThat(loginPage.isMyAccountPageTitleDisplayed()).isEqualTo(true);
    }

    @Test
    void loginWithValidEmailEmptyPasswordField(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.inputPasswordToEmailField("");
        loginPage.clickSubmitButton();
        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
                .isEqualTo(loginErrorExpectedText);
    }

    @Test
    void loginWithValidPasswordEmptyEmailField(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("");
        loginPage.inputPasswordToEmailField("123123");
        loginPage.clickSubmitButton();
        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
                .isEqualTo(loginErrorExpectedText);
    }

    @Test
    void loginWithValidEmailInvalidPasswordField(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.inputPasswordToEmailField("1234567");
        loginPage.clickSubmitButton();
        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
                .isEqualTo(loginErrorExpectedText);
    }
    @Test
    void errorAlertValidationWhenEmailIsNotRegistered() {
        loginPage= new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("test@gmail.com");
        loginPage.inputPasswordToEmailField("1234");
        loginPage.clickSubmitButton();
        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
                .isEqualTo(loginErrorExpectedText);
    }
    @Test
    void loginWithValidEmailAndForgottenPasswordLink(){
        loginPage= new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.clickForgottenPasswordLink();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.clickContinueButton();
        String confirmationEmailActualMessage = loginPage.getConfirmationLinkMessage();
        Assertions.assertThat(confirmationEmailActualMessage).as("error message is different")
                .isEqualTo(confirmationEmailExpectedMessage);
    }

    @Test
    void loginWithInvalidEmailAndForgottenPassword(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("testtt@gmail.com");
        loginPage.clickForgottenPasswordLink();
        loginPage.inputEmailToEmailField("testtt@gmail.com");
        loginPage.clickContinueButton();
        String invalidEmailActualWarning = loginPage.getWarningInvalidEmailMessage();
        Assertions.assertThat(invalidEmailActualWarning).as("error message is different")
                .isEqualTo(invalidEmailExpectedWarning);
    }

    @Test
    void forgottenPasswordWithEmptyEmailAndPassword (){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.clickForgottenPasswordLink();
        loginPage.clickContinueButton();
        String invalidEmailActualWarning = loginPage.getWarningInvalidEmailMessage();
        Assertions.assertThat(invalidEmailActualWarning).as("error message is different")
                .isEqualTo(invalidEmailExpectedWarning);
    }

    @Test
    void loginWithInvalidEmailAndForgottenPasswordButton(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.clickForgottenPasswordButton();
        loginPage.inputEmailToEmailField("testtt@gmail.com");
        loginPage.clickContinueButton();
        String invalidEmailActualWarning = loginPage.getWarningInvalidEmailMessage();
        Assertions.assertThat(invalidEmailActualWarning).as("error message is different")
                .isEqualTo(invalidEmailExpectedWarning);
    }

    @Test
    void loginWithValidEmailAndForgottenPasswordButton(){
        loginPage = new LoginPage(driver);
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.clickForgottenPasswordButton();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.clickContinueButton();
        String confirmationEmailActualMessage = loginPage.getConfirmationLinkMessage();
        Assertions.assertThat(confirmationEmailActualMessage).as("error message is different")
                .isEqualTo(confirmationEmailExpectedMessage);
    }
}
