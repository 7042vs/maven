package org.junittest;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.bace.BaseClassProg;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA extends BaseClassProg {
	@BeforeClass
	public static void tc_1() {
		 
//		BaseClassProg.getDriver("https://www.facebook.com/");
		
		
		getDriver("https://www.facebook.com/");
		System.out.println("ClassA tc_1");
	}
	@AfterClass
	
	public static void tc_2() {
 		driver.close();
		System.out.println("ClassA tc_2");

}
	@Before
	public  void tc_3() {
		
				System.out.println("ClassA tc_3");
	}
	@After
	public void tc_4() {
		System.out.println("ClassA tc_4");
	}
	
	@Test
	public void tc_5() {
//		findElementId("email").sendKeys("hello");
driver.findElement(By.id("email")).sendKeys("Hello");		
driver.findElement(By.id("pass")).sendKeys("Hello@1234");
    System.out.println("ClassA tc_5");
		
}
}