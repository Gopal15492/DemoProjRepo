package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class MyHook {
	@Before
	public void setup(Scenario scenario) {
		System.out.println("** Execution started for scenario : "+scenario.getName());
		System.out.println("++ browser got launched and maximised");
		System.out.println("++ Application URL got Opened in browser");

	}
	@After
	public void tearDown(Scenario scenario) {
		
		System.out.println("-- Logout from  Application");
		System.out.println("--  browser got closed");
		System.out.println("** Execution ended for scenario : "+scenario.getName());

	}

}
