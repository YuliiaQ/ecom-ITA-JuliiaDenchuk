package pages;

import enums.elements.YourStoreNavbarButton;
import org.openqa.selenium.By;

public class YourStoreNavbarComponent extends AbstractBasePage {

    private static final String YOUR_STORE_NAVBAR_BUTTON = "//a[text()='%s']";

    public void clickTopNavbarButton (YourStoreNavbarButton button){
        findElementBy(By.xpath(String.format(YOUR_STORE_NAVBAR_BUTTON, button.toString()))).click();
    }


}