package com.steps;

import static org.junit.Assert.assertEquals;

import com.tools.FieldGenerators;
import com.tools.FieldGenerators.Mode;

import net.thucydides.core.annotations.Step;

public class CreateAccountSteps extends GeneralSteps {

	private static final long serialVersionUID = 1L;

	@Step
	public void completeAccountCreation() {
		getGeneralPage().selectCheckboxById("id_gender1");
		getGeneralPage().enterInputValue("customer_firstname", FieldGenerators.generateRandomString(7, Mode.ALPHA));
		getGeneralPage().enterInputValue("passwd", "password");
		getGeneralPage().enterInputValue("customer_lastname", FieldGenerators.generateRandomString(7, Mode.ALPHA));
		getGeneralPage().selectDropdownValue("#days", "2");
		getGeneralPage().selectDropdownValue("#months", "2");
		getGeneralPage().selectDropdownValue("#years", "2000");
		getGeneralPage().selectCheckboxById("newsletter");
		getGeneralPage().selectCheckboxById("optin");
		getGeneralPage().enterInputValue("company", "evozon");
		getGeneralPage().enterInputValue("address1", FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC));
		getGeneralPage().enterInputValue("address2", FieldGenerators.generateRandomString(10, Mode.ALPHANUMERIC));
		getGeneralPage().enterInputValue("city", "Cluj");
		getGeneralPage().selectDropdownValue("#id_state", "2");
		getGeneralPage().enterInputValue("postcode", FieldGenerators.generateRandomString(5, Mode.NUMERIC));
		getGeneralPage().selectDropdownValue("#id_country", "21");
		getGeneralPage().enterInputValue("other", FieldGenerators.generateRandomString(50, Mode.ALPHANUMERIC));
		getGeneralPage().enterInputValue("phone", FieldGenerators.generateRandomString(10, Mode.NUMERIC));
		getGeneralPage().enterInputValue("phone_mobile", FieldGenerators.generateRandomString(10, Mode.NUMERIC));
		getGeneralPage().clickButtonById("submitAccount");

	}

	// Aici sa se faca verificarea cu assert
	@Step
	public void verifyUserOnAccountPage() {
		String actualTitle = getDriver().getTitle();
		assertEquals("account creation failed", "My account - My Store", actualTitle);
	}
}
