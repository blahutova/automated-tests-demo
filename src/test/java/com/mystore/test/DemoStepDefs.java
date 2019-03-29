package com.mystore.test;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefs extends TestParent{
	private IndexPage indexPage;
	private LoginPage loginPage;
	private MyAccountPage myAccountPage;
	private WomenPage womenPage;
	private AddItemDialog addItemDialog;
	private CartPage cartPage;

	@Given("User opens the my-store website")
	public void userOpensTheMyStoreWebsite() {
		indexPage = openMyStore();
	}

	@And("^User goes to Sign in page$")
	public void userGoesToSignInPage() {
		loginPage = indexPage.clickOnSignIn();
	}

	@When("^User fills the username: \"([^\"]*)\" and password: \"([^\"]*)\"$")
	public void userFillsTheUsernameAndPassword(String username, String password) {
		loginPage.fillUserName(username).fillPassword(password);
	}

	@And("^User clicks on Sign in button on signing page$")
	public void userClicksOnSignInButtonOnSigningPage() {
		myAccountPage = loginPage.clickSignIn();
	}

	@Then("^The My Account page appears$")
	public void theMyAccountPageAppears() {
		myAccountPage.checkMyAccountPageOpened();
	}

	@And("^User with username: \"([^\"]*)\" and password: \"([^\"]*)\" is signed in$")
	public void userWithUsernameAndPasswordIsSignedIn(String username, String password) {
		loginPage = indexPage.clickOnSignIn();
		loginPage.fillUserName(username).fillPassword(password);
		myAccountPage = loginPage.clickSignIn();
	}

	@And("^User is on Women page$")
	public void userIsOnWomenTShirtPage() {
		womenPage = myAccountPage.goToWomensPage();
	}


	@When("^User adds the item with name \"([^\"]*)\" to shopping cart$")
	public void userOpensTheItemWithNameOnWomenPage(String itemName)  {
		addItemDialog = womenPage.addItemToCart(itemName);
	}

	@Then("^Product was successfully added to your shopping cart message appears$")
	public void productWasSuccessfullyAddedToYourShoppingCartMessageAppears() {
		addItemDialog.checkSuccessfulMessage();
	}

	@And("^User sees the \"([^\"]*)\" item in the Cart summary page$")
	public void userSeesTheItemInTheCartSummaryPage(String itemName) {
		cartPage = addItemDialog.clickProceedToCheckout();
		cartPage.checkItemInList(itemName);
	}

	@And("^User clicks on Sign out$")
	public void userClicksOnSignOut() {
		indexPage.clickOnSignout();
	}

	@And("^User has a \"([^\"]*)\" item in shopping cart$")
	public void userHasAItemInShoppingCart(String itemName) {
		womenPage = myAccountPage.goToWomensPage();
		addItemDialog = womenPage.addItemToCart(itemName);
		cartPage = addItemDialog.clickProceedToCheckout();
		cartPage.checkItemInList(itemName);
	}

	@When("^User click on delete button for \"([^\"]*)\" item$")
	public void userClickOdDeleteButtonForItem(String itemName) {
		cartPage.deleteItem(itemName);
	}

	@Then("^The item with name \"([^\"]*)\" is not in the list on cart summary$")
	public void theItemWithNameIsNotInTheListOnCartSummary(String itemName) {
		cartPage.checkItemNotInList(itemName);
	}

	@Then("^User can't see the View the customer account option in main menu$")
	public void userCanTSeeTheViewTheCustomerAccountOptionInMainMenu() {
		indexPage.checkUserIsLogout();
	}
}
