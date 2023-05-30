package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	//launch browser
		WebDriver driver=new ChromeDriver();
		
		//max windows
		driver.manage().window().maximize();
		
		JavascriptExecutor je=(JavascriptExecutor )driver;
		Thread.sleep(3000);
		
		//open web application 
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement dropDownButton =driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		je.executeScript("arguments[0].scrollIntoView();", dropDownButton);
		Thread.sleep(3000);
		
		//handle dropdown using action class
		dropDownButton.click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		//driver.close();
		
		
}
}
