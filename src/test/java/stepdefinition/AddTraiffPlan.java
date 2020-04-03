package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTraiffPlan {
	
	@Given("User click on add tariff button")
	public void user_click_on_add_tariff_button() throws Throwable {
		handleFrame();
		Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		}
	@When("User enters tariff plan fields")
	public void user_enters_tariff_plan_fields() throws Throwable {
     handleFrame();
		
		Hook.driver.findElement(By.name("rental")).sendKeys("400");
		Hook.driver.findElement(By.name("local_minutes")).sendKeys("300");
		Hook.driver.findElement(By.name("inter_minutes")).sendKeys("200");
		Hook.driver.findElement(By.name("sms_pack")).sendKeys("100");
		Hook.driver.findElement(By.name("minutes_charges")).sendKeys("3");
		Hook.driver.findElement(By.name("inter_charges")).sendKeys("2");
		Hook.driver.findElement(By.name("sms_charges")).sendKeys("1");
	 	
	}
	

	@When("User enters tariff plan fields with two dim list")
	public void user_enters_tariff_plan_fields_with_two_dim_list(DataTable dataTable) throws Throwable {
		handleFrame();
		List<List<String>> data = dataTable.asLists(String.class);
		Hook.driver.findElement(By.name("rental")).sendKeys(data.get(0).get(0));
		Hook.driver.findElement(By.name("local_minutes")).sendKeys(data.get(0).get(1));
		Hook.driver.findElement(By.name("inter_minutes")).sendKeys(data.get(0).get(2));
		Hook.driver.findElement(By.name("sms_pack")).sendKeys(data.get(0).get(3));
		Hook.driver.findElement(By.name("minutes_charges")).sendKeys(data.get(0).get(4));
		Hook.driver.findElement(By.name("inter_charges")).sendKeys(data.get(0).get(5));
		Hook.driver.findElement(By.name("sms_charges")).sendKeys(data.get(0).get(6));
	   
	}
	@When("User enters tariff plan fields with two dim map")
	public void user_enters_tariff_plan_fields_with_two_dim_map(DataTable dataTable) throws Throwable {
		handleFrame();
List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
		Hook.driver.findElement(By.name("rental")).sendKeys(data.get(3).get("MR"));
		Hook.driver.findElement(By.name("local_minutes")).sendKeys(data.get(2).get("FLM"));
		Hook.driver.findElement(By.name("inter_minutes")).sendKeys(data.get(3).get("FIM"));
		Hook.driver.findElement(By.name("sms_pack")).sendKeys(data.get(2).get("FSP"));
		Hook.driver.findElement(By.name("minutes_charges")).sendKeys(data.get(2).get("LMC"));
		Hook.driver.findElement(By.name("inter_charges")).sendKeys(data.get(2).get("IMC"));
		Hook.driver.findElement(By.name("sms_charges")).sendKeys(data.get(2).get("SMC"));
		}
	@When("User enters tariff plan fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_tariff_plan_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws Throwable {
		handleFrame();
		Hook.driver.findElement(By.name("rental")).sendKeys(string);
		Hook.driver.findElement(By.name("local_minutes")).sendKeys(string2);
		Hook.driver.findElement(By.name("inter_minutes")).sendKeys(string3);
		Hook.driver.findElement(By.name("sms_pack")).sendKeys(string4);
		Hook.driver.findElement(By.name("minutes_charges")).sendKeys(string5);
		Hook.driver.findElement(By.name("inter_charges")).sendKeys(string6);
		Hook.driver.findElement(By.name("sms_charges")).sendKeys(string7);
		
	}




	@When("User click on tariff submit button")
	public void user_click_on_tariff_submit_button() {
		Hook.driver.findElement(By.xpath("//input[@value='submit']")).click();	}

	@Then("User should be received congratulation message")
	public void user_should_be_received_congratulation_message() throws Throwable {
		handleFrame();
	   WebElement text = Hook.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	String text2 = text.getText();
	System.out.println(text2);
	}
	public void handleFrame() throws Throwable {
		 Thread.sleep(3000);
		 Hook.driver.switchTo().frame(Hook.driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 Hook.driver.findElement(By.id("closeBtn")).click();
		 Hook.driver.switchTo().parentFrame();

	}


}
