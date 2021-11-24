package tests;

import driver.DriverInit;
import lombok.Getter;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
@Getter
public class BaseTest {
    @Getter
    private WebDriver driver;
    DriverInit driverInit = new DriverInit();

    @BeforeEach
    public void setDriver(){
        driver = driverInit.setDriver();
        BasePage.setDriver(driver);
    }

    @AfterEach
    public void closeDriver(){
        driverInit.closeDriver();
    }
}
