package com.pages;

import net.serenitybdd.core.annotations.findby.By;

public class ProductDetailPage extends GeneralPage {

	public void proceedToCheckput() {
		getDriver().findElement(By.cssSelector("a[title=\"Proceed to checkout\"]")).click();
	}
}
