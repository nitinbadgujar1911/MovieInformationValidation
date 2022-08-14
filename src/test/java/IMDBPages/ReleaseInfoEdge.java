package IMDBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReleaseInfoEdge {

	private WebDriver driver;

	public ReleaseInfoEdge (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath ="	//*[@id=\"main\"]/div[1]/div[1]/div/h1")

	WebElement releaseinfopage;
	
	@FindBy (xpath ="//*[@id=\"releaseinfo_content\"]/table[1]/tbody/tr[6]/td[2]")
	WebElement indiareleasedate;
	

	
	public void landedonreleaseinfopage()
	{
		releaseinfopage.isDisplayed();
	}
	
	public String  indiareleasedateinformation()
	{
		return indiareleasedate.getText();
	}
	
	



}
