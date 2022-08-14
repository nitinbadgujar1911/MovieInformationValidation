package TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;
	
	public void navigatetheUrl(String Url)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
