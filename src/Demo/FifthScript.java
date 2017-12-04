package Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FifthScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nitin\\GeckoDriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
	}

}
