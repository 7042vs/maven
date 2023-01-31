package org.pom;

import java.net.PasswordAuthentication;
import java.sql.Driver;

import org.bace.BaseClassProg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.page.Page.NavigateResponse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaseBook_Login_page extends BaseClassProg {
 public static void main(String[] args) {
	 
	 getDriver("https://www.facebook.com/");
	 FaceBook_Login_Page_Prog a = new FaceBook_Login_Page_Prog();
	 WebElement name = a.getName();
	 name.sendKeys("vinish");
	 driver.navigate().refresh();
	 name.sendKeys("Vinish123");
	 
	 
	 
}
	

}
