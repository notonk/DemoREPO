//navigate method can load web page or refresh it
//also to move from one page to another page in forward direction or in reverse direction
package Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeventhScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url = "https://www.facebook.com";
		driver.navigate().to(url);
		driver.close();
		
		
	}

}
