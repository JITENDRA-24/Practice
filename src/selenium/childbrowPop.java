package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowPop {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // up casting
		driver.get("https://demo.guru99.com/popup.php");
         driver.manage().window().maximize();
         
		 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> h = driver.getWindowHandles();
		ArrayList<String> child = new ArrayList<String>(h);
		 
		String c = child.get(1);
		driver.switchTo().window(c);
		
		driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gaurav2n@gmail.com");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(1000);
		
		driver.switchTo().window(child.get(0));  
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();

//		driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr83493");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sYtebEq");
//		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText()+": "+links.get(i).getAttribute("href"));
		}
		driver.quit();
		
}
}