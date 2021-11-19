package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractBasePage {
    public static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement waitForVisibilityOfElement(WebElement locator) {
        return new WebDriverWait(driver, 200).until(ExpectedConditions.visibilityOf(locator));
    }

    public WebElement findElementBy(By by) {
        return waitForVisibilityOfElement(driver.findElement(by));
    }
}
