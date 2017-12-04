//script to get the title of the page
package Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
		String expTitle = "Facebook – log in or sign up";
		String actTitle = driver.getTitle();
		
		if(expTitle.contentEquals(actTitle))
		{
			System.out.println("Title matched");
		}
		else 
		{
			System.out.println("Title not matched");
		}
		driver.close();
	}

}
