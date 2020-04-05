package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddCustomerPage;
import objectrepository.Homepage;
import resources.FunctionalLibrary;

public class AddCoustomer  extends FunctionalLibrary {

    FunctionalLibrary f = new FunctionalLibrary();
    Homepage hp = new Homepage();
    AddCustomerPage cp = new AddCustomerPage();

    @Given("User clic on and add coustomer button")
    public void user_clic_on_and_add_coustomer_button() throws Throwable {
    	try{
    		handleFrame();
    		}catch(Exception e){
    			
    		}

    	       f.button(hp.getAddCustomerBtn());
    }

@When("User enter all the fields")
public void user_enter_all_the_fields() throws Throwable {
	try{
		handleFrame();
		}catch(Exception e){
			
		}
		
	    f.button(cp.getDoneBtn());
	    f.insertText(cp.getFname(), "maruthu");
	    f.insertText(cp.getLname(), "pandi");
	    f.insertText(cp.getEmail(), "pandi@gmail.com");
	    f.insertText(cp.getAddress(), "tirunelveli town");
	    f.insertText(cp.getPhno(), "1223334444");
		
}

@When("User click on submit button")
public void user_click_on_submit_button() {
	f.button(cp.getSubmitBtn());
}

@Then("User should be displayed coustomer ID or not")
public void user_should_be_displayed_coustomer_ID_or_not() throws Throwable {
	try{
		handleFrame();
		}catch(Exception e){
			
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
}

@When("User enter all the fields with one dimesional")
public void user_enter_all_the_fields_with_one_dimesional(DataTable dataTable) throws Throwable {
	List<String> data = dataTable.asList(String.class);
	try{
		handleFrame();
		}catch(Exception e){
			
		}
	
	 f.button(cp.getDoneBtn());
	   f.insertText(cp.getFname(), data.get(0));
	    f.insertText(cp.getLname(), data.get(1));
	    f.insertText(cp.getEmail(), data.get(2));
	    f.insertText(cp.getAddress(), data.get(3));
	    f.insertText(cp.getPhno(), data.get(4));	
		
    throw new cucumber.api.PendingException();
}



@When("User enter all the fields with one dimesional map")
public void user_enter_all_the_fields_with_one_dimesional_map(DataTable dataTab) throws Throwable {
	try{
		handleFrame();
		}catch(Exception e){
			
		}
	Map<String, String> data = dataTab.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("Email"));
		driver.findElement(By.name("addr")).sendKeys(data.get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("phno"));
	
   }
public void handleFrame() throws Throwable {
	 Thread.sleep(3000);
	 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
	 driver.findElement(By.id("closeBtn")).click();
	 driver.switchTo().parentFrame();

}

	
	
	}