package enums.elements;

public enum AddProductButton {
    ADD_MACBOOK_TO_SHOPPING_CART_BUTTON(1),
    ADD_MACBOOK_TO_WISH_LIST_BUTTON(2),
    ADD_MACBOOK_TO_COMPARISON_BUTTON(3),
    ADD_IPHONE_TO_SHOPPING_CART_BUTTON(4),
    ADD_IPHONE_TO_WISH_LIST_BUTTON(5),
    ADD_IPHONE_TO_COMPARISON_BUTTON(6),
    ADD_APPLE_CINEMA_TO_SHOPPING_CART_BUTTON(7),
    ADD_APPLE_CINEMA_TO_WISH_LIST_BUTTON(8),
    ADD_APPLE_CINEMA_TO_COMPARISON_BUTTON(9),
    ADD_CANON_EOS_TO_SHOPPING_CART_BUTTON(10),
    ADD_CANON_EOS_TO_WISH_LIST_BUTTON(11),
    ADD_CANON_EOS_TO_COMPARISON_BUTTON(12);

    private final int button;

    AddProductButton(int button) {
        this.button = button;
    }

    public int getButton() {
        return button;
    }
}
