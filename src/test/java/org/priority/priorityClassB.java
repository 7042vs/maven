package org.priority;

import org.testng.annotations.Test;

public class priorityClassB {
	@Test
	private void tc_1() {
		System.out.println("ClassA tc- 1");
				
			}
	@Test(priority=-175)
			private void tc_2() {
		System.out.println("ClassA tc- 2`");
				
			}@Test(priority=4)
			private void tc_3() {
		System.out.println("ClassA tc- 3");
				
			}
			@Test
			private void tc_4() {
		System.out.println("ClassA tc- 4");
				
			}


}
