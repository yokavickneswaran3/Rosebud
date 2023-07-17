package RB;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Frames1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yokr\\eclipse-workspace\\RoseBud\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
       driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/#");
       Actions a=new Actions(driver);
       driver.findElement(By.xpath("//*[@class='blinkingText']")).click();
       Set<String> windowscount= driver.getWindowHandles();
       Iterator<String>it= windowscount.iterator();
       String ParentID=it.next();
       String ChildID=it.next();
       driver.switchTo().window(ChildID);
       System.out.println(driver.findElement(By.xpath("//*[text()='Please email us at ']")).getText());
System.out.println("great ");
   

       
		
       

		
		
		 /* driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/#");
	     Actions a= new Actions(driver);
	System.out.println("Before test ");
	a.moveToElement(driver.findElement(By.xpath("//*[@name='username']"))).click().keyDown(Keys.SHIFT).sendKeys("eMaIl").doubleClick().build().perform();
	a.moveToElement(driver.findElement(By.xpath("(//*[@class='checkmark'])[2]"))).click().build().perform();
	System.out.println("after Test");
	*/
		
		
			}

}
