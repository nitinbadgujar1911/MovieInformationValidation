package StepDefinations;



import IMDBPages.HomePageIMDB;
import IMDBPages.ReleaseInfoEdge;
import TestRunner.BaseClass;
import WikiPages.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IMDBTestFile extends BaseClass{

	String C1;
	String D1;
	String C2;
	String D2;

	HomePageIMDB hpimdb;
	ReleaseInfoEdge rip;
	Homepage hp;


	@Given("^user navigate get url to \"([^\"]*)\"$")
	public void user_navigate_get_url_to(String url) throws Throwable {

		navigatetheUrl(url);

	}

	@When("^user search for movie \"([^\"]*)\"$")
	public void user_search_for_movie(String arg1) throws Throwable {
		hpimdb = new HomePageIMDB (driver);
		hpimdb.EnterMoviewName(arg1);
		hpimdb.Clicksearch();

	}

	@Then("^collect the country of origin details$")
	public void collect_the_country_of_origin_details() throws Throwable {

		C1 = hpimdb.CountryofOriginDetails();
		System.out.println(C1);


	}

	@Then("^release date information$")
	public void release_date_information() throws Throwable {
		hpimdb.Clickonreleaseinfolink();
		Thread.sleep(2000);
		rip = new ReleaseInfoEdge(driver);
		rip.landedonreleaseinfopage();
		D1 = rip.indiareleasedateinformation();
		System.out.println(D1);


	}
	@Then("^Close the IMDB Browser$")
	public void close_the_IMDB_Browser() throws Throwable {
		closeBrowser();
	}
	@When("^user search for movie in wikisite \"([^\"]*)\"$")
	public void user_search_for_movie_in_wikisite(String arg2) throws Throwable {

		hp = new Homepage(driver);
		hp.EnterMoviewName(arg2);
		hp.Clicksearch();
	}

	@Then("^collect the country of origin details in wiki$")
	public void collect_the_country_of_origin_details_in_wiki() throws Throwable {

		C2 = hp.CountryofOriginDetailsofWiki();
		System.out.println(C2);

	}

	@Then("^release date information details in wiki$")
	public void release_date_information_details_in_wiki() throws Throwable {

		D2 = hp.ReleasedateinfoWiki();
		System.out.println(D2);

	}
	@Then("^Close the wiki Browser$")
	public void close_the_wiki_Browser() throws Throwable {
		closeBrowser();
	}
	@Given("^Compare the both information details from IMDB and Wiki Site$")
	public void compare_the_both_information_details_from_IMDB_and_Wiki_Site() throws Throwable {

		if (C1.equals(C2))
		{
			System.out.println("Country of Origin are matched");
		}
		else
		{
			System.out.println("Country of Origin are not matched");
		}
		if (D1.equals(D2))
		{
			System.out.println("Release dates are matched");
		}
		else
		{
			System.out.println("Release dates are not matched");
		}
	}
}






