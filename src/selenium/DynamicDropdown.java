package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/" );
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@value='HYD']")).click();
	
	//driver.findElement(By.xpath("(//a[@value='BOM']) [2]")).click();
	
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
	//Parent child relation xpath alternative to index
	driver.findElement(By.xpath("(//a[text()='24']) [1]")).click();
	
	driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger']) [2]")).click();
	driver.findElement(By.xpath("(//a[text()='28']) [2]")).click();
	
	 WebElement currency = driver.findElement(By.xpath("(//select[contains(@id,'ctl00_mainContent_D')]) [1]"));
	Select s = new Select(currency);
	s.selectByValue("AED");
	Thread.sleep(2000);
	s.selectByIndex(1);
	Thread.sleep(2000);
	s.selectByVisibleText("USD");
	
	List<WebElement> list = s.getOptions();
	for(WebElement e:list) {
		if(e.getText().equals("AED")) {
			e.click();
			System.out.println(e.getText());
			break;
		}
	}
	//driver.quit();
}
}
