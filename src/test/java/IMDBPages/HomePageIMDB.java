package IMDBPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageIMDB {

	private WebDriver driver;

	public HomePageIMDB (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//input[@id = 'suggestion-search']")
	WebElement serchbox;

	@FindBy (xpath ="//*[@id=\"react-autowhatever-1--item-0\"]/a/div[2]")
	
	WebElement serchbutton;

	@FindBy (xpath ="	//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a")

	WebElement countryname;

	@FindBy (xpath ="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/a[1]")

	WebElement datedetaillink;

	
	public void EnterMoviewName (String moviename)
	{
		serchbox.sendKeys(moviename);
	}
	
	public void Clicksearch ()
	{
		serchbutton.click();
	}

	public String CountryofOriginDetails ()
	{
		return countryname.getText();
	}
	
	public void Clickonreleaseinfolink ()
	{
		datedetaillink.click();
	}

	




}
