package org.bace;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassProg {
	  public static WebDriver driver;
	public static void getDriver(String url) {
		 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	//1
	public static void enterAppUrl(String Url) {
	// driver.get(Url);
		
	}
    //2	
	private static void maximizeWibdoe() {

	//	driver.manage().window().maximize();
	}
	//3
 public static void elementSentKeys(WebElement element ,String data) {
 element.sendKeys(data);	 
	 
}	 
  //4
 private void elementSentKersJS(WebElement element ,String data) {
	 
JavascriptExecutor executor= (JavascriptExecutor)driver;
executor.executeScript("argument[0](value"+data+"element");
 
 }
  //5
 private void clickWebElement(WebElement element) {
	 element.click();
	 
}
 //6
	private String getApplnTitle() {

		String title = driver.getTitle();
		
		return title;
		
	}
	//7
	private void elementSendKeys(WebElement element ,String data) {
		element.sendKeys(data);
  
	} 
    //8
	private void clickButton(WebElement element) {
    element.click();
		
	}
	//9
	private void alertOk() {
     Alert alert = driver.switchTo().alert();
     alert.accept();
	}
	//10
	private void alertCancel() {
Alert alert = driver.switchTo().alert();
alert.dismiss();
	}
	//11
	private String textWebPage(WebElement element) {
     String text = element.getText();
	return text;
     
	}
	//12----------->99%
	private String getAttributeValue(WebElement element) {
     String domAttribute = element.getDomAttribute("name");
	return domAttribute;
		
	}
	//13-------------->1%?
	private String getAttributeValue(WebElement element ,String attributevalue ) {
		String attribute = element.getAttribute(attributevalue);
		return attribute;
		
	} 
	//14
	private void closeAllWindow() {
   driver.quit();
	}
	//15
	private void closeWindow() {

		driver.close();
	}
	//16
	private String getTitle() {

String title = driver.getTitle();
return title;		
	}
	//17
	private void enteredUrl() {
	driver.get("url");

	}
	//18
	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
}
	//19
	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	//20
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	//21
	public JavascriptExecutor elementSendkeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].setAttribute('value'," +data+ ")", element);
		return (JavascriptExecutor) executeScript;
}
	//22
	public void clickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}
	//23
	public void childWindow() {
		String windowHandle = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String x : allWindow) {
			if(!windowHandle.equals(allWindow));
			driver.switchTo().window(x);
		}
		
	}
	//24

	public void switchToFrameId(String name) {
		driver.switchTo().frame(name);
	}
	//25
	public  static WebElement findElementId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	//26
	private WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	//27
	public WebElement findElementByClassName(String Value) {
		WebElement element = driver.findElement(By.className(Value));
		return element;
	}
	//28
	public WebElement findElementByXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	//29
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}
	//30
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
	//31
	public void firstSelectoption(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}
	//32
	public boolean elementisDisplyed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	//33
	public boolean elementisEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	//34
	public boolean elementisSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	//35
	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	//36
	public void deselectByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);		
	}
	//37
	public void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	//38
	public void deselectByAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	//39
	public String parentWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	//40
	public Set<String> allWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	//41
	public void clear(WebElement element) {
		element.click();
	}
	//42
	public static File takeScreenshot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
	//43
	public static  File takeScreenshotElement(WebElement element) {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}
	//44
	public Actions mouseoverActionSingleOption(WebElement element) {
		Actions actions = new Actions(driver);
		Actions moveToElement = actions.moveToElement(element);
		return moveToElement;
	}
	//45
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}
	//46
	public Actions rightClick() {
		Actions actions = new Actions(driver);
		Actions contextClick = actions.contextClick();
		return contextClick;
	}
	//47
	public Actions doubleClick() {
		Actions actions = new Actions(driver);
		Actions doubleClick = actions.doubleClick();
		return doubleClick;
	}
	//48
	public void sendkeysAndEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);
	}
	//49
	public void refreshPage() {
		driver.navigate().refresh();
	}
	//50
	public void forward() {
		driver.navigate().forward();
	}
	//51
	public void back() {
		driver.navigate().back();
	}
	//52
	public void robotKeyPress() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	//53
	public void scrollDownJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	//54
	public void scrollUpJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	//55
	public void threadSleep(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	//56
	public String alertText() {
		String text = driver.switchTo().alert().getText();
		return text;
	}
	//57
	
	public Object webpageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	//58
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
     //59
	public void elementClick(WebElement element) {
		element.click();
	}
	public void getDriver() {
		// TODO Auto-generated method stub
		
	}
	
}
