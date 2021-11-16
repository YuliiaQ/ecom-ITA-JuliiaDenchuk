package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private static final String MY_ACCOUNT_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String LOGIN_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Login']";
    private static final String EMAIL_INPUT_FIELD = "input-email";
    private static final String PASSWORD_INPUT_FIELD = "password";
    private static final String SUBMIT_LOGIN_BUTTON = "//input[@type='submit']";
    private static final String LOGIN_ERROR_ALERT = "//div[contains(@class, 'alert')]";
    private static final String MY_ACCOUNT_PAGE_TITLE = "//a[text()='Your Store']";
    private static final String FORGOTTEN_PASSWORD_LINK = "//a[text()='Forgotten Password']";
    private static final String CONTINUE_BUTTON = "//input[@class='btn btn-primary']";
    private static final String EMAIL_WITH_CONFIRMATION_LINK_MESSAGE = "//div[@class='alert alert-success alert-dismissible']";
    private static final String INVALID_EMAIL_WARNING = "//div[@class='alert alert-danger alert-dismissible']";
    private static final String FORGOTTEN_PASSWORD_BUTTON = "//div[@class='list-group']//following::a[text()='Forgotten Password']";

    public void clickAccountDropdown() {
        findElementBy(By.xpath(MY_ACCOUNT_BUTTON)).click();
    }

    public void clickLoginFromDropdown() {
        findElementBy(By.xpath(LOGIN_DROPDOWN_BUTTON)).click();
    }

    public void inputEmailToEmailField(String email) {

        findElementBy(By.id(EMAIL_INPUT_FIELD)).sendKeys(email);
    }

    public void inputPasswordToEmailField(String password) {
        findElementBy(By.name(PASSWORD_INPUT_FIELD)).sendKeys(password);
    }

    public void clickSubmitButton() {
        findElementBy(By.xpath(SUBMIT_LOGIN_BUTTON)).click();
    }

    public String getLoginErrorActualMessage() {

        return findElementBy(By.xpath(LOGIN_ERROR_ALERT)).getText();
    }

    public boolean isMyAccountPageTitleDisplayed (){
        return findElementBy(By.xpath(MY_ACCOUNT_PAGE_TITLE)).isDisplayed();
    }

    public void clickForgottenPasswordLink (){
        findElementBy(By.xpath(FORGOTTEN_PASSWORD_LINK)).click();
    }

    public void clickContinueButton(){
        findElementBy(By.xpath(CONTINUE_BUTTON)).click();
    }

    public String getConfirmationLinkMessage (){
        return findElementBy(By.xpath(EMAIL_WITH_CONFIRMATION_LINK_MESSAGE)).getText();
    }

    public String getWarningInvalidEmailMessage(){
        return findElementBy(By.xpath(INVALID_EMAIL_WARNING)).getText();
    }

    public void clickForgottenPasswordButton(){
        findElementBy(By.xpath(FORGOTTEN_PASSWORD_BUTTON)).click();
    }
}
