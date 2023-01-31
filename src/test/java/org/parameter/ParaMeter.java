package org.parameter;

import org.bace.BaseClassProg;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeter extends BaseClassProg {
    
	@Parameters({"username","password"})
	@Test 
	private void loginFb(String username,String password) {
		getDriver("https://www.facebook.com/");
		
		findElementId("email").sendKeys(username);
		findElementId("pass").sendKeys(password);

	}

	
}
