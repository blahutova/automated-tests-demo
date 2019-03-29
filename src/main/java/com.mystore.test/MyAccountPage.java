package com.mystore.test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class MyAccountPage extends IndexPage {
	public MyAccountPage checkMyAccountPageOpened(){
		$(By.xpath("//h1[contains(text(), 'My account')]")).shouldBe(visible);
		return this;
	}
}
