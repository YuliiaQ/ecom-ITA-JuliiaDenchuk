package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Getter

public class RegistrationPage extends BasePage {


    private static final String REGISTRATION_FIELD = "//input[@name='%s']";
    private static final String NEWSLETTER_YES_RADIOBUTTON = "//label[@class='radio-inline']/child::input[@value='1']";
    private static final String NEWSLETTER_NO_RADIOBUTTON = "//label[@class='radio-inline']/child::input[@value='0']";
    private static final String PRIVACY_POLICY_CHECKBOX = "//input[@name='agree']";
    private static final String CONTINUE_BUTTON = "//input[@class='btn btn-primary']";
    private static final String INVALID_EMAIL_WARNING = "//div[@class='alert alert-danger alert-dismissible']";
    private static final String EMAIL_DOES_NOT_APPEAR_WARNING = "//div[@class='text-danger']";
    private static final String ALREADY_REGISTERED_EMAIL = "//div[@class='alert alert-danger alert-dismissible']";
    private static final String INCORRECT_PASSWORD = "//div[@class='text-danger']";
    private static final String FIRSTNAME_IS_EMPTY = "//div[@class='text-danger']";

    public void inputDataToRegistrationField(String field, String data) {
        findElementBy(By.xpath(String.format(REGISTRATION_FIELD, field))).sendKeys(data);
    }

    public void clickNewsletterYesRadioButton(){
        findElementBy(By.xpath(NEWSLETTER_YES_RADIOBUTTON)).click();
    }

    public void clickNewsletterNoRadioButton(){
        findElementBy(By.xpath(NEWSLETTER_NO_RADIOBUTTON)).click();
    }

    public void clickPrivacyPolicyCheckbox(){
        findElementBy(By.xpath(PRIVACY_POLICY_CHECKBOX)).click();
    }

    public void clickContinueButton(){
        findElementBy(By.xpath(CONTINUE_BUTTON)).click();
    }

    public String getWarningInvalidEmailMessage(){
        return findElementBy(By.xpath(EMAIL_DOES_NOT_APPEAR_WARNING)).getText();
    }

    public String getMessageOfExistingEmail (){
        return findElementBy(By.xpath(ALREADY_REGISTERED_EMAIL)).getText();
    }
    public String getMessageOfIncorrectPassword (){
        return findElementBy(By.xpath(INCORRECT_PASSWORD)).getText();
    }

    public String getMessageOfEmptyFirstname (){
        return findElementBy(By.xpath(FIRSTNAME_IS_EMPTY)).getText();
    }

}
