package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import com.codeborne.selenide.Selenide;

@Component
public class MainPage extends AbstractPage {

	private static final String URL = "https://www.google.com";
	private static final String SOME_XPATH = "";

	private WebElement getSomeButton() {
		return driver.getElement(By.xpath(SOME_XPATH));
	}

	public void openPage() {
		Selenide.open(URL);
	}

	public void clickSomeButton() {
		getSomeButton().click();
	}

}
