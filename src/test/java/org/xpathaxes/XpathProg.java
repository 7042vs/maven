package org.xpathaxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathProg {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");
		driver.manage().window().maximize();
		// 1
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);
		// 2
		WebElement jobBoard = driver.findElement(By.xpath("//div[text()='Job Board']"));
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(jobBoard).perform();
		// 3
		driver.findElement(By.xpath("//a[text()='Applications ']")).click();
		
				WebElement name = driver.findElement(By.xpath("//a[text()='Web Editor']//parent :: td // preceding-sibling ::td // strong"));
		System.out.println(name.getText());

		// 4 preceding data alone
		System.out.println("------------------------------------");
		List<WebElement> preData = driver
				.findElements(By.xpath("//a[text()='Web Editor']//parent :: td // preceding ::td "));

		for (int i = 0; i < preData.size(); i++) {
			System.out.println(preData.get(i).getText());
		}
		System.out.println("------------------------------------");
		// 5 preceding-sibling data
		List<WebElement> preSibli = driver
				.findElements(By.xpath("//a[text()='Web Editor']//parent :: td //preceding-sibling::td "));

		for (int j = 0; j < preSibli.size(); j++) {

			System.out.println(preSibli.get(j).getText());
		}
		System.out.println("------------------------------------");
		// 6 following data alone
		List<WebElement> folloData = driver
				.findElements(By.xpath("//a[text()='Web Editor']//parent :: td // following ::td "));

		for (int k = 0; k < folloData.size(); k++) {
			System.out.println(folloData.get(k).getText());
		}
		System.out.println("------------------------------------");
		// 7 following-sibling data

		List<WebElement> folloSibli = driver
				.findElements(By.xpath("//a[text()='Web Editor']//parent :: td // following-sibling ::td "));

		for (int l = 0; l < folloSibli.size(); l++) {
			System.out.println(folloSibli.get(l).getText());
		}
		System.out.println("------------------------------------");

		// 8 ancostorFolloSibli
		System.out.println("------------------------------------");
		List<WebElement> ancostorFolloSibli = driver
				.findElements(By.xpath("//a[text()='Web Editor']//ancestor :: tr // following-sibling ::tr"));

		for (int m = 0; m < ancostorFolloSibli.size(); m++) {

			System.out.println(ancostorFolloSibli.get(m).getText());

		}
		System.out.println("------------------------------------");
		// 9 ancostorFollo

		List<WebElement> ancostorFollo = driver
				.findElements(By.xpath("//a[text()='Web Editor']//ancestor :: tr // following ::tr"));
		for (int i = 0; i < ancostorFollo.size(); i++) {

			System.out.println(ancostorFollo.get(i).getText());

		}
		System.out.println("------------------------------------");

		// 10 ancostorPreceding

		List<WebElement> ancostorPreceding = driver
				.findElements(By.xpath("//a[text()='Web Editor']//ancestor :: tr // preceding ::tr"));

		for (int i = 0; i < ancostorPreceding.size(); i++) {
			System.out.println(ancostorPreceding.get(i).getText());

		}
		System.out.println("------------------------------------");
		// 11 ancostorPrecSibling

		List<WebElement> ancostorPrecSibling = driver
				.findElements(By.xpath("//a[text()='Content Creator']//ancestor :: tr // preceding-sibling ::tr"));
		for (int i = 0; i < ancostorPrecSibling.size(); i++) {
			System.out.println(ancostorPrecSibling.get(i).getText());

		}
		System.out.println("------------------------------------");

		// 12 get eamilPreceding
		WebElement eamilPreceding = driver.findElement(
				By.xpath("//a[text()='Web Editor']//parent :: td // preceding ::td [@data-colname='E-mail']"));
		System.out.println(eamilPreceding.getText());

		// 14 folloEamil get
		System.out.println("------------------------------------");
		List<WebElement> folloEamil = driver.findElements(
				By.xpath("//a[text()='Web Editor']//parent :: td // following ::td [@data-colname='E-mail']"));
		for (int i = 0; i < folloEamil.size(); i++) {
			System.out.println(folloEamil.get(i).getText());
		}
		System.out.println("------------------------------------");
		// 15 get job in following

		List<WebElement> folloName = driver.findElements(
				By.xpath("//a[text()='Web Editor']//parent :: td // following ::td [@data-colname='Job']"));

		for (int i = 0; i < folloName.size(); i++) {
			System.out.println(folloName.get(i).getText());

		}
		System.out.println("------------------------------------");

		// 16 rating
		List<WebElement> ratingfollo = driver.findElements(By.xpath("//a[text()='Web Editor']//parent :: td // following ::td [@data-colname='Rating']"));

		for (int i = 0; i < ratingfollo.size(); i++) {
			System.out.println(ratingfollo.get(i).getText());

		}
		System.out.println("------------------------------------");
		// 17 Posted

		List<WebElement> Posted = driver.findElements(
				By.xpath("//a[text()='Web Editor']//parent :: td // following ::td [@data-colname='Posted']"));

		for (int i = 0; i < Posted.size(); i++) {

			System.out.println(Posted.get(i).getText());

		}
		System.out.println("------------------------------------");
		// 18 status

		List<WebElement> status = driver.findElements(
				By.xpath("//a[text()='Web Editor']//parent :: td // following ::td [@data-colname='Status']"));
		for (int i = 0; i < status.size(); i++) {
			System.out.println(status.get(i).getText());

		}
		System.out.println("------------------------------------");
		// 19 name
		List<WebElement> Name = driver.findElements(By.xpath(
				"//a[text()='Web Editor' ]//ancestor :: tr //following :: td[@class='post-title column-title column-primary']"));

		for (int i = 0; i < Name.size(); i++) {
			System.out.println(Name.get(i).getText());

		}

		// 20 get all eamil data
		List<WebElement> getAllEamil = driver.findElements(
				By.xpath("//a[text()='Web Editor' ]//ancestor :: tr //following :: td[@data-colname='E-mail']"));
		for (int i = 0; i < getAllEamil.size(); i++) {

			System.out.println(getAllEamil.get(i).getText());

		}
	}

}