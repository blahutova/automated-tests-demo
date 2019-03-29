# Automated tests demo for Open School 2019

These tests are showing the power of automation. This demo was presented on Red Hat Open School 2019.
Tests are written in Java language and frameworks:
* **Selenide**: interacting with elements on web page
* **Cucumber**: nice representation of test steps

In this test suite, we automated 4 basic test scenarios for dummy e-shop site: http://automationpractice.com/index.php

You can clone this project and run the tests with running:
```
mvn install -Dbrowser=chrome -Dselenide.timeout=20000 -Dselenide.browserSize=1920x1080
```
