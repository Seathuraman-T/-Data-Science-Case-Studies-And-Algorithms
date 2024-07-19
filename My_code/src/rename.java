import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;


public class rename {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		List<WebElement> suming = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		
		for(int i=0; i<suming.size(); i++)
			
		{
		   sum = sum + Integer.parseInt(suming.get(i).getText());
						
		}
		
		System.out.println(sum);
		
		String text = driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		System.out.println(text);
		
		String text1 = text.split(":")[1].trim();
			
		System.out.println(text1);
		
		int check = Integer.parseInt(text1);
		

//		js.executeScript("window.scrollTo(500,0)");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.cssSelector("#opentab")).click();
//		
//	//	js.executeScript("window.scrollBottom(500,0)");
//		
//		
//		driver.close();
//
//		driver.quit();
	}

}
