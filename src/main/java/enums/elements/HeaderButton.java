package enums.elements;

public enum HeaderButton {
    PHONE_HEADER_BUTTON("phone"),
    HEART_HEADER_BUTTON("heart"),
    SHOPPING_CART_HEADER_BUTTON("shopping-cart"),
    SHARE_HEADER_BUTTON("share");

    private final String field;

    HeaderButton(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
