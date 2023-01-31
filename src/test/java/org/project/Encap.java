package org.project;

public class Encap extends ClassTwo {
	private int username;
	private int password;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
		System.out.println(username);
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
		System.out.println(password);
	}
	

}
