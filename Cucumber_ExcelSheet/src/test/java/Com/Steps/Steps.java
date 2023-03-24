package Com.Steps;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Base.pack.Launch_Browser;

import Pom.pack.Home;
import Pom.pack.Logout;
import Utility.pack.ConfigReader;
import Utility.pack.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps 
{
	WebDriver driver;
	Home log;
	Logout out;
	Launch_Browser bro;
	ConfigReader reader;
	Properties prop;
	int testId;
	
	@Before(order=1)
	public void LaunchBrowser() throws IOException
	{
		reader = new ConfigReader();
		prop = reader.init_prop();
	
	}

	@Before(order=2)
	public void LaunchBrowserChrome()
	{
		
		String browsername = prop.getProperty("browser");
		bro = new Launch_Browser();
		driver=bro.openchromebrowser(browsername);
		driver.get("https://www.facebook.com/login");
		
		
	}
	@Given("user is on Facebook Lgin page")
	public void user_is_on_facebook_lgin_page() 
	{
         testId=01;
		
		
		String hk=driver.getCurrentUrl();
		System.out.println(hk);
		
		String pk=driver.getTitle();
		System.out.println(pk);
	    
	    
	}

	@When("user fills username field with sheetname {string} and rownumber {int}")
	public void user_fills_username_field_with_sheetname_and_rownumber(String Sheetname, int Row) throws EncryptedDocumentException, IOException 
	{
		 int coloumn=0;
		testId=02;
		String Username=Utility.excelsheet(Row,coloumn);
		Home log=new Home(driver);
		log.sendusername(Username);
	}

	@When("user fills password field with sheetname {string} and rownumber {int}")
	public void user_fills_password_field_with_sheetname_and_rownumber(String Sheetname,int Row) throws EncryptedDocumentException, IOException 
	{
		 int coloumn=1;
		testId=03;
		String Password=Utility.excelsheet(Row,coloumn);
		Home log=new Home(driver);
		log.sendpassword(Password);
	}

	@When("user click on Facebook login button")
	public void user_click_on_facebook_login_button() 
	{
		testId=04;
		Home log=new Home(driver);
		log.clickonlogin();
	    
	}

	@Then("user should be navigate to Facebbok Login HomePage")
	public void user_should_be_navigate_to_facebbok_login_home_page()
	{
        testId=05;
		
		String gk=driver.getCurrentUrl();
		System.out.println(gk);
		
		String lk=driver.getTitle();
		System.out.println(lk);
	    
	}
	
	@After(order=2)
	public void CloseBrowser(Scenario sc)
	{
		
		Logout out=new Logout(driver);
		
		out.accountname();
		out.clickonlogout();
		
	}
	
	@After(order=1)
	public void CloseBrowseFirfoxr(Scenario sc) throws IOException
	{
		if(sc.isFailed()) 
		{
		
			Utility.screen(driver,testId);
		}
		driver.quit();
		

}

}
