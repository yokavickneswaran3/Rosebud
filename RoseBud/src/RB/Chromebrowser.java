package RB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yokr\\eclipse-workspace\\RoseBud\\browser\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("test-type");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		WebDriver driver=new ChromeDriver(options);

		driver.navigate().to("https:www.google.com");
		
		driver.close();
		
		
	}

}
