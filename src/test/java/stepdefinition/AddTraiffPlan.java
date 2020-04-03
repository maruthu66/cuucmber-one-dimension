package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTraiffPlan {
	static WebDriver driver;
	@Given("User launch demo telecom site")
	public void user_launch_demo_telecom_site() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruthu\\eclipse-workspace\\cucmber\\src\\main\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		
	}

	@Given("User click on add tariff button")
	public void user_click_on_add_tariff_button() throws Throwable {
		handleFrame();
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		}

	@When("User enters tariff plan fields with two dim list")
	public void user_enters_tariff_plan_fields_with_two_dim_list(DataTable dataTable) throws Throwable {
		handleFrame();
		List<List<String>> data = dataTable.asLists(String.class);
		driver.findElement(By.name("rental")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("local_minutes")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("inter_minutes")).sendKeys(data.get(0).get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(data.get(0).get(3));
		driver.findElement(By.name("minutes_charges")).sendKeys(data.get(0).get(4));
		driver.findElement(By.name("inter_charges")).sendKeys(data.get(0).get(5));
		driver.findElement(By.name("sms_charges")).sendKeys(data.get(0).get(6));
	   
	}
	@When("User enters tariff plan fields with two dim map")
	public void user_enters_tariff_plan_fields_with_two_dim_map(DataTable dataTable) throws Throwable {
		handleFrame();
List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.name("rental")).sendKeys(data.get(3).get("MR"));
		driver.findElement(By.name("local_minutes")).sendKeys(data.get(2).get("FLM"));
		driver.findElement(By.name("inter_minutes")).sendKeys(data.get(3).get("FIM"));
		driver.findElement(By.name("sms_pack")).sendKeys(data.get(2).get("FSP"));
		driver.findElement(By.name("minutes_charges")).sendKeys(data.get(2).get("LMC"));
		driver.findElement(By.name("inter_charges")).sendKeys(data.get(2).get("IMC"));
		driver.findElement(By.name("sms_charges")).sendKeys(data.get(2).get("SMC"));
		}
	@When("User enters tariff plan fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_tariff_plan_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws Throwable {
		handleFrame();
		driver.findElement(By.name("rental")).sendKeys(string);
		driver.findElement(By.name("local_minutes")).sendKeys(string2);
		driver.findElement(By.name("inter_minutes")).sendKeys(string3);
		driver.findElement(By.name("sms_pack")).sendKeys(string4);
		driver.findElement(By.name("minutes_charges")).sendKeys(string5);
		driver.findElement(By.name("inter_charges")).sendKeys(string6);
		driver.findElement(By.name("sms_charges")).sendKeys(string7);
		
	}




	@When("User click on tariff submit button")
	public void user_click_on_tariff_submit_button() {
		driver.findElement(By.xpath("//input[@value='submit']")).click();	}

	@Then("User should be received congratulation message")
	public void user_should_be_received_congratulation_message() throws Throwable {
		handleFrame();
	   WebElement text = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	String text2 = text.getText();
	System.out.println(text2);
	}
	public void handleFrame() throws Throwable {
		 Thread.sleep(3000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 driver.findElement(By.id("closeBtn")).click();
		 driver.switchTo().parentFrame();

	}


}
