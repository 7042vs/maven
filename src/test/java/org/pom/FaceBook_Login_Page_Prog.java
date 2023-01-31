package org.pom;

import org.bace.BaseClassProg;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Login_Page_Prog extends BaseClassProg {
	
	public FaceBook_Login_Page_Prog() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
     private WebElement name ;
	public WebElement getName() {
		return name;
	}
	public WebElement getPasswors() {
		return passwors;
	}
	@FindBy(id="pass")
	private WebElement passwors;
	
	
	

}
