package enums.elements;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public enum RegistrationPageInputField {
    FIRSTNAME_REGISTRATION_FIELD("firstname"),
    LASTNAME_REGISTRATION_NAME("lastname"),
    EMAIL_REGISTRATION_FIELD("email"),
    TELEPHONE_REGISTRATION_FIELD("telephone"),
    PASSWORD_REGISTRATION_FIELD("password"),
    CONFIRM_REGISTRATION_FIELD("confirm");

    private final String field;

    @Override
    public String toString(){
        return field;
    }
}
