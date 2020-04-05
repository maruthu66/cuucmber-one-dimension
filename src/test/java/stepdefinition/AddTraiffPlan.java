package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddTraifPlanPage;
import objectrepository.Homepage;
import resources.FunctionalLibrary;

public class AddTraiffPlan extends FunctionalLibrary {
	FunctionalLibrary f = new FunctionalLibrary();
    Homepage hp = new Homepage();
    AddTraifPlanPage tp = new AddTraifPlanPage();
	
	@Given("User click on add tariff button")
	public void user_click_on_add_tariff_button() throws Throwable {
		handleFrame();
		f.button(hp.getAddTariffBtn());
		}
	@When("User enters tariff plan fields")
	public void user_enters_tariff_plan_fields() throws Throwable {
     handleFrame();
		
	   f.insertText(tp.getMonRen(), "100");
	   f.insertText(tp.getLocMin(), "200");
	   f.insertText(tp.getIntMin(), "300");
	   f.insertText(tp.getMsg(), "400");
	   f.insertText(tp.getLocRs(), "1");
	   f.insertText(tp.getIntRs(), "2");
	   f.insertText(tp.getMsgRs(), "1");
	}
	

	@When("User enters tariff plan fields with two dim list")
	public void user_enters_tariff_plan_fields_with_two_dim_list(DataTable dataTable) throws Throwable {
		handleFrame();
		List<List<String>> data = dataTable.asLists(String.class);
		f.insertText(tp.getMonRen(), data.get(0).get(0));
		   f.insertText(tp.getLocMin(), data.get(0).get(1));
		   f.insertText(tp.getIntMin(), data.get(0).get(2));
		   f.insertText(tp.getMsg(), data.get(1).get(3));
		   f.insertText(tp.getLocRs(), data.get(1).get(4));
		   f.insertText(tp.getIntRs(), data.get(0).get(5));
		   f.insertText(tp.getMsgRs(), data.get(1).get(6));
		 
	}
	@When("User enters tariff plan fields with two dim map")
	public void user_enters_tariff_plan_fields_with_two_dim_map(DataTable dataTable) throws Throwable {
		handleFrame();
List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
f.insertText(tp.getMonRen(), data.get(0).get("MonRen"));
f.insertText(tp.getLocMin(), data.get(0).get("LocMin"));
f.insertText(tp.getIntMin(), data.get(1).get("IntMin"));
f.insertText(tp.getMsg(), data.get(0).get("Msg"));
f.insertText(tp.getLocRs(), data.get(1).get("LocRs"));
f.insertText(tp.getIntRs(), data.get(0).get("IntRs"));
f.insertText(tp.getMsgRs(), data.get(1).get("MsgRs"));
		}
	@When("User enters tariff plan fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_tariff_plan_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws Throwable {
		handleFrame();
		f.insertText(tp.getMonRen(), string);
		   f.insertText(tp.getLocMin(), string2);
		   f.insertText(tp.getIntMin(), string3);
		   f.insertText(tp.getMsg(), string4);
		   f.insertText(tp.getLocRs(), string5);
		   f.insertText(tp.getIntRs(), string6);
		   f.insertText(tp.getMsgRs(), string7);	  

	}

   @When("User click on tariff submit button")
	public void user_click_on_tariff_submit_button() {
		f.button(tp.getTarsubBtn());
		}

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
