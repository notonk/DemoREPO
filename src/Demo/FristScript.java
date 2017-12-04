//script to launch the browser and open a site
package Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FristScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url = "https://www.google.com";
		driver.get(url);
		
	}

}
