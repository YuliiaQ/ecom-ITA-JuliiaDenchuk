package pages;
import enums.elements.LoginPageInputField;
import enums.elements.LoginPageSubmitButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final String MY_ACCOUNT_HEADER_DROPDOWN_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String LOGIN_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Login']";
    private static final String LOGIN_PAGE_INPUT_FIELD = "//input[@name='%s']";
    private static final String LOGIN_PAGE_SUBMIT_BUTTON = "//input[@value='%s']";
    private static final String LOGIN_ERROR_ALERT = "//div[contains(@class, 'alert')]";
    private static final String MY_ACCOUNT_PAGE_TITLE = "//a[text()='Your Store']";
    private static final String FORGOTTEN_PASSWORD_LINK = "//a[text()='Forgotten Password']";
//    private static final String CONTINUE_BUTTON = "//input[@class='btn btn-primary']";
    private static final String EMAIL_WITH_CONFIRMATION_LINK_MESSAGE = "//div[@class='alert alert-success alert-dismissible']";
    private static final String INVALID_EMAIL_WARNING = "//div[@class='alert alert-danger alert-dismissible']";
    private static final String FORGOTTEN_PASSWORD_BUTTON = "//div[@class='list-group']//following::a[text()='Forgotten Password']";

    public void clickAccountDropdown() {
        findElementBy(By.xpath(MY_ACCOUNT_HEADER_DROPDOWN_BUTTON)).click();
    }

    public void clickLoginFromDropdown() {
        findElementBy(By.xpath(LOGIN_DROPDOWN_BUTTON)).click();
    }

    public void clickSubmitButtonForEnum(LoginPageSubmitButton button) {
        findElementBy(By.xpath(String.format(LOGIN_PAGE_SUBMIT_BUTTON, button.toString()))).click();
    }

    public void clickSubmitButton(String button) {
        findElementBy(By.xpath(String.format(LOGIN_PAGE_SUBMIT_BUTTON, button))).click();
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

//    public void clickContinueButton(){
//        findElementBy(By.xpath(CONTINUE_BUTTON)).click();
//    }

    public String getConfirmationLinkMessage (){
        return findElementBy(By.xpath(EMAIL_WITH_CONFIRMATION_LINK_MESSAGE)).getText();
    }

    public String getWarningInvalidEmailMessage(){
        return findElementBy(By.xpath(INVALID_EMAIL_WARNING)).getText();
    }

    public void clickForgottenPasswordButton(){
        findElementBy(By.xpath(FORGOTTEN_PASSWORD_BUTTON)).click();
    }

    public void inputDataToInputField (String field, String data){
        findElementBy(By.xpath(String.format(LOGIN_PAGE_INPUT_FIELD, field))).sendKeys(data);
    }

    public void inputDataToInputFieldForEnum (LoginPageInputField field, String data){
        findElementBy(By.xpath(String.format(LOGIN_PAGE_INPUT_FIELD, field.toString()))).sendKeys(data);
    }


    public void inputDataToInputFieldWithTable(String field, String data) {
        findElementBy(By.xpath(String.format(LOGIN_PAGE_INPUT_FIELD, field))).sendKeys(data);
    }
}
