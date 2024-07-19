import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GFG_Chrome {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://test.salesforce.com");
		
	}
}
