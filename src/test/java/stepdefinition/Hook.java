package stepdefinition;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.FunctionalLibrary;

public class Hook extends FunctionalLibrary{

	FunctionalLibrary f = new FunctionalLibrary();
	

	@Before
	public void beforeScnerio() throws Throwable {
		f.launch("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}
	@After
	public void afterScenrio() {
		driver.quit();
	}

}
