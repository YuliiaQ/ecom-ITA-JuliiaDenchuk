package enums.elements;

public enum MyAccountDropdownButton {
    LOGIN_DROPDOWN_BUTTON("Login"),
    REGISTER_DROPDOWN_BUTTON("Register");

    private final String button;

    MyAccountDropdownButton(String button) {
        this.button = button;
    }

    public String getButton() {
        return button;
    }
}
