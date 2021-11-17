package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage{

    private final WebDriver driver;

    public HeaderPage(WebDriver driver){
        this.driver=driver;
    }

    private static final String CURRENCY_BUTTON = "//div[@class='btn-group open']";
    private static final String EURO_DROPDOWN = "//button[@name='EUR']";
    private static final String POUND_DROPDOWN = "//button[@name='GBP']";
    private static final String DOLLAR_DROPDOWN = "/button[@name='USD']";
    private static final String TELEPHONE = "//i[@class='fa fa-phone']";
    private static final String CONTACT_PAGE = "//div[@id='content']//following::h1[text()='Contact Us']";
    private static final String MY_ACCOUNT_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String LOGIN_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Login']";
    private static final String REGISTER_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Register']";
    private static final String REGISTER_PAGE = "//div[@id='content']//following::h1[text()='Register Account']";
    private static final String WISHLIST = "//i[@class='fa fa-heart']";
    private static final String SHOPPING_CART = "//i[@class='fa fa-shopping-cart']";//нужно уточнить какая именно инонка
    private static final String SHOPPING_CART_PAGE = "//div[@id='content']//following::h1[text()='Shopping Cart']";
    private static final String CHECKOUT = "//i[@class='fa fa-share']";

    public void clickCurrencyButton(){
        findElementBy(By.xpath(CURRENCY_BUTTON)).click();
    }

    public void clickEuroFromDropdown(){
        findElementBy(By.xpath(EURO_DROPDOWN)).click();
    }

    public void clickPoundFromDropdown(){
        findElementBy(By.xpath(POUND_DROPDOWN)).click();
    }

    public void clickDollarFromDropdown(){
        findElementBy(By.xpath(DOLLAR_DROPDOWN)).click();
    }

    public void clickContactButton(){
        findElementBy(By.xpath(TELEPHONE)).click();
    }

    public boolean isContactPageTitleDisplayed (){
        return findElementBy(By.xpath(CONTACT_PAGE)).isDisplayed();
    }
    public void clickAccountDropdown() {
        findElementBy(By.xpath(MY_ACCOUNT_BUTTON)).click();
    }

    public void clickLoginFromDropdown() {
        findElementBy(By.xpath(LOGIN_DROPDOWN_BUTTON)).click();
    }

    public void clickRegisterFromDropdown() {
        findElementBy(By.xpath(REGISTER_DROPDOWN_BUTTON)).click();
    }

    public boolean isMyAccountPageTitleDisplayed (){
        return findElementBy(By.xpath(CONTACT_PAGE)).isDisplayed();
    }

    public boolean isRegisterPageTitleDisplayed (){
        return findElementBy(By.xpath(REGISTER_PAGE)).isDisplayed();
    }

    public void clickWishlistButton(){
        findElementBy(By.xpath(WISHLIST)).click();
    }

    public void clickShoppingCartButton(){
        findElementBy(By.xpath(SHOPPING_CART)).click();
    }

    public boolean isChoppingCartPageTitleDisplayed (){
        return findElementBy(By.xpath(SHOPPING_CART_PAGE)).isDisplayed();
    }

    public void clickCheckoutButton(){
        findElementBy(By.xpath(CHECKOUT)).click();
    }



}
