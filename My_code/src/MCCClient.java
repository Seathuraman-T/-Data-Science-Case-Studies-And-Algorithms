import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCCClient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://test.salesforce.com/");
	    driver.findElement(By.cssSelector("input#username")).sendKeys("mccadmin@maxval.com.qa");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Maxval2024@");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    Thread.sleep(3000);
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//div[@role='list']//span[text()='Clients']/parent::*")));
		

	}

}
