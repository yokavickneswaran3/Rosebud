package RB;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class viggies_working {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yokr\\eclipse-workspace\\RoseBud\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

       driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

		List<WebElement> products =driver.findElements(By.xpath("//*[@class='products']//h4[@class='product-name']"));
		 
		
		for(int i=0;i<products.size();i++) 
		{		
			String[] name=products.get(i).getText().split("-");
			String formatted=name[0].trim();
			//String name=products.get(i).getText();
			

			
			List itemNeededList=Arrays.asList(itemsNeeded);
			int j=0;
			if(itemNeededList.contains(formatted))
			{
				 driver.findElements(By.xpath("//*[@class='product-action']//*[@type='button']")).get(i).click();
				
				 if(j==3) {
					 break;

				}
				
			}
	}}
}
