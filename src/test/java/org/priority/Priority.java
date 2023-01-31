package org.priority;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=33)
	private void tc_1() {
	System.out.println("ClassA tc_1 ");	
		
	}
		@Test(priority=-175)
	private void tc_2() {
		System.out.println("ClassA tc_2 ");	
			
		}
		@Test(priority=4)
	private void tc_3() {
		System.out.println("ClassA tc_3 ");	
			
		}
		@Test(priority=-56)
	private void tc_4() {
		System.out.println("ClassA tc_4 ");	
			
		}
		@Test(priority=68)
	private void tc_5() {
		System.out.println("ClassA tc_5 ");	
			
		}
		@Test
	private void tc_6() {
		System.out.println("ClassA tc_6 ");	
			
		}

}
