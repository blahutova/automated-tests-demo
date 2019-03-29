Feature: Automation tests demo
  Test the Sign In, Log out, Adding item to cart and to wishlist features of dummy e-shop website.

  @demo
  Scenario: Sign in functionality.
    Given User opens the my-store website
    And User goes to Sign in page
    When User fills the username: "q2697680@nwytg.net" and password: "hhhhh"
    And User clicks on Sign in button on signing page
    Then The My Account page appears
    And User clicks on Sign out

  @demo
  Scenario: Adding item to the shopping cart
    Given User opens the my-store website
    And User with username: "q2697680@nwytg.net" and password: "hhhhh" is signed in
    And User is on Women page
    When User adds the item with name "Blouse" to shopping cart
    Then Product was successfully added to your shopping cart message appears
    And User sees the "Blouse" item in the Cart summary page
    And User clicks on Sign out


  @demo
  Scenario: Deleting item from the shopping cart
    Given User opens the my-store website
    And User with username: "q2697680@nwytg.net" and password: "hhhhh" is signed in
    And User has a "Faded Short Sleeve T-shirts" item in shopping cart
    When User click on delete button for "Faded Short Sleeve T-shirts" item
    Then The item with name "Faded Short Sleeve T-shirts" is not in the list on cart summary
    And User clicks on Sign out

  @demo
  Scenario: Logout functionality
    Given User opens the my-store website
    And User with username: "q2697680@nwytg.net" and password: "hhhhh" is signed in
    When User clicks on Sign out
    Then User can't see the View the customer account option in main menu




