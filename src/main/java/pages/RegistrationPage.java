package pages;

import lombok.Getter;
import org.openqa.selenium.By;

@Getter

public class RegistrationPage extends BasePage {

    private static final String REGISTRATION_FIELD = "//input[@name='%s']";
    private static final String NEWSLETTER_YES_RADIOBUTTON = "//label[@class='radio-inline']/child::input[@value='1']";
    private static final String NEWSLETTER_NO_RADIOBUTTON = "//label[@class='radio-inline']/child::input[@value='0']";
    private static final String PRIVACY_POLICY_CHECKBOX = "//input[@name='agree']";
    private static final String CONTINUE_BUTTON = "//input[@type='submit']";
    private static final String ALERT_DISMISSIBLE_WARNING = "//div[@class='alert alert-danger alert-dismissible']";
    private static final String INVALID_DATA = "//div[@class='text-danger']";
    private static final String ACCOUNT_CREATED = "//h1[text()='Your Account Has Been Created!']";
    private static final String CONTINUE_AFTER_REGISTRATION = "//a[@class='btn btn-primary']";


    public void inputDataToRegistrationField(String field, String data) {
        findElementBy(By.xpath(String.format(REGISTRATION_FIELD, field))).sendKeys(data);
    }

    public void clickNewsletterYesRadioButton() {
        findElementBy(By.xpath(NEWSLETTER_YES_RADIOBUTTON)).click();
    }

    public void clickNewsletterNoRadioButton() {
        findElementBy(By.xpath(NEWSLETTER_NO_RADIOBUTTON)).click();
    }

    public void clickPrivacyPolicyCheckbox() {
        findElementBy(By.xpath(PRIVACY_POLICY_CHECKBOX)).click();
    }

    public void clickContinueButton() {
        findElementBy(By.xpath(CONTINUE_BUTTON)).click();
    }

    public String getAlertDismissibleWarning() {
        return findElementBy(By.xpath(ALERT_DISMISSIBLE_WARNING)).getText();
    }

    public void clickContinueButtonAfterRegistration() {
        findElementBy(By.xpath(CONTINUE_AFTER_REGISTRATION)).click();
    }

    public String getWarningInvalidEmailMessage() {
        return findElementBy(By.xpath(INVALID_DATA)).getText();
    }

}
