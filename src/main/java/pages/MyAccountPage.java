package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    private static final String LINKS_YOUR_STORE = "//a[starts-with(text(),'%s')]";
    private static final String MY_ACCOUNT_HEADER ="//h2[text()='My Account']";

    public void clickLinksYourStore (String field){
        findElementBy(By.xpath(String.format(LINKS_YOUR_STORE, field))).click();
    }

    public boolean isMyAccountHeaderVisible(){
        return findElementBy(By.xpath(MY_ACCOUNT_HEADER)).isDisplayed();
    }

}
