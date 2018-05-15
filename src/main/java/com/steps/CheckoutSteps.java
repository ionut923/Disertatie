package com.steps;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends GeneralSteps{
	
	private static final long serialVersionUID = 1L;

	@Step
	public void completeCheckput() {
		getCheckoutPage().proceedToCheckput();
		getCheckoutPage().processAddress();
		getCheckoutPage().agreeeToTerms();
		getCheckoutPage().processCarrier();
		getCheckoutPage().selectPaymentMethod();
		getCheckoutPage().confirmOrder();
	}
	
	public void verifyOrderConfirmationMessage() {
		String actualMessage = getDriver().findElement(By.cssSelector("#center_column h1")).getText();
		assertEquals("Checkout failed", "ORDER CONFIRMATION", actualMessage);
	}
	
	@Step
	public void navigateToOrderHistory() {
		getCheckoutPage().navigateToOrderHistory();
	}
	
}
