Feature: As an unregistered user
  I want to register to the system with my credentials
  So that I can have access to store
@login
  Scenario: Successful registration message is displayed after successful registration
    Given Registration page is opened in header dropdown
    When I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'email' data 'iaaa.hukvjhvj@gmail.com' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '123123' on Registration page
    And I click radiobutton Yes in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    And I click button Continue after Registration
    Then My Account page is displayed

#  Scenario: [ENUM] Successful registration message is displayed after successful registration
#    Given Registration page is opened in header dropdown
#    When I enter in the field enum FIRSTNAME_REGISTRATION_FIELD data 'First' on Registration page
#    And I enter in the field enum LASTNAME_REGISTRATION_FIELD data 'Last' on Registration page
#    And I enter in the field enum EMAIL_REGISTRATION_FIELD data 'lam.dvjhvjkm@gmail.com' on Registration page
#    And I enter in the field enum TELEPHONE_REGISTRATION_FIELD data '067-123-45-67' on Registration page
#    And I enter in the field enum PASSWORD_REGISTRATION_FIELD data 'First' on Registration page
#    And I enter in the field enum CONFIRM_PASSWORD_REGISTRATION_FIELD data 'First' on Registration page
#    And I click radiobutton Yes in the field Subscribe
#    And I click Agree with Privacy Policy
#    And I click button Continue
#    And I click button Continue after Registration
#    Then My Account page is displayed
#
#  Scenario: [Data table] Successful registration message is displayed after successful registration
#    Given Registration page is opened in header dropdown
#    When I enter in the field data on Registration page
#      | fieldName | inputData       |
#      | firstname | First           |
#      | lastname  | Last            |
#      | email     | lavjbvhkbw.dm@gmail.com |
#      | telephone | 067-12-45-673   |
#      | password  | 123456          |
#      | confirm   | 123456          |
#    And I click radiobutton Yes in the field Subscribe
#    And I click Agree with Privacy Policy
#    And I click button Continue
#    And I click button Continue after Registration
#    Then My Account page is displayed


    Scenario: Failed registration message is displayed after failed registration with existing email
      Given Registration page is opened in header dropdown
      When I enter in the field 'firstname' data 'First' on Registration page
      And I enter in the field 'lastname' data 'First' on Registration page
      And I enter in the field 'email' data 'julia.debgkhnchuk@gmail.com' on Registration page
      And I enter in the field 'telephone' data '0981234545' on Registration page
      And I enter in the field 'password' data '123123' on Registration page
    #confirm password
      And I enter in the field 'confirm' data '123123' on Registration page
      And I click radiobutton Yes in the field Subscribe
      And I click Agree with Privacy Policy
      And I click button Continue
      Then Message 'Warning: E-Mail Address is already registered!' is displayed

  Scenario: Failed registration message is displayed after failed registration with empty email field
    Given Registration page is opened in header dropdown
    When I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '123123' on Registration page
    And I click radiobutton Yes in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    Then Message invalid data is displayed

  Scenario: Failed registration message is displayed after failed registration with empty password field
    Given Registration page is opened in header dropdown
    When I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'email' data 'julia.denkbkbchk@gmail.com' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I click radiobutton Yes in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    Then Message invalid data is displayed

  Scenario: Failed registration message is displayed after failed registration with empty firstname field
    Given Registration page is opened in header dropdown
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'email' data 'julia.denchbkbjbkk@gmail.com' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '123123' on Registration page
    And I click radiobutton Yes in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    Then Message invalid data is displayed

  Scenario: Failed registration message is displayed after failed registration with empty lastname field
    Given Registration page is opened in header dropdown
    And I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'email' data 'julia.denvjmbchk@gmail.com' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '123123' on Registration page
    And I click radiobutton No in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    Then Message invalid data is displayed

  Scenario: Failed registration message is displayed after failed registration with empty telephone field
    Given Registration page is opened in header dropdown
    And I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'email' data 'julia.denjvhjbchk@gmail.com' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '123123' on Registration page
    And I click radiobutton No in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    Then Message invalid data is displayed

  Scenario: Failed registration message is displayed after failed registration when confirmation passport is not the same as the passport
    Given Registration page is opened in header dropdown
    And I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I enter in the field 'email' data 'julia.denhvbkbchk@gmail.com' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '1231' on Registration page
    And I click radiobutton No in the field Subscribe
    And I click Agree with Privacy Policy
    And I click button Continue
    Then Message invalid data is displayed

  Scenario: Failed registration message is displayed after failed registration when checkbox with Privacy Policy is not set
    Given Registration page is opened in header dropdown
    And I enter in the field 'firstname' data 'First' on Registration page
    And I enter in the field 'lastname' data 'First' on Registration page
    And I enter in the field 'telephone' data '0981234545' on Registration page
    And I enter in the field 'email' data 'julia.dencbjhbbjhk@gmail.com' on Registration page
    And I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And I enter in the field 'confirm' data '123123' on Registration page
    And I click radiobutton No in the field Subscribe
    And I click button Continue
    Then Message 'Warning: You must agree to the Privacy Policy!' is displayed


