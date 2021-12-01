package enums.elements;

public enum YourStoreNavbarButton {
    YOUR_STORE_LINK("Your Store"),
    DESKTOPS_NAVBAR_BUTTON("Desktops"),
    LAPTOPS_NAVBAR_BUTTON("Laptops & Notebooks"),
    COMPONENTS_NAVBAR_BUTTON("Components"),
    TABLETS_NAVBAR_BUTTON("Tablets"),
    SOFTWARE_NAVBAR_BUTTON("Software"),
    PHONES_NAVBAR_BUTTON("Phones & PDAs"),
    CAMERAS_NAVBAR_BUTTON("Cameras"),
    MP3_NAVBAR_BUTTON("MP3 Players");


    private final String button;

    YourStoreNavbarButton(String button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return button;
    }
}