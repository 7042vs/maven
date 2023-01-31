package org.grouping;

import org.testng.annotations.Test;

public class GropClass {
	@Test(groups= {"smoke","reg"})
	private void tc_1() {
  
		System.out.println("GropClass tc-1 smoke");
		
		
	}
	@Test(groups="sanity")
	private void tc_2() {
		  
		System.out.println("GropClass tc-2 sanity ");
		
		
	}
	@Test(groups="sanity")
	private void tc_3() {
		  
		System.out.println("GropClass tc-3 sanity");
		
		
	}
	@Test(groups="smoke")
	private void tc_4() {
		  
		System.out.println("GropClass tc-4 smoke");
		
		
	}
	@Test(groups="sanity")
	private void tc_5() {
		  
		System.out.println("GropClass tc-5 sanity");
		
		
	}
	@Test(groups="reg")
	private void tc_6() {
		  
		System.out.println("GropClass tc-6 reg");
		
		
	}

}
