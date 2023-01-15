package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	
	@Before(order = 0)
	public void setup_1()
	{
		
		System.out.println("open browser 1");
		
	}
	
	@Before( value =  "@sanity" , order = 1)
	public void setup_2()
	{
		
		System.out.println("open browser 2");
		
	}
	
	@After(order = 1)
	public void teardown_1()
	{
		
		System.out.println("close browser 1");
		
	}
	
	
	
	@After(order = 0)
	public void teardown_2()
	{
		
		System.out.println("close browser 2");
		
	}
	
	
}






