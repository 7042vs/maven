package org.project;

public class ClassOne implements FulluAbs {
	public int add(int a,int b) {
		int c=a+b;
		System.out.println("Method overloading");
		System.out.println(c);
		return c;
	}

	public void absMethod() {
System.out.println("FullyAbstract Method");		
	}
}
