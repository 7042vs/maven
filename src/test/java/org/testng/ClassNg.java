package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassNg {
	@BeforeSuite
	private void tc_1() {
		System.out.println("ClassTgTc_1");

	}
	@AfterSuite
	private void tc_2() {
		System.out.println("ClassTgTc_2");

	}
	@BeforeTest
	private void tc_3() {
		System.out.println("ClassTgTc_3");

	}
	@AfterTest
	private void tc_4() {
		System.out.println("ClassTgTc_4");

	}
	@BeforeClass
	private void tc_5() {
		System.out.println("ClassTgTc_5");

	}
	@AfterClass
	private void tc_6() {
		System.out.println("ClassTgTc_6");

	}
	@BeforeMethod
	private void tc_7() {
		System.out.println("ClassTgTc_7");

	}
	@AfterMethod
	private void tc_8() {
		System.out.println("ClassTgTc_8");

	}
	@Test
	private void tc_9() {
		System.out.println("ClassTgTc_9");

	}
	@Test
	private void tc_10() {
		System.out.println("ClassTgTc_10");

	}
	

}
