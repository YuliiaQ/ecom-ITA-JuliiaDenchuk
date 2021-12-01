package enums.elements;

public enum HeaderDropdownButton {
    CURRENCY_HEADER_DROPDOWN_BUTTON("Currency"),
    MY_ACCOUNT_HEADER_DROPDOWN_BUTTON("My Account");

    private final String button;

    HeaderDropdownButton(String button) {
        this.button = button;
    }

    public String getButton() {
        return button;
    }




}
