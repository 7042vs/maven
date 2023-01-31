package org.parameter;

import org.bace.BaseClassProg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterProg extends BaseClassProg {
	@Test(dataProvider="result")
	private void login(String username ,String password) {
		getDriver("https://www.facebook.com/");
		findElementId("email").sendKeys(username);
		findElementId("pass").sendKeys(password);
		

	}
	@DataProvider(name="result")
	private Object[][] dataP() {
		Object[][] data =new Object[3][2];
		data[0][0]="vinish";
		data[0][1]="vini@123";
		
		data[1][0]="kanish";
		data[1][1]="kani@123";
		
		data[2][0]="sajith";
		data[2][1]="saji@12345";
		return data;

	}

}
