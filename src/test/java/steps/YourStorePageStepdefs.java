package steps;

import enums.elements.AddProductButton;
import enums.elements.ProductCardTitle;
import enums.elements.ProductTitleLink;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.YourStorePage;

public class YourStorePageStepdefs {
    private static final YourStorePage yourStorePage = new YourStorePage();

    @And("I click {} link on product card")
    public void iClickMACBOOK_TITLE_LINKLinkOnProductCard(ProductTitleLink title) {
        yourStorePage.clickProductTitleLink(title);
    }

    @Then("Information product card named {} is opened")
    public void informationProductCardNamedMACBOOK_CARD_TITLEIsOpened(ProductCardTitle title) {
        yourStorePage.isProductCardTitleDisplayed(title);
    }

    @And("I click {} button")
    public void iClickADD_MACBOOK_TO_SHOPPING_CART_BUTTONButton(AddProductButton button) {
        yourStorePage.clickAddProductToShoppingCartButton(button);
    }

    @Then("Message successful adding {string} is displayed")
    public void messageSuccessfulAddingIsDisplayed(String message) {
        String successAlertExpectedMessage = yourStorePage.getSuccessAlertMessage();
        Assertions.assertThat(message).as(String.format("Expected: %s. Actual: %s", message, successAlertExpectedMessage));
    }
}
