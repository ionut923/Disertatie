package com.steps;

import static org.junit.Assert.assertNotNull;

import net.serenitybdd.core.annotations.findby.By;

public class OrderHistorySteps extends GeneralSteps{
	private static final long serialVersionUID = 1L;
	
	public void verifyOrderPresentInHistory() {
		String actualMessage = getDriver().findElement(By.cssSelector("#order-list .last_item .color-myaccount")).getText();
		System.out.println(actualMessage);
		assertNotNull(actualMessage);
	}
	

}
