package org.depends;

import org.testng.annotations.Test;

public class ClassDepends {

	@Test(dependsOnMethods="tc_2")
	private void tc_1() {
		System.out.println("ClassDepends tc_1");

	}
	@Test(dependsOnMethods="tc_3")
	private void tc_2() {
		System.out.println("ClassDepends tc_2");

	}
	@Test
	private void tc_3() {
		System.out.println("ClassDepends tc_3");

	}
}
