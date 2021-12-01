package enums.elements;

public enum ProductCardTitle {
    MACBOOK_CARD_TITLE("MacBook"),
    IPHONE_CARD_TITLE("iPhone"),
    APPLE_CINEMA_CARD_TITLE("Apple Cinema 30\""),
    CANON_EOS_CARD_TITLE("Canon EOS 5D");

    private final String title;

    ProductCardTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
