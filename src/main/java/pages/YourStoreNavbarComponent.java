package pages;

import org.openqa.selenium.By;

public class YourStoreNavbarComponent extends AbstractBasePage {

    private static final String TOP_NAVBAR_BUTTON = "//a[text()='%s']";

    public void clickTopNavbarButton (String button){
        findElementBy(By.xpath(String.format(TOP_NAVBAR_BUTTON, button))).click();
    }


}