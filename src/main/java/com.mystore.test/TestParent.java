package com.mystore.test;

import com.codeborne.selenide.Selenide;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParent {

	protected static IndexPage openMyStore() {
		WebDriverManager.chromedriver().version("73.0.3683.68");
		WebDriverManager.chromedriver().setup();
		return Selenide.open("http://automationpractice.com/index.php", IndexPage.class);
	}

}
