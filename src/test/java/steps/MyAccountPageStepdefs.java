package steps;

import enums.elements.YourStoreNavbarButton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.MyAccountPage;

public class MyAccountPageStepdefs {
    private static final MyAccountPage myAccountPage = new MyAccountPage();
    @Then("My Account page is displayed")
    public void myAccountPageIsDisplayed() {
        Assertions.assertThat(myAccountPage.isMyAccountHeaderVisible()).isEqualTo(true);
    }

    @And("I click {} on Your Store Navbar on My Account Page")
    public void iClickYOUR_STORE_LINKOnYourStoreNavbarOnMyAccountPage(YourStoreNavbarButton button) {
        myAccountPage.yourStoreNavbarComponent().clickTopNavbarButton(button);
    }

}
