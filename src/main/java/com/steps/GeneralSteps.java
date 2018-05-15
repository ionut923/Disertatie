package com.steps;

import com.pages.CheckoutPage;
import com.pages.CreateAccountPage;
import com.pages.GeneralPage;
import com.pages.HeaderPage;
import com.pages.LoginPage;
import com.pages.OrderHystoryPage;
import com.pages.ProductDetailPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class GeneralSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	GeneralPage generalPage = new GeneralPage();

	@Step
	public void clickOnDropdown(String dropdownId) {
		generalPage.clickOnDropdown(dropdownId);
	}

	@Step
	public void selectDesiredDropdownValue(String dropdownId, String value) {
		generalPage.selectDesiredDropdownValue(dropdownId, value);
	}

	@StepGroup
	public void selectDropdownValue(String dropdownId, String value) {
		clickOnDropdown(dropdownId);
		selectDesiredDropdownValue(dropdownId, value);
	}

	@Step
	public void clickOnContinuaButton() {
		generalPage.clickOnContinuaButton();
	}

	public void navigateTo(String URL) {
		getDriver().get(URL);
	}

	public CreateAccountPage getCreateAccountPage() {
		return getPages().currentPageAt(CreateAccountPage.class);
	}

	public GeneralPage getGeneralPage() {
		return getPages().currentPageAt(GeneralPage.class);
	}

	public HeaderPage getHeaderPage() {
		return getPages().currentPageAt(HeaderPage.class);
	}
	
	public LoginPage getLoginPage() {
		return getPages().currentPageAt(LoginPage.class);
	}
	
	public ProductDetailPage getProductDetailPage() {
		return getPages().currentPageAt(ProductDetailPage.class);
	}
	
	public CheckoutPage getCheckoutPage() {
		return getPages().currentPageAt(CheckoutPage.class);
	}
	
	public OrderHystoryPage getOrderHystoryPage() {
		return getPages().currentPageAt(OrderHystoryPage.class);
	}
}
