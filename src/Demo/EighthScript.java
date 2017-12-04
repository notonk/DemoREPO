//script to navigate from page1 to page2 and vice versa
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EighthScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String baseurl = "https://www.facebook.com";
		driver.navigate().to(baseurl);
		driver.findElement(By.id("email")).sendKeys("raj");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.close();
	}
	

}
