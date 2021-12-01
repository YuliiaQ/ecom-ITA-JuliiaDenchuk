package enums.elements;

public enum LoginPageSubmitButton {
    SUBMIT_LOGIN_BUTTON("Login"),
    CONTINUE_BUTTON("Continue");

    private final String button;

    LoginPageSubmitButton(String button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return button;
    }
}
