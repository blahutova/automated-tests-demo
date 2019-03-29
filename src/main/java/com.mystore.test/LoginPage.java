package com.mystore.test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

public class LoginPage {

	public LoginPage fillUserName(String username){
		$(By.id("email")).shouldBe(visible).setValue(username);
		return this;
	}

	public LoginPage fillPassword(String password){
		$(By.id("passwd")).shouldBe(visible).setValue(password);
		return this;
	}

	public MyAccountPage clickSignIn(){
		$(By.id("SubmitLogin")).shouldBe(visible).click();
		return page(MyAccountPage.class);
	}
}
