package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	static WebDriver driver;
	@Before
	public void beforeScnerio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruthu\\eclipse-workspace\\cucmber\\src\\main\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}
	@After
	public void afterScenrio() {
		driver.quit();
	}

}
