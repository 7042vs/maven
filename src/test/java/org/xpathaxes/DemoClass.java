package org.xpathaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.internal.SystemPropertyUtil;

public class DemoClass {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement name = driver.findElement(By.id("userId"));
		name.sendKeys("vinish@46");
		
		
		driver.findElement(By.id("pass")).sendKeys("Vini@123");
		driver.findElement(By.xpath("//input[@placeholder='Enter your company'][1]")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number'][1]")).sendKeys("9489407042");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.id("inp_val")).sendKeys("no");
		//WebElement data = driver.findElement(By.xpath("WebElement name = driver"));
	    
		
		
	}
	

}
