package com.herokuapp.configuration;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

@Component
public class DriverFunctions {
	
	public void quitSession() {
		WebDriverRunner.driver().getWebDriver().quit();
	}
	
	public WebElement getElement(By by) {
		wait((Function) -> WebDriverRunner.driver().getWebDriver().findElement(by).isDisplayed());
		return WebDriverRunner.driver().getWebDriver().findElement(by);
	}
	
	public List<WebElement> getElements(By by) {
		wait((Function) -> WebDriverRunner.driver().getWebDriver().findElement(by).isDisplayed());
		return WebDriverRunner.driver().getWebDriver().findElements(by);
	}
	
	public void wait(Function function) {
		WebDriverWait wait = new WebDriverWait(WebDriverRunner.driver().getWebDriver(), 5);
		wait.pollingEvery(500, TimeUnit.MILLISECONDS).until(function);
	}
	
	public void waitForElementToBeClickable(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(WebDriverRunner.driver().getWebDriver(), 5);
		wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
	}
	
	public void waitForElementToBeVisible(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(WebDriverRunner.driver().getWebDriver(), 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
	}
	
	public void waitForElementToBeInvisible(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(WebDriverRunner.driver().getWebDriver(), 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
	}

	public void waitForElementToBeSelected(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(WebDriverRunner.driver().getWebDriver(), 5);
		wait.until(ExpectedConditions.elementToBeSelected(elementLocator));
	}

}
