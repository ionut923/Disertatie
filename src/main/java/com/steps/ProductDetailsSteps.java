package com.steps;

import net.thucydides.core.annotations.Step;

public class ProductDetailsSteps extends GeneralSteps {
	private static final long serialVersionUID = 1L;

	@Step
	public void addProductTocart() {
		getGeneralPage().clickButtonById("add_to_cart");
	}

	@Step
	public void proceedToCheckput() {
		getProductDetailPage().proceedToCheckput();
	}
}
