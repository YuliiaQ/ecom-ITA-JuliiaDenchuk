package steps;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.LoginPage;

public class YourStorePageStepdefs {
    private static final LoginPage loginPage = new LoginPage();
    @Then("Store page is displayed")
    public void storePageIsDisplayed() {
        Assertions.assertThat(loginPage.isMyAccountPageTitleDisplayed()).isEqualTo(true);
    }
}
