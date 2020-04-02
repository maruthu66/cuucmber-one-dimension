package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCoustomer {
	
	static WebDriver driver;
	@Given("User lanches demo telecomsite")
	public void user_lanches_demo_telecomsite() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruthu\\eclipse-workspace\\cucmber\\src\\main\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		   Thread.sleep(3000);
			  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
				 driver.findElement(By.xpath("//div[@id='closeBtn']")).click();;
			  driver.switchTo().parentFrame();
	  
	}

	@Given("User clic on and add coustomer button")
	public void user_clic_on_and_add_coustomer_button() throws Throwable {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		 Thread.sleep(5000);
		  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		  driver.switchTo().parentFrame();
	  
	}

	@When("User enter all the fields")
	public void user_enter_all_the_fields() {
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();;
		driver.findElement(By.id("fname")).sendKeys("maruthu");
		driver.findElement(By.id("lname")).sendKeys("pandi");
		driver.findElement(By.id("email")).sendKeys("pandi@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("tirunelveli");
		driver.findElement(By.id("telephoneno")).sendKeys("12233334444");
	   
	   }
	@When("User enter all the fields with one dimesional")
	public void user_enter_all_the_fields_with_one_dimesional(DataTable dataTable) {
      List<String> data = dataTable.asList();
      driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();;
		driver.findElement(By.id("fname")).sendKeys(data.get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(2));
		driver.findElement(By.name("addr")).sendKeys(data.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
	   
	}
	@When("User click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
	   
	}

	@Then("User should be displayed coustomer ID or not")
	public void user_should_be_displayed_coustomer_ID_or_not() throws Throwable {
		 Thread.sleep(5000);
		  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		 driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		  driver.switchTo().parentFrame();
	    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		String text = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text);
	   
	}



}
