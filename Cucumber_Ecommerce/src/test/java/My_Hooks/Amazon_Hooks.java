package My_Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Amazon_Hooks
{
	@Before("@Smoke")
	public void LaunchBrowser(Scenario sc)
	{
		System.out.println("Browser Chrome Launch");
		System.out.println(sc.getName());
		sc.getStatus();
	}
	
//	@Before(order=2)
//	public void LaunchBrowserFirefox()
//	{
//		System.out.println("Browser Firefox Launch");
//	}
//	
//	@After(order=2)
//	public void CloseBrowser(Scenario sc)
//	{
//		System.out.println("Close Browser Chrome");
//		System.out.println(sc.getName());
//		sc.getStatus();
//	}
	
	@After("@Smoke")
	public void CloseBrowseFirfoxr(Scenario sc)
	{
		System.out.println("Close Browser firefox");
		System.out.println(sc.getName());
		
	}
	
	


}
