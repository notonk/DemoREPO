//thread.sleep() throws Interrupted Exception
//driver.close closes only the parent window
//driver.quit will close parent and child both window
package Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SixthScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url = "http://www.popuptest.com/popuptest2.html";
		driver.get(url);
		
		Thread.sleep(10000);
		//driver.close();
		driver.quit();
		
	}

}
