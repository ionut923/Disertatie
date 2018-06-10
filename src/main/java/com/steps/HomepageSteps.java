package com.steps;

import com.pages.Homepage;

import net.thucydides.core.annotations.Step;

public class HomepageSteps extends GeneralSteps {
	
	private static final long serialVersionUID = 1L;
	Homepage homePage = new Homepage();

	@Step
	public void selectDesiredProduct(String value) {
		getHomepage().selectDesiredProduct(value);
	}
	
}
