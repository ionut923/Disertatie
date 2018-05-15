package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.LoginTest;
import com.tests.Test_CompleteAPurchase;
import com.tests.Test_ContactSupportTeam;
import com.tests.Test_CreateAccount;

@RunWith(Suite.class)
@SuiteClasses({ LoginTest.class, Test_ContactSupportTeam.class, Test_CreateAccount.class,
		Test_CompleteAPurchase.class })

public class Test_Suite {

}
