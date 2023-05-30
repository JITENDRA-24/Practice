package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdwnadd {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/" );
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement passenger = driver.findElement(By.id("divpaxinfo"));
	passenger.click();
	
	WebElement plus = driver.findElement(By.id("hrefIncAdt"));
	System.out.println(passenger.getText());
	Thread.sleep(2000);
	
	for(int i=1; i<5; i++) {
		plus.click();
	}
	Thread.sleep(2000);
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(passenger.getText());
	
}
}
