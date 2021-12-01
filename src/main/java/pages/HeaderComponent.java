package pages;

import enums.elements.HeaderDropdownButton;
import enums.elements.MyAccountDropdownButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderComponent extends AbstractBasePage {

    private static final String CURRENCY_DROPDOWN = "//button[@name='%s']";
    private static final String LOGIN_OR_REGISTRATION_DROPDOWN_BUTTON = "//li/child::a[text()='%s']";
    private static final String HEADER_DROPDOWN_BUTTON = "//span[text()='%s']";
    private static final String HEADER_BUTTON = "//i[contains(@class,'%s')]";


    public void clickHeaderDropdownButton(HeaderDropdownButton button) {
        findElementBy(By.xpath(String.format(HEADER_DROPDOWN_BUTTON, button.getButton()))).click();
    }

    public void clickHeaderButton(String button, String data) {
        findElementBy(By.xpath(String.format(HEADER_BUTTON, button))).click();
    }

    public void clickCurrencyDropdown(String button) {
        findElementBy(By.xpath(String.format(HEADER_DROPDOWN_BUTTON, button))).click();
    }

    public void clickLoginOrRegistrationFromDropdown(MyAccountDropdownButton button) {
        findElementBy(By.xpath(String.format(LOGIN_OR_REGISTRATION_DROPDOWN_BUTTON, button.getButton()))).click();
    }

}
