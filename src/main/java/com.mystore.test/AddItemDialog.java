package com.mystore.test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

public class AddItemDialog {
	public AddItemDialog checkSuccessfulMessage(){
		$(By.xpath("//i[@class='icon-ok']")).shouldBe(Condition.visible);
		return this;
	}

	public CartPage clickProceedToCheckout(){
		$(By.xpath("//a[@title='Proceed to checkout']")).shouldBe(Condition.visible).click();
		return page(CartPage.class);
	}
}
