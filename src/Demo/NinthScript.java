//how to handle links using webdriver
package Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class NinthScript {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		String baseurl = "https://facebook.com";
		driver.get(baseurl);
		Thread.sleep(5000);
		//driver.findElement(by);
		
		
		
	}
	abstract public void getter();

}
