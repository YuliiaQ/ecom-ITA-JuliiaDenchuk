package pages;

import org.openqa.selenium.By;

public class YourStorePage extends BasePage {
    private static final String LINKS_YOUR_STORE = "//a[starts-with(text(),'%s')]";

    public void clickLinkYourStore (String field){
        findElementBy(By.xpath(String.format(LINKS_YOUR_STORE, field))).click();
    }

}
