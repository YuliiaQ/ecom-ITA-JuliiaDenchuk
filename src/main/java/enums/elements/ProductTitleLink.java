package enums.elements;

public enum ProductTitleLink {
    MACBOOK_TITLE_LINK("MacBook"),
    IPHONE_TITLE_LINK("iPhone"),
    APPLE_TITLE_LINK("Apple Cinema 30\""),
    CANON_TITLE_LINK("Canon EOS 5D");

    private final String title;

    ProductTitleLink(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}