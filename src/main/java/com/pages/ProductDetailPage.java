package com.pages;

import net.serenitybdd.core.annotations.findby.By;

public class ProductDetailPage extends GeneralPage {

	public void proceedToCheckput() {
		getDriver().findElement(By.cssSelector("a[title=\"Proceed to checkout\"]")).click();
	}
	
	public void addOneMoreProduct() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector(".button-plus")).click();
	}
	
	public void removeOneProduct() {
		waitUntilContentLoads();
		getDriver().findElement(By.cssSelector(".button-minus")).click();
	}
	
	public void closeCartPreviewWindow() {
		clickButtonByCssSelector(".cross");
	}
}
