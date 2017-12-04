//script to obtain the tag name of an element
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
		
		String expTag = "input";
		String actTag = driver.findElement(By.id("email")).getTagName();
		
		if(expTag.contentEquals(actTag))
		{
			System.out.println("Tag matched");
		}
		else
		{
			System.out.println("Tag not matched");
		}
		driver.close();
	}

}
