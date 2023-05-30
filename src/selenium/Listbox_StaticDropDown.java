package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_StaticDropDown {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	
//	ChromeOptions co = new ChromeOptions();
//	co.addArguments("--remote-allow-origns=*") ;
//	
	WebDriver driver = new ChromeDriver();  
	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shree\\Downloads\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();  // up casting
		
		driver.get("https://www.amazon.in" );
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//orghrm
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("3CO9Bs@Ltl");
//	   driver.findElement(By.xpath("//button[text()='Login']")).click(); 
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
//	  
//		Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
//       s.selectByValue("search-alias=mobile-apps");
//       Thread.sleep(2000);
//	   s.selectByIndex(3);
//	   Thread.sleep(2000);
//	   s.selectByVisibleText("Appliances");
//	   
//	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.navigate().to("https://www.trivago.in");
	  
	  driver.findElement(By.xpath("//button[text()='OK']")).click();
	  
	  WebElement currencydrop = driver.findElement(By.xpath("//select[@id='currency-selector']"));
	  Select s1 = new Select(currencydrop);
//	  s1.selectByValue("KWD");
//	  Thread.sleep(2000);
	//  s1.selectByIndex(2);
	  
	 // s1.selectByVisibleText("CAD - Canadian Dollar");
	  
	   List<WebElement> list = s1.getOptions();
	  
	  for(WebElement curncy: list ) {
		  if(curncy.getText().equals("BHD - Bahraini Dinar")) {
			  curncy.click();
			  break;
		  }
	  }
	  
	  
	  
	    
	  
	   
}
}