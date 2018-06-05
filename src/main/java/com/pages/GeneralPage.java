package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.By;

public class GeneralPage extends AbstractPage {
	
	public void waitUntilContentLoads() {
		withTimeoutOf(120, TimeUnit.SECONDS)
				.waitFor(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.dimmed")));
	}


	public void selectCheckboxById(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public void enterInputValue(String id, String value) {
		getDriver().findElement(By.id(id)).sendKeys(value);
	}

	public void selectDropdownValue(String id, String value) {
		WebElement elem = getDriver().findElement(By.cssSelector(id));
		element(elem).selectByValue(value);
		}

	public void clickButtonById(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public void clickButtonByCssSelector(String selector) {
		getDriver().findElement(By.cssSelector(selector)).click();
	}

	public void verifyTitle(String title) {
		verifyTitle(title);
	}

	public void clickOnDropdown(String dropdownId) {
		waitUntilContentLoads();
		getDriver().findElement(By.id(dropdownId)).click();
	}

	public void selectDesiredDropdownValue(String dropdownId, String value) {
		waitUntilContentLoads();
		List<WebElement> dropdownValue = getDriver().findElements(By.id(dropdownId));
		for (WebElement itemNow : dropdownValue) {
			if (itemNow.getAttribute(value).equals(value)) {
				itemNow.click();
				break;
			}
		}
	}

	public void enterInputFieldValue(String name, String inputValue) {
		waitUntilContentLoads();
		WebElement field = getDriver().findElement(By.cssSelector("input[name='" + name + "']"));
		field.sendKeys(inputValue);
	}

	public void enterTextAreaFieldValue(String name, String inputValue) {
		waitUntilContentLoads();
		WebElement field = getDriver().findElement(By.cssSelector("textarea[name='" + name + "']"));
		field.sendKeys(inputValue);
	}

	public void clickOnButtonByName(String name) {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector("button[name='" + name + "']")).click();
		
		
	}
	public void clickOnButton(String name) {
		waitUntilContentLoads();
		List<WebElement> buttonList = getDriver().findElements(By.cssSelector("button"));
		for (WebElement itemNow : buttonList) {
			if (itemNow.getText().equals(name)) {
				itemNow.click();
				break;
			}
		}
	}

	public void clickOnContinuaButton() {
		waitUntilContentLoads();
		clickOnButton("Continua");
	}

	public void clearInputField(String name) {
		waitUntilContentLoads();
		WebElement field = getDriver().findElement(By.cssSelector("input[name='" + name + "']"));
		field.clear();
	}
}
