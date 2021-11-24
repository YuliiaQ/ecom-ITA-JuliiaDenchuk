package pages;

import org.openqa.selenium.By;

public class YourStorePage extends BasePage{

    private static final String YOUR_STORE_PAGE_TITLE = "//h3[text()='Featured']";
    private static final String PRODUCT_TITLE_LINK = "//a[text()='%s']";
    private static final String PRODUCT_CARD_TITLE = "//h1[text()='%s']";
    private static final String SHOPPING_CART_BUTTON = "//span[@id='cart-total']";
    private static final String ADD_PRODUCT_TO_SOMETHING_BUTTON = "//h3[text()='Featured']//following::button[%d]";
    private static final String SUCCESS_ALERT_MESSAGE = "//div[contains(text(),'Success')]";

    public boolean isYourStorePageTitleDisplayed(){
        return findElementBy(By.xpath(YOUR_STORE_PAGE_TITLE)).isDisplayed();
    }
    public void clickProductTitleLink(String title){
        findElementBy(By.xpath(String.format(PRODUCT_TITLE_LINK, title))).click();
    }
    public boolean isProductCardTitleDisplayed(String title){
        return findElementBy(By.xpath(String.format(PRODUCT_CARD_TITLE, title))).isDisplayed();
    }
    public void clickShoppingCartButton(){
        findElementBy(By.xpath(SHOPPING_CART_BUTTON)).click();
    }
    public void clickAddProductToShoppingCartButton(int number){
        findElementBy(By.xpath(String.format(ADD_PRODUCT_TO_SOMETHING_BUTTON, number))).click();
    }
    public String getSuccessAlertMessage(){
        return findElementBy(By.xpath(SUCCESS_ALERT_MESSAGE)).getText();
    }
}