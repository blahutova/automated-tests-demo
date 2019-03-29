package com.mystore.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
		features = "src/test/resources/com.mystore.test",
		tags = "@demo")
public class RunDemoTests {
}
