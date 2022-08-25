package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=2,groups= {"smoke","regression"})
	public void verifyLogin() {
		loginPage.loginMethod();
		AssertJUnit.assertEquals(pimPage.titleOfPimPage(),"PIM");
	}

}
