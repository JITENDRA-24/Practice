package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopupHandling {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://admin:admin@the-internet.herokuapp.com");
//	driver.get("https://the-internet.herokuapp.com");
	
	driver.findElement(By.partialLinkText("Basic Auth")).click();
	
//	syntax=>   http://Username:Password@siteUrl
}
}
