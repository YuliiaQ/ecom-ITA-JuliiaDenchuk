package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import driver.DriverInit;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
@Getter
public class Hook {
    private WebDriver driver;

    @Before
    public void getDriver() {
        driver = new DriverInit().setDriver();
        BasePage.setDriver(driver);
    }

    @After
    public void quitDriver() {
        if (driver != null)
            BasePage.getDriver().quit();
    }
}

