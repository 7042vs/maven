package org.depends;

import org.testng.annotations.Test;

public class GroupDependsClass {

	@Test(groups="Reg",dependsOnGroups="sanity")
	private void tc_1() {
      System.out.println("GroupDependsClass tc_1");
		
	}
	@Test(groups="sanity",dependsOnGroups="smork")
	private void tc_2() {
      System.out.println("GroupDependsClass tc_2");
		
	}
	@Test(groups="smork")
	private void tc_3() {
      System.out.println("GroupDependsClass tc_3");
		
	}
	
}
