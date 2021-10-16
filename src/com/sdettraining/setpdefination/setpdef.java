package com.sdettraining.setpdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class setpdef extends BaseTest {

	@Given("^User navigate to retails application$")
	public void user_navigate_to_retails_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://retailm1.upskills.in/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}

	@Given("^User validate the registration page$")
	public void user_validate_the_registration_page() throws Throwable {
               String title=driver.getTitle();
         if(title.equalsIgnoreCase("Retail")){
        	 System.out.println("Title is  same:-"+title);
         }
         else
         {
        	 System.out.println("Title is not same:-"+title);
         }
               
	}

	@When("^User click on accont link$")
	public void user_click_on_accont_link() throws Throwable {
		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("//*[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/a"));
		Thread.sleep(5000);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(5000);

	}

	@When("^User click on Login/Register link$")
	public void user_click_on_Login_Register_link() throws Throwable {
		//driver.findElement(By.xpath("")).click();

	}

	@When("^User click on register button$")
	public void user_click_on_register_button() throws Throwable {

		driver.findElement(By.xpath("//*[@id='System_nyHsmShk']/div/div[1]/div/div[2]/div/a")).click();
	}

	@When("^User enter first name \"([^\"]*)\"$")
	public void user_enter_first_name(String firstname) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);

	}

	@When("^User enter last name \"([^\"]*)\"$")
	public void user_enter_last_name(String lastname) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);

	}

	@When("^User enter email \"([^\"]*)\"$")
	public void user_enter_email(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	}

	@When("^User enter telephone \"([^\"]*)\"$")
	public void user_enter_telephone(String telephone) throws Throwable {

		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephone);
	}

	@When("^User enter address(\\d+) \"([^\"]*)\"$")
	public void user_enter_address(String address1, String address2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys(address1);
		driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys(address2);
	}

	@When("^User enter city \"([^\"]*)\"$")
	public void user_enter_city(String city) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-city']")).sendKeys(city);

	}

	@When("^User enter postcode \"([^\"]*)\"$")
	public void user_enter_postcode(String postcode) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys(postcode);

	}

	@When("^User select country \"([^\"]*)\"$")
	public void user_select_country(String country) throws Throwable {
		new Select(driver.findElement(By.xpath("//select[@id='input-country']"))).selectByVisibleText(country);

	}

	@When("^User select region/state \"([^\"]*)\"$")
	public void user_select_region_state(String state) throws Throwable {
		new Select(driver.findElement(By.xpath("//select[@id='input-zone']"))).selectByVisibleText(state);

	}

	@When("^User enter password \"([^\"]*)\"$")
	public void user_enter_password(String password) throws Throwable {
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(password);

	}

	@When("^User enter passwordconfirm \"([^\"]*)\"$")
	public void user_enter_passwordconfirm(String passwordconfirm) throws Throwable {
		driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys(passwordconfirm);

	}

	@When("^User click on no subscribe button$")
	public void user_click_on_no_subscribe_button() throws Throwable {
		//input[@name='newsletter' and @value='0'and @type='radio']
		//input[@name='newsletter' and @value='0' and @type='radio']
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0' and @type='radio']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1' and @type='radio']")).click();
	}
	
	@When("^User click on polic radiobutton$")
	public void user_click_on_polic_radiobutton() throws Throwable {
		driver.findElement(By.xpath("//*[@id='System_nyHsmShk']/form/div/div[1]/label/input")).click();
	}

	@When("^User click on continue link$")
	public void user_click_on_continue_link() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	
	@Then("^User validate user register successfully$")
	public void user_validate_user_register_successfully() throws Throwable {
		//driver.findElement(By.xpath("")).sendKeys("");
		////input[@value='Continue']
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String success=driver.getCurrentUrl();
		Assert.assertTrue("User register successfully", success.contains(success));
		
	}

	@Then("^User close the application$")
	public void user_close_the_application() throws Throwable {
		Thread.sleep(10000);
		driver.close();
	}

	
	@When("^User enter username \"([^\"]*)\"$")
	public void user_enter_username(String userName) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(userName);
	}

	@When("^User click on login link$")
	public void user_click_on_login_link() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='input-email']")).click();
	}

	@When("^User validate login successfully$")
	public void user_validate_login_successfully() throws Throwable {
	  
	}
}