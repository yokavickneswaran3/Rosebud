package RB;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_tags_in_page {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yokr\\eclipse-workspace\\RoseBud\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
       driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
       
System.out.println(driver.findElements(By.tagName("a")).size());
       
	WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	System.out.println("start");
	
	WebElement columdriver=footerdriver.findElement(By.xpath("//table[@class='gf-t']//tr//td[1]//ul"));
	System.out.println(columdriver.findElements(By.tagName("a")).size());
	System.out.println("end");


	for(int i=0;i<columdriver.findElements(By.tagName("a")).size();i++) {
		String press=Keys.chord(Keys.CONTROL,Keys.ENTER);
	
		footerdriver.findElements(By.tagName("a")).get(i).sendKeys(press);
		}
	Set<String> countnewtabs=driver.getWindowHandles();
Iterator<String> it = countnewtabs.iterator();

while(it.hasNext()) {
	driver.switchTo().window(it.next());
	System.out.println( driver.getTitle());
}

}
	}







































//        WebElement subdriver = driver.findElement(By.id("gf-BIG")); //Limiting webdriver SCOPE
//       
//        System.out.println(subdriver.findElements(By.tagName("a")).size());
//       
    
/*
//why ?  1 - why this is wrong ?
  WebElement Minidriver = driver.findElement(By.id("gf-BIG"));
  int Minidriver2 = driver.findElements(By.id("gf-BIG")).size();
*/


//System.out.println(driver.findElements(By.xpath("//table[@class='gf-t']//tr//td[1]//ul//li")).size());
	
//
//WebElement footerdriver=driver.findElement(By.xpath("//table[@class='gf-t']//tr//td[1]//ul//li"));
//System.out.println(footerdriver.findElements(By.tagName("a")).size());
//
//
//WebElement footerdriver2=footerdriver.findElement(By.xpath("//table[@class='gf-t']//tr//td[1]//ul//li"));
//System.out.println(footerdriver2.findElements(By.tagName("a")).size());


//
//for(int i=0;i< footerdriver.findElements(By.tagName("a")).size();i++) {
//	String press=Keys.chord(Keys.CONTROL,Keys.ENTER);
//
//	footerdriver.findElements(By.tagName("a")).get(i).sendKeys(press);
//	}
//
//	}


