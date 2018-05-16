package com.steps;

import junit.framework.Assert;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;

@SuppressWarnings("deprecation")
public class OrderHistorySteps extends GeneralSteps{
	private static final long serialVersionUID = 1L;
	
	public void verifyOrderPresentInHistory() {
		String actualMessage = getDriver().findElement(By.cssSelector("#order-list .first_item .history_link.bold.footable-first-column")).getText();
		System.out.println(actualMessage);
		String mesage = (String) Serenity.getCurrentSession().get("message");
		System.out.println(mesage);
		Assert.assertTrue(mesage.contains(actualMessage));
	}
}
