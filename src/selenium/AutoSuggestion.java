package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	

    WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/" );
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	
	 List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	
	for(WebElement op : list) {
		
		if(op.getText().equalsIgnoreCase("India")) {
			System.out.println(op.getText());
			op.click();
			break;
		}
		
		
	}
	WebElement check = driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_Se')]"));
	System.out.println(check.isSelected());
	check.click();
	System.out.println(check.isSelected());
	
	List<WebElement> size = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(size.size());
	
	
	
	
	
	
	
}
}
