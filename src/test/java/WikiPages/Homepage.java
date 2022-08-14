package WikiPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	private WebDriver driver;

	public Homepage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//*[@id='searchInput']")
	WebElement serchbox;
	
	@FindBy (xpath ="	//*[@id=\"searchButton\"]")
	WebElement serchbutton;
	
	@FindBy (xpath ="	//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")

	WebElement countryname;
	
	@FindBy (xpath ="	//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")

	WebElement Datedetails;
	
	

	public void EnterMoviewName (String moviename)
	{
		serchbox.sendKeys(moviename);
	}
	public void Clicksearch ()
	{
		serchbutton.click();
	}
	
	public String CountryofOriginDetailsofWiki ()
	{
		return countryname.getText();
	}
	
	public String ReleasedateinfoWiki ()
	{
		return Datedetails.getText();
	}
	
	
}
