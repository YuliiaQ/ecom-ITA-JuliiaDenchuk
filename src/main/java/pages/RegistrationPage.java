package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

    private final WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver=driver;
    }

    private static final String LOGIN_PAGE_LINK = "//div[@id='content']//following::a[text()='login page']";
    private static final String REGISTRATION_FIRST_NAME_FIELD = "//input[@id='input-firstname']";
    private static final String REGISTRATION_LAST_NAME_FIELD = "//input[@id='input-lastname']";
    private static final String REGISTRATION_EMAIL_FIELD = "//input[@id='input-email']";
    private static final String REGISTRATION_TELEPHONE_FIELD = "//input[@id='input-telephone']";
    private static final String REGISTRATION_PASSWORD_FIELD = "//input[@id='input-password']";
    private static final String REGISTRATION_PASSWORD_CONFIRM_FIELD = "//input[@id='input-confirm']";
    private static final String REGISTRATION_SUBSCRIPTION_FIELD = "//input[@type='radio']";//specify
    private static final String REGISTRATION_SUBSCRIPTION_DISAGREEMENT = "//input[@type='radio']";
    private static final String PRIVACY_POLICY_LINK = "//a[@class='agree']";
    private static final String PRIVACY_POLICY_CHECKBOX = "//input[@type='checkbox']";
    private static final String CONTINUE_BUTTON = "//input[@class='btn btn-primary']";

    public void inputFirstNameToField(String firstName) {

        findElementBy(By.id(REGISTRATION_FIRST_NAME_FIELD)).sendKeys(firstName);
    }

    public void inputLastNameToField(String lastName) {

        findElementBy(By.id(REGISTRATION_LAST_NAME_FIELD)).sendKeys(lastName);
    }

    public void inputEmailToEmailField(String email) {

        findElementBy(By.id(REGISTRATION_EMAIL_FIELD)).sendKeys(email);
    }

    public void clickRegistrationFirstNameInput(){
        findElementBy(By.xpath(REGISTRATION_FIRST_NAME_FIELD)).click();
    }

    public void clickRegistrationLastNameInput(){
        findElementBy(By.xpath(REGISTRATION_LAST_NAME_FIELD)).click();
    }

    public void clickRegistrationEmailInput(){
        findElementBy(By.xpath(REGISTRATION_EMAIL_FIELD)).click();
    }

    public void clickRegistrationTelephone(){
        findElementBy(By.xpath(REGISTRATION_TELEPHONE_FIELD)).click();
    }

    public void clickRegistrationPasswordInput(){
        findElementBy(By.xpath(REGISTRATION_PASSWORD_FIELD)).click();
    }

    public void clickRegistrationPasswordConfirm(){
        findElementBy(By.xpath(REGISTRATION_PASSWORD_CONFIRM_FIELD)).click();
    }

    public void clickRegistrationSubscriptionAgreement(){
        findElementBy(By.xpath(REGISTRATION_SUBSCRIPTION_FIELD)).click();
    }

    public void clickRegistrationSubscriptionDisagreement(){
        findElementBy(By.xpath(REGISTRATION_SUBSCRIPTION_DISAGREEMENT)).click();
    }

    public void clickPrivacyPolicy(){
        findElementBy(By.xpath(PRIVACY_POLICY_LINK)).click();
    }

    public void clickPrivacyPolicyCheckbox(){
        findElementBy(By.xpath(PRIVACY_POLICY_CHECKBOX)).click();
    }

    public void clickContinueButton(){
        findElementBy(By.xpath(CONTINUE_BUTTON)).click();
    }
}
