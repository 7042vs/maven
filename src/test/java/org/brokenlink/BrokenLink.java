package org.brokenlink;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		List<WebElement> link1 = driver.findElements(By.tagName("a"));
		System.out.println(link1);
		for (int i = 0; i < link1.size(); i++) {
			String attribute = link1.get(i).getAttribute("href");
			System.out.println(attribute);

		}
		int brLink=0;

		// broken link finding
		for (int i = 0; i < link1.size(); i++) {
			String attribute = link1.get(i).getAttribute("href");
			if (attribute != null) {
				URL url = new URL(attribute);
				URLConnection openConnection = url.openConnection();
				HttpsURLConnection connection = (HttpsURLConnection) openConnection;
				int responseCode = connection.getResponseCode();
				if (responseCode>=400) {
					
					System.out.println("brokenLink:"+attribute);
					brLink ++;
				}
				
			}
		}

	}

}
