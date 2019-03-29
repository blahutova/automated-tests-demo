package com.mystore.test;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

public class CartPage {
	public CartPage checkItemInList(String itemName){
		$(By.xpath("//a[contains(text(), '" + itemName + "')]")).shouldBe(Condition.enabled);
		return this;
	}

	public CartPage checkItemNotInList(String itemName){
		$(By.xpath("//a[contains(text(), '" + itemName + "')]")).shouldNotBe(Condition.enabled);
		return this;
	}

	public CartPage deleteItem(String itemName){
		$(By.xpath("//i[@class='icon-trash']")).shouldBe(Condition.visible).click();
		return this;
	}
}
