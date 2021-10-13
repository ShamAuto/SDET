package com.sdettraining.setpdefination;

import java.util.concurrent.TimeUnit;

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
	public void user_enter_first_name(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shameem");

	}

	@When("^User enter last name \"([^\"]*)\"$")
	public void user_enter_last_name(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Akther");

	}

	@When("^User enter email \"([^\"]*)\"$")
	public void user_enter_email(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc.gmail.com");
	}

	@When("^User enter telephone \"([^\"]*)\"$")
	public void user_enter_telephone(String arg1) throws Throwable {

		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234567899");
	}

	@When("^User enter address(\\d+) \"([^\"]*)\"$")
	public void user_enter_address(int arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys("Nagawara");

	}

	@When("^User enter city \"([^\"]*)\"$")
	public void user_enter_city(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-city']")).sendKeys("Bangalore");

	}

	@When("^User enter postcode \"([^\"]*)\"$")
	public void user_enter_postcode(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys("560045");

	}

	@When("^User select country \"([^\"]*)\"$")
	public void user_select_country(String arg1) throws Throwable {
		new Select(driver.findElement(By.xpath("//select[@id='input-country']"))).selectByVisibleText("India");

	}

	@When("^User select region/state \"([^\"]*)\"$")
	public void user_select_region_state(String arg1) throws Throwable {
		new Select(driver.findElement(By.xpath("//select[@id='input-zone']"))).selectByVisibleText("Karnataka");

	}

	@When("^User enter password \"([^\"]*)\"$")
	public void user_enter_password(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("sham@12345");

	}

	@When("^User enter passwordconfirm \"([^\"]*)\"$")
	public void user_enter_passwordconfirm(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys("sham@12345");

	}

	@When("^User click on no subscribe button$")
	public void user_click_on_no_subscribe_button() throws Throwable {

		driver.findElement(By.xpath("/input[@name='newsletter' and @value='0']")).click();
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
	}

	@Then("^User close the application$")
	public void user_close_the_application() throws Throwable {
		Thread.sleep(10000);
		driver.close();
	}

}