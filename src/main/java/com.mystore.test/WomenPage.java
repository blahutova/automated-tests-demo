package com.mystore.test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

public class WomenPage {
	public AddItemDialog addItemToCart(String itemName){
		$(By.xpath("//a[@class='product_img_link' and @title='" + itemName + "']")).shouldBe(Condition.visible).hover();
		$$(By.xpath("//span[contains(text(), 'Add to cart')]")).filter(Condition.visible).get(0).click();
		return page(AddItemDialog.class);
	}


}
