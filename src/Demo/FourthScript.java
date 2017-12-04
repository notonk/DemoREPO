//sending value in email as 'raj' and for password 'anu' 
//handling the button by clicking on it

package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FourthScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
        
		driver.findElement(By.id("email")).sendKeys("raj");
        driver.findElement(By.id("pass")).sendKeys("anu");
        
        driver.findElement(By.id("u_0_5")).click();
        driver.close();
	}

}
