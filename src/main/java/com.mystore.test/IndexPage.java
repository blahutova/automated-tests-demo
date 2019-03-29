package com.mystore.test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

public class IndexPage {
	public LoginPage clickOnSignIn(){
		$(By.xpath("//a[@class='login']")).shouldBe(visible).click();
		return page(LoginPage.class);
	}

	public WomenPage goToWomensPage(){
		$(By.xpath("//a[contains(text(), 'Women')]")).shouldBe(visible).click();
		return page(WomenPage.class);
	}

	public LoginPage clickOnSignout(){
		$(By.xpath("//a[@class='logout']")).shouldBe(visible).click();
		return page(LoginPage.class);
	}

	public IndexPage checkUserIsLogout(){
		$(By.xpath("//a[@title='View my customer account']")).shouldNotBe(visible);
		return this;
	}
}
