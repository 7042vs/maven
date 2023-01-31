package org.cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// for UserName
		// 1 #email
		driver.findElement(By.cssSelector("#email")).sendKeys("Vinish");
		// 2 tagname#id Value
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input#email")).sendKeys("vinishKV");
		// 3 tagname[attriburename=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("KVvinish");
		// 4 tagname[attributename=attributeValue][atrributename=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[id=email][name=email]")).sendKeys("VINISH");
		// 5 tagname[attributename^=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name^=e]")).sendKeys("ViNiSh");
		// 6 tagname[attributename$=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name$=email]")).sendKeys("VINIshVK");

		// for password
		// 1 #id Valu
		driver.findElement(By.cssSelector("#pass")).sendKeys("vini@123");
		// 2  tagname#id Value
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Vini@098");
		// 3 tagname[attributname=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("VINI#123");
		// 4 tagname[attributename=attributeValue][atrributename=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[name=pass][placeholder=Password]")).sendKeys("VINISH$123");
		// 5tagname[attributename$=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[id$=ss]")).sendKeys("viniSH%7");
		// 6 tagname.classattributeValue
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("VINISH@#$%");
		// 7 tagname.classvalue[attributename=attributeValue]

		// for login
		// 1 tagname.attributValue
		WebElement login = driver.findElement(By.cssSelector("button._42ft "));
		login.click();
		// 2tagname[attributename=attributValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("button[name=login]")).click();
		// 3tagname.class[attributename=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("button._42ft[name=login]")).click();
		// 4 tagname[attributename=attributeValue][atrributename=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("button._42ft[name=login][type=submit]")).click();
		// 5 tagname[attributname^=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("button[name^=l]")).click();
		// 6 tagname[attributename$=attributeValue]
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("button[name$=n]")).click();
	}

}
